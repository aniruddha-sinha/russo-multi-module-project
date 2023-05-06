package com.aniruddha.russo.controller;

import com.aniruddha.russo.model.Joke;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class JokeAPIRequestorController {

    @Value("${joke_url}")
    private String url;

    @GetMapping("/request-random-joke")
    public ResponseEntity<Joke> requestJoke(@RequestHeader("x-forwarded-client-cert") String xfcc) {
        RestTemplate restTemplate = new RestTemplate();
        Joke aJoke = restTemplate.getForObject(url+"random_joke", Joke.class);
        System.out.println("x-forwarded-client-cert:"+ xfcc);
        return ResponseEntity.ok(aJoke);
    }
}
