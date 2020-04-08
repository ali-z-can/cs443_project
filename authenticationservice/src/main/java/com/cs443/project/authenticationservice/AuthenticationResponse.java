package com.cs443.project.authenticationservice;

public class AuthenticationResponse {

    private final String jtw;

    public String getJtw() {
        return jtw;
    }

    public AuthenticationResponse(String jtw) {
        this.jtw = jtw;
    }
}
