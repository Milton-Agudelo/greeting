package com.adaschool.greeting.controller;

import com.adaschool.greeting.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/greeting/")
public class GreetingController {

    private final IGreetingService iGreetingService;

    public GreetingController(@Autowired IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    @GetMapping
    public ResponseEntity<String> greeting() {
        return ResponseEntity.status(HttpStatus.OK).body(iGreetingService.greeting());
    }
}
