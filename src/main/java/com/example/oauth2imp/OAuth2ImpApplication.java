package com.example.oauth2imp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class OAuth2ImpApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ImpApplication.class, args);
    }
@GetMapping("/")
    public String Message(){
        return "Hello!!!!!!!!!";
}
}
