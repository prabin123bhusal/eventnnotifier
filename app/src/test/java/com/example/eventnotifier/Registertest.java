package com.example.eventnotifier;

import com.example.eventnotifier.BLL.LoginBLL;
import com.example.eventnotifier.BLL.RegisterBLL;
import com.example.eventnotifier.Model.User;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Registertest {
    @Test
    public void testRegister(){
        RegisterBLL registerBLL = new RegisterBLL();
        User user = new User("m","m", "m", "ma"
                , "m","m");

        boolean result = registerBLL.registerUser(user);
        assertEquals(true, result);
    }
}
