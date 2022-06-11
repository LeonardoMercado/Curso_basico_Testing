package com.leonardo.javatests.util;

public class StringUtil {
    public static String repeat(String str,int times){
        String resultado = "";
        for (int i = 0; i < times; i++) {
            resultado += str + "|";
        }
        return resultado;
    }
}
