package br.com.jwt.service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;

import br.com.jwt.model.user.UserModel;

@Service
public class TokenService {
    @Value("${api.security.token.secret}")
    private String secretKey;


    public String generateToken(UserModel user) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secretKey);
            String token = JWT.create()
                    .withIssuer("auth-api")
                    .withSubject(user.getLogin())
                    .withExpiresAt(tokenExpiration())
                    .sign(algorithm);
                
            return token;
        } catch (JWTCreationException e) {
            throw new RuntimeException("Erro while generating token: " + e);
        }
    }


    public String validateToken(String token){
        try {
            Algorithm algorithm = Algorithm.HMAC256(secretKey);
            return JWT.require(algorithm)
                    .withIssuer("auth-api")
                    .build()
                    .verify(token)
                    .getSubject();
        } catch (JWTVerificationException e) {
            return "";
        }
    }    

    private Instant tokenExpiration(){
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }
}
