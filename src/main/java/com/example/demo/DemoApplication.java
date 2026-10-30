package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Hello from Java Docker Deployment!";
    }

    @GetMapping("/health")
    public String health() {
        return "Java application is healthy";
    }

    @GetMapping("/users")
    public String users() {
        return "List of users";
    }

    @GetMapping("/users/{id}")
    public String getUser(@PathVariable int id) {
        return "User ID: " + id;
    }

    @PostMapping("/users")
    public String createUser(@RequestBody String user) {
        return "User created: " + user;
    }

    @PutMapping("/users/{id}")
    public String updateUser(@PathVariable int id,
                             @RequestBody String user) {
        return "User updated: " + id;
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {
        return "User deleted: " + id;
    }
}
