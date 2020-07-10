package com.indadev.rps;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class GameController {

    ArrayList<Game> games = null;

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

        Game currentGame = null;
        for (Game g: games){
            if (g.getId().equalsIgnoreCase(id)){
                g.play();
                currentGame = g;
            }
        }
        return currentGame;
    }

    @GetMapping("/game/restart")
    public Game restart(@RequestParam(value = "id", defaultValue = "") String id){

        Game currentGame = null;
        for (Game g: games){
            if (g.getId().equalsIgnoreCase(id)){
                g.plays.clear();
                g.setRounds(0);
                currentGame = g;
            }
        }
        return currentGame;
    }


}
