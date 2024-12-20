package com.example.securityjwt.config.jwt;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureAlgorithm;

@Component
public class JwtUtils {
    @Value("${jwt.secret.key}")
    private String secretKey;

    @Value("${jwt.expiration.time}")
    private String timeExpiration;
    
    public String getAccessToken(String username) {
    long now = System.currentTimeMillis();
    
    // // Crea el JWT
    // return Jwts.builder()
    //     .setClaims(new HashMap<>())  // Establecer claims personalizados, si es necesario
    //     .setSubject(username)        // Establece el sujeto
    //     .setIssuedAt(new Date(now))  // Establece la fecha de emisión
    //     .setExpiration(new Date(now + Long.parseLong(timeExpiration))) // Establece la expiración
    //     .signWith(getSignatureKey(), SignatureAlgorithm.HS256)  // Establece la firma
    //     .compact();  // Genera el token
    // }


    // public boolean isTokenValid(String token){
    //     try {
    //         Jwts.parserBuilder()
    //             .setSigningKey(getSignatureKey())
    //             .build().parseClaimsJws(token)
    //             .getBody();
    //         return true;
    //     }catch(Exception e){
    //         log.error("Token invalido, error: ".concat(e.getMessage()));
    //         return false;
    //     }
    // }

    // public Key getSignatureKey(){
    //     byte[] keyBytes = Decoders.BASE64.decode(secretKey);
    //     return Keys.hmacShaKeyFor(keyBytes);
    // }

    // public boolean isTokenExpired(String token) {
    //     Claims claims = parseToken(token); // Método para parsear el token y obtener los claims

    //     if (claims != null) {
    //         Date expiration = claims.getExpiration();
    //         return expiration.before(new Date()); // Si la fecha de expiración es anterior a la fecha actual, el token ha expirado
    //     }
    //     return false;
    // }

    // public Claims parseToken(String token) {
    //     try {
    //         return Jwts.parser()
    //             .setSigningKey(secretKey) // Establece la clave con la que firmaste el JWT
    //             .parseClaimsJws(token) // Parsear el JWT
    //             .getBody(); // Obtiene los claims del JWT
    //     } catch (SignatureException | MalformedJwtException e) {
    //         // El JWT no es válido
    //         System.out.println("El token no es válido");
    //         return null;
    //     }
    // }

}}
