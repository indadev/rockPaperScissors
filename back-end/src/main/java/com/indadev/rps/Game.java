package com.indadev.rps;

import java.util.ArrayList;

public class Game {

    private final String id;
    ArrayList<Play> plays;
    int rounds;

    public Game(String id){
        this.id = id;
        plays = new ArrayList<Play>();
    }

    public void play(){
        plays.add(new Play());
        rounds = plays.size();
    }

    @Override
    public String toString() {
        return "{'Game'{" +
                "'id'='" + id + '\'' +
                ", 'plays'=" + plays +
                "}}";
    }

    public String getId() {
        return id;
    }

    public ArrayList<Play> getPlays() {
        return plays;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
