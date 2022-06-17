package com.leonardo.javatests.discounts;

public class PriceCalculator {

    double total;


    public String getTotal(int... prices) {
        total = 0.0;
        for (int price:prices) {
            total += price;
        }
        return String.valueOf(total);
    }


    public PriceCalculator(){

    }
    public void addPrice() {
        this.total = 0.0;
    }
}
