package com.example.securityjwt.modules.auth.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.securityjwt.modules.auth.services.AuthService;

public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<TokenResponse> register(@RequestBody final RegisterRequest registerRequest){
        final TokenResponse token = authService.register(registerRequest);
        return ResponseEntity.ok(token);
    }

    @PostMapping("/login")
    public ResponseEntity<TokenResponse> authenticate(@RequestBody final LoginRequest loginRequest){
        final TokenResponse token = authService.login(loginRequest);
        return ResponseEntity.ok(token);
    }

    @PostMapping("/refresh")
    public TokenResponse refresh(@RequestHeader(HttpHeaders.AUTHORIZATION) final String refreshToken){
        return authService.refreshToken(refreshToken);
    }

}
