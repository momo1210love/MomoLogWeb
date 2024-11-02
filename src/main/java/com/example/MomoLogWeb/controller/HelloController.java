package com.example.MomoLogWeb.controller;

import com.example.MomoLogWeb.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Word!";
    }

    @GetMapping("/greeting")
    public Greeting greeting() {
        return new Greeting(counter.incrementAndGet(), "Hello, JSON");
    }
}
