package com.example.springcore.service;

public class MessageService {

    private final TimeService time;

    public MessageService(TimeService time) {
        this.time = time;
    }

    public String getMessage() {
        return "Hello Spring MVC!" + time.getTime();
    }
}
