package com.leonardo.javatests.util;

public class StringUtil {
    public static String repeat(String str,int times){
        if(times<0){
            throw new IllegalArgumentException("No negative times pls");
        }
        String resultado = "";
        for (int i = 0; i < times; i++) {
            resultado += str + "|";
        }
        return resultado;
    }
}
