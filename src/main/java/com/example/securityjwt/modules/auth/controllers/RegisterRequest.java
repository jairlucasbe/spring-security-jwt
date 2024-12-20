package com.example.securityjwt.modules.auth.controllers;

public record RegisterRequest(
    String email,
    String password,
    String name
) {
}
