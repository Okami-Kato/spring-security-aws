package com.example.springsecurityjwt.controller;

import lombok.Data;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class GenericController {

    @GetMapping(path = "data")
    public List<Payload> getData(JwtAuthenticationToken principal) {
        return Arrays.asList(
                new Payload(1, "first"),
                new Payload(2, "second")
        );
    }


    @Data
    private static class Payload {

        private final Integer id;

        private final String message;
    }
}
