package com.leonardo.javatests.reto2;

public class FizzBuzz {

    public static String fizzBuzzCalculator(int number){
        if (number % 3 != 0 || number % 5 != 0) {
            if (number%3==0) {
                return "Fizz";
            } else if (number%5==0) {
                return "Buzz";
            }else{
                return String.valueOf(number);
            }
        } else {
            return "FizzBuzz";
        }
    }
}
