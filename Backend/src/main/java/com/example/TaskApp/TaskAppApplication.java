package com.example.TaskApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.context.annotation.ComponentScan; // ADD THIS IMPORT

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {"com.example.TaskApp", "com.example.TaskApp.security"}) // CRITICAL FIX
public class TaskAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskAppApplication.class, args);
    }

}