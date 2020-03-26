package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

    public ConstructorGreetingServiceImpl() {
        System.out.println("I am created");
    }

    @Override
    public String sayGreeting() {
        return "Hello World! - From Constructor";
    }
}
