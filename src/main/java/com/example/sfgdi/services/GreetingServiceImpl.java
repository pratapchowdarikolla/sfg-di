package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public GreetingServiceImpl() {
        System.out.println("I am created");
    }

    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}
