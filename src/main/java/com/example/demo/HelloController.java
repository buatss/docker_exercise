package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/")
public class HelloController {
    private final HelloRepository repository;

    @Autowired
    public HelloController(HelloRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<String> hello() throws SQLException {
        return ResponseEntity.ok(retrieveMessageFromDb());
    }

    private String retrieveMessageFromDb() {
        return repository.findById(1L).orElseGet(() -> new HelloEntity(0L, "Failed to retrieve from db")).getMessage();
    }
}
