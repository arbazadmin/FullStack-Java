package com.azuredemo;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    @GetMapping("/message")
    public String message() {
        return "Congrats ! your app deployed successfully on azure";
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}