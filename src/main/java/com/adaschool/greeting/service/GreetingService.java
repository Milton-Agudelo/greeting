package com.adaschool.greeting.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {
    @Override
    public String greeting() {
        return "Milton Agudelo!";
    }
}
