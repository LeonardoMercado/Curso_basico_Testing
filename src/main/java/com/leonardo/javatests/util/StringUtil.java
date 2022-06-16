package com.leonardo.javatests.util;

import com.sun.org.apache.xpath.internal.objects.XNull;

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

    public static boolean isEmpty(String str){
        try {
            if(str.length() == 0){ // Si llega un String sin nada del tipo "".
                return true;
            } else if (str.trim().length() == 0) { // Si llega un String vacío del tipo " ".
                return true;
            }else{ // En otro caso.
                return false;
            }
        }catch (NullPointerException e){ // Si se genera una excepción del tipo Null point
            return false;
        }
    }
}
