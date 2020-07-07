package com.indadev.rps;

import java.util.ArrayList;

public class Game {

    private final String id;
    ArrayList<Play> plays;

    public Game(String id){
        this.id = id;
        plays = new ArrayList<Play>();
    }

    public void play(){
        plays.add(new Play());
    }

    @Override
    public String toString() {
        return "Game{" +
                "id='" + id + '\'' +
                ", plays=" + plays +
                '}';
    }

    public String getId() {
        return id;
    }
}
