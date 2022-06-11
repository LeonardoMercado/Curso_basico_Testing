package com.leonardo.javatests.util;

public class StringUtilTest {
    public static void main(String[] args) {
        String consumo = StringUtil.repeat("leonardo",3);
        if(consumo.equals("leonardo|leonardo|leonardo|")){
            System.out.println("Test1: PASS");
        }else{
            System.out.println("Test2: FAIL");
        }
        String consumo2 = StringUtil.repeat("leonardo",5);
        if(consumo2.equals("leonardo|leonardo|leonardo|leonardo|leonardo|")){
            System.out.println("Test2: PASS");
        }else{
            System.out.println("Test2: FAIL");
        }
    }
}