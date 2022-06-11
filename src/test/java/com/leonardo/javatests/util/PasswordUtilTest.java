package com.leonardo.javatests.util;

import com.leonardo.javatests.util.PasswordUtil.SecurityLevel;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {
    private String password = "leonard";

    @Test
    public void wake_when_has_less_than_8_letters() {
        assertEquals(SecurityLevel.WEAK, PasswordUtil.assessPassword("leonard"));
    }
    @Test
    public void wake_when_has_only_letters() {
        assertEquals(SecurityLevel.WEAK, PasswordUtil.assessPassword("leonardoFabioMercadoBenitez"));
    }

    @Test
    public void medium_when_has_more_than_8_letters_and_less_than_15() {
        assertEquals(SecurityLevel.MEDIUM, PasswordUtil.assessPassword("leonard1235"));
    }

    @Test
    public void strong_when_has_more_than_15_letters() {
        assertEquals(SecurityLevel.STRONG, PasswordUtil.assessPassword("leo%&name#$\""));
    }
}