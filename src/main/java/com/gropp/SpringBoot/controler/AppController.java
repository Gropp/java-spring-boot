package com.gropp.SpringBoot.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class AppController {
    @Value("${app.message}")
    private String appMessage;

    @GetMapping("/")
    public String getAppMessage(){
     return appMessage;
    }
}
