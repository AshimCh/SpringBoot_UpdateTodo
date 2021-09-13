package com.firstweb.first.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	public boolean validateUser(String user, String password) {
        return user.equalsIgnoreCase("Ashim") && password.equals("asdf");
    }
}
