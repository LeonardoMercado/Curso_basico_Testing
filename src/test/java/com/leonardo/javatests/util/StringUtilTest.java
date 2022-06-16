package com.leonardo.javatests.util;

import org.junit.Assert;
import org.junit.Test;

import static com.leonardo.javatests.util.StringUtil.isEmpty;
import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void string_is_empty(){
        assertTrue(isEmpty(""));
    }

    @Test
    public void string_is_null(){
        assertFalse(isEmpty(null));
    }

    @Test
    public void string_is_empty_with_spaces(){
        assertTrue(isEmpty("  "));
    }

    @Test
    public void string_is_not_empty(){
        assertFalse(isEmpty("leonardo"));
    }

    /*
    @Test
    public void contiene_6_repeticiones(){
        String esperado = "leonardo|leonardo|leonardo|leonardo|leonardo|leonardo|";
        assertEquals(esperado,StringUtil.repeat("leonardo",6));
    }
    @Test
    public void contiene_3_repeticiones(){
        String esperado = "leonardo|leonardo|leonardo|";
        assertEquals(esperado,StringUtil.repeat("leonardo",3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void argumento_negativo(){
        assertEquals("leonardo",StringUtil.repeat("leonardo",-1));
    }
     */

}