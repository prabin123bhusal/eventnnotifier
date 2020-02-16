package com.example.eventnotifier;

import com.example.eventnotifier.BLL.LoginBLL;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Logintest {

    @Test
    public void testLogin(){
        LoginBLL loginBLL = new LoginBLL("dk3","12345678");
        boolean result = loginBLL.checkUser();
        assertEquals(true, result);
    }
}
