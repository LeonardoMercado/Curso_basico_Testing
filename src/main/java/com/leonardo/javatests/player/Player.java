package com.leonardo.javatests.player;

public class Player {
    private Dice dice;
    private int minNumberToWin;

    public Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

    /**
     * Función que nos indica si el jugador ha ganado o no.
     * @return boolean que indica si el jugador ha ganado o no.
     */
    public boolean play(){
        int diceNumber = dice.roll();
        System.out.println("el jugador saco: " + diceNumber);
        return diceNumber>minNumberToWin;
    }

}
