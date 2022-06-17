package com.leonardo.javatests.reto2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void return_fizz_when_number_is_divisible_by_3(){
        assertEquals("Fizz",FizzBuzz.fizzBuzzCalculator(9));
        assertEquals("Fizz",FizzBuzz.fizzBuzzCalculator(33));
        assertEquals("Fizz",FizzBuzz.fizzBuzzCalculator(1767));
    }

    @Test
    public void return_buzz_when_number_is_divisible_by_5(){
        assertEquals("Buzz",FizzBuzz.fizzBuzzCalculator(5));
        assertEquals("Buzz",FizzBuzz.fizzBuzzCalculator(50));
        assertEquals("Buzz",FizzBuzz.fizzBuzzCalculator(2945));
    }

    @Test
    public void return_fizz_buzz_when_number_is_divisible_by_3_and_5(){
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzzCalculator(15));
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzzCalculator(30));
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzzCalculator(13950));
    }

    @Test
    public void return_same_number_when_over_case(){
        assertEquals("2",FizzBuzz.fizzBuzzCalculator(2));
        assertEquals("23",FizzBuzz.fizzBuzzCalculator(23));
        assertEquals("563582",FizzBuzz.fizzBuzzCalculator(563582));
    }

}