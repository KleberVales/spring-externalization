package com.example.springcore.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {

    @Value("${app.message}")
    private String message;

    @Value("${app.max-items}")
    private int maxItems;

    @Value("#{3 + 6}")
    private int calcula;

    public void print(){
        System.out.println(message);
        System.out.println(maxItems);
        System.out.println(calcula);
    }


    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
