package com.leonardo.javatests.player;

import java.util.Random;

public class Dice {

    private int sides; // Numeros de lados del dado a lanzar.

    public Dice(int sides){
        this.sides = sides;
    }

    /**
     * Función para lanzar los dados.
     * @return int con el número de la cara del dado.
     */
    public int roll(){
        return new Random().nextInt(sides)+1;
    }
}
