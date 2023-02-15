package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/example")
    @LogExecutionTime
    public String example() {
        // implementation details
        return "example response";
    }
}