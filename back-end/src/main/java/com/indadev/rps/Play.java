package com.indadev.rps;

import java.util.concurrent.ThreadLocalRandom;

public class Play {
    int player1 = 0;
    int player2 = 0;
    int winner = 0;
    String sPlayer1 = "";
    String sPlayer2 = "";

    public Play(){
        player1 = 1;
        player2 = ThreadLocalRandom.current().nextInt(1, 4);
        //Calculate the winner
        if (player2 == 2){
            winner = 2;
        } else if (player2 == 3){
            winner = 1;
        }else{
            winner = 0; //Draw
        }
        this.sPlayer1 = translate(player1);
        this.sPlayer2 = translate(player2);
    }

    /*
    translate
    1 -> Rock
    2 -> Paper
    3 -> Scissor
     */
    public String translate(int hand){
        if (hand == 1){
            return "Rock";
        }else if (hand == 2){
            return "Paper";
        }else{
            return "Scissor";
        }
    }

    public String getWinner(){
        if (winner == 1){
            return "Player 1";
        }else if (winner == 2){
            return "Player 2";
        }else{
            return "Draw";
        }
    }

    @Override
    public String toString() {
        return "'Play'{" +
                "'player1'=" + translate(player1) +
                ", 'player2'=" + translate(player2) +
                ", 'winner'=" + getWinner() +
                '}';
    }

    public int getPlayer1() {
        return player1;
    }

    public void setPlayer1(int player1) {
        this.player1 = player1;
    }

    public int getPlayer2() {
        return player2;
    }

    public void setPlayer2(int player2) {
        this.player2 = player2;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public String getsPlayer1() {
        return sPlayer1;
    }

    public String getsPlayer2() {
        return sPlayer2;
    }
}
