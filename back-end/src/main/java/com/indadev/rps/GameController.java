package com.indadev.rps;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GameController {

    Game currentGame = null;

    @GetMapping("/game/new")
    public String createNewGame(){
        //Generate game id
        String generatedString = RandomStringUtils.randomAlphanumeric(10);

        currentGame = new Game(generatedString);
        return "New game id " + generatedString;
    }

    @GetMapping("/game")
    public Game gameStatus(){
        return currentGame;
    }

    @GetMapping("/game/play")
    public Game playGame(){
        currentGame.play();
        return currentGame;
    }
}
