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
        }else if(password.length()>=8 && password.length()<15){
            return SecurityLevel.MEDIUM;
        }else if(password.length()>=15){
            return SecurityLevel.STRONG;
        }else {
            return null;
        }
    }
}
