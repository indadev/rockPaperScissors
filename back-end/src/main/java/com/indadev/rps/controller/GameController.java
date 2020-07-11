package com.indadev.rps.controller;

import com.indadev.rps.model.Game;
import com.indadev.rps.model.Totals;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class GameController {

    ArrayList<Game> games = null;
    Totals totals = new Totals();

    @GetMapping("/game/new")
    public Game createNewGame(){
        //Generate game id
        String generatedString = RandomStringUtils.randomAlphanumeric(10);

        if (games == null){
            games = new ArrayList<Game>();
        }
        Game currectGame = new Game(generatedString);
        games.add(currectGame);
        return currectGame;
    }

    @GetMapping("/game")
    public String gameStatus(){

        return games.toString();
    }

    @GetMapping("/game/play")
    public Game playGame(@RequestParam(value = "id", defaultValue = "") String id){
        int winner = -1;
        Game currentGame = null;
        for (Game g: games){
            if (g.getId().equalsIgnoreCase(id)){
                winner = g.play();
                currentGame = g;
            }
        }

        //Increase totals
        totals.setRounds(totals.getRounds() + 1);
        if (winner == 1){
            totals.setPlayer1Wins(totals.getPlayer1Wins() + 1);
        }else if (winner == 2){
            totals.setPlayer2Wins(totals.getPlayer2Wins() + 1);
        }else if (winner == 0){
            totals.setDraws(totals.getDraws() + 1);
        }
        return currentGame;
    }

    @GetMapping("/game/restart")
    public Game restart(@RequestParam(value = "id", defaultValue = "") String id){

        Game currentGame = null;
        for (Game g: games){
            if (g.getId().equalsIgnoreCase(id)){
                g.getPlays().clear();
                g.setRounds(0);
                currentGame = g;
            }
        }
        return currentGame;
    }

    @GetMapping("/game/totals")
    public Totals totals(){

        return totals;
    }

}
