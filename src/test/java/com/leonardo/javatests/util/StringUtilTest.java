package com.leonardo.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void contiene_6_repeticiones(){
        String esperado = "leonardo|leonardo|leonardo|leonardo|leonardo|leonardo|";
        assertEquals(esperado,StringUtil.repeat("leonardo",6));
    }
    @Test
    public void contiene_3_repeticiones(){
        String esperado = "leonardo|leonardo|leonardo|";
        assertEquals(esperado,StringUtil.repeat("leonardo",4));
    }

}