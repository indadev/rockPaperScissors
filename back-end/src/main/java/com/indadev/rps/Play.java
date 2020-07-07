package com.indadev.rps;

import java.util.concurrent.ThreadLocalRandom;

public class Play {
    int player1 = 0;
    int player2 = 0;
    int winner = 0;

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
        return "Play{" +
                "player1=" + translate(player1) +
                ", player2=" + translate(player2) +
                ", winner=" + getWinner() +
                '}';
    }

    /*
    public String toString(){
        String ret;
        String winner;

        ret = translate(player1) + " " + translate(player2) + " Winner: " + getWinner();

        return ret;
    }

 */
}
