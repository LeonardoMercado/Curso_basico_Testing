package com.leonardo.javatests.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void lose_when_dice_number_is_too_low(){
        Dice dice = Mockito.mock(Dice.class); // Dado Simulado
        Mockito.when(dice.roll()).thenReturn(2); // Simulando el método roll con un retorno fijo
        Player player = new Player(dice, 4);
        assertFalse(player.play());
    }

    @Test
    public void win_when_dice_number_is_higtter() {
        Dice dice = Mockito.mock(Dice.class); // Dado Simulado
        Mockito.when(dice.roll()).thenReturn(4); // Simulando el método roll con un retorno fijo
        Player player = new Player(dice, 2);
        assertTrue(player.play());
    }
}