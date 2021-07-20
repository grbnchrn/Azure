package com.grbn.azure.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/")
    public String getInitialMessage(){
        return "Application deployed successfully";
    }
}
