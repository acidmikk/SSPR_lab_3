package ru.ulstu.is.sbapp;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbappApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/isUppercase")
    public String isUppercase(@RequestParam(value = "flag", defaultValue = "true") Boolean flg,
                              @RequestParam(value = "string", defaultValue="Hello, World!") String str) {
        return flg ? str.toUpperCase() : str.toLowerCase();
    }
}
