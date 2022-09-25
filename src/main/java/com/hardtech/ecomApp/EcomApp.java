package com.hardtech.ecomApp;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class EcomApp {

    public static void main(String[] args) {
        SpringApplication.run(EcomApp.class, args);
    }

}

@Configuration
class KeycloackConfig {

    @Bean
    KeycloakSpringBootConfigResolver configResolver() {
        return new KeycloakSpringBootConfigResolver();
    }

}