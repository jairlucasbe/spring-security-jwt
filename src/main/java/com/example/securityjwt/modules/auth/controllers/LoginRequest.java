package com.example.securityjwt.modules.auth.controllers;

public record LoginRequest(
    String email,
    String password
) {
}
