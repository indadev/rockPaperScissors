package com.indadev.rps;

public class Totals {

    int rounds = 0;
    int player1Wins = 0;
    int player2Wins = 0;
    int draws = 0;

    public Totals(){

    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getPlayer1Wins() {
        return player1Wins;
    }

    public void setPlayer1Wins(int player1Wins) {
        this.player1Wins = player1Wins;
    }

    public int getPlayer2Wins() {
        return player2Wins;
    }

    public void setPlayer2Wins(int player2Wins) {
        this.player2Wins = player2Wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }
}
