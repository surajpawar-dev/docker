package com.suraj.welcome_api.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    private final Environment environment;

    public WelcomeController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/welcome")
    public String welcome() {
        String port = environment.getProperty("local.server.port");
        return "Welcome, Suraj! Your server is running on port " + port;
    }
}
