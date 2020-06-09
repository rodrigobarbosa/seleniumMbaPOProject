package com.thiago.teste;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.thiago.core.InvokedMethodListener;
import com.thiago.page.PageGuruLogin;

@Listeners(InvokedMethodListener.class)
public class GuruLoginTest {

	final String URL = "http://demo.guru99.com/test/login.html";
	
    @Test
    public void testLoginPage() throws Exception {
    	new PageGuruLogin().openPage(PageGuruLogin.class, URL).acessarNoGuru("rodrigo.barba.88@gmail.com", "password");
    }
}
