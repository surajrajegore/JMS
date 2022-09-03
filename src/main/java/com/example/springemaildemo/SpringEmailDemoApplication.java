package com.example.springemaildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailDemoApplication {
    @Autowired
    private JavaEmailSenderService senderService;

    public static void main(String[] args) {
        SpringApplication.run(SpringEmailDemoApplication.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void sendEmail(){
        senderService.sendEmail("motewaraditya@gmail.com","hii first email prctice","welcome to email sender app body");
    }

}
