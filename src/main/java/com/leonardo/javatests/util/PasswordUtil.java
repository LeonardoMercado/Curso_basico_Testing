package com.leonardo.javatests.util;



public class PasswordUtil {

    public enum SecurityLevel{
        WEAK,
        MEDIUM,
        STRONG
    }

    public static SecurityLevel assessPassword(String password){
        if(password.length()<8){
            return SecurityLevel.WEAK;
        }else if(password.matches("[a-zA-Z]+")){ // Si el password solo contiene letras.
            return SecurityLevel.WEAK;
        }else if(password.matches("[a-zA-Z0-9]+") && password.length()>=8 && password.length()<12){ // Si el password tiene letras con numeros y es tiene más de 8 letras pero menos de 12
            return SecurityLevel.MEDIUM;
        }else if(password.matches("([a-zA-Z0-9\\%\\&\\#\\\"\\$])+") && password.length()>=12){ // Si el password tiene letras y numeros y caracteres especiales y tiene más de 12 caracteres
            return SecurityLevel.STRONG;
        }else {
            return null;
        }
    }
}
