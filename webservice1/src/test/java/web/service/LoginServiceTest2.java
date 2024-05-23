package web.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginServiceTest2 {
	@Test
    public void testLoginValid() {
        // Test with valid username, password, and DOB
        assertTrue(LoginService.login("ahsan", "ahsan_pass", "1995-01-01"));
    }

    @Test
    public void testUsernameInvalid() {
        // Test with invalid username
        assertFalse(LoginService.login("invalid_username", "ahsan_pass", "1995-01-01"));
    }

    @Test
    public void testPasswordInvalid() {
        // Test with invalid password
        assertFalse(LoginService.login("ahsan", "invalid_password", "1995-01-01"));
    }

    @Test
    public void testDOBInvalid() {
        // Test with invalid DOB
        assertFalse(LoginService.login("ahsan", "ahsan_pass", "2025-01-01"));
    }

    @Test
    public void testAgeUnderEighteenUser() {
        // Test with age under user
        assertFalse(LoginService.login("ahsan", "ahsan_pass", "2010-01-01"));
    }


}
