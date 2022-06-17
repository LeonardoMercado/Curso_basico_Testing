package com.leonardo.javatests.discounts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {

    @Test
    public void total_zero_when_there_are_not_prices() {
        PriceCalculator calculator = new PriceCalculator();
        assertEquals("0.0",calculator.getTotal());
    }

    @Test
    public void total_is_the_sum_of_prices() {
        PriceCalculator calculator = new PriceCalculator();
        assertEquals("45.0",calculator.getTotal(1,2,3,4,5,6,7,8,9));
        assertEquals("77.0",calculator.getTotal(28,49));
        assertEquals("677100.0",calculator.getTotal(678312,-1212));
    }
}