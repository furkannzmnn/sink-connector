package com.metro.metrosearchapp.dto;


public record LoginRequest(String username, String password) {
    private static final String USER_NAME = "admin";
    private static final String PASSWORD = "admin";

    public boolean isValid() {
        return USER_NAME.equals(username) && PASSWORD.equals(password);
    }

}
