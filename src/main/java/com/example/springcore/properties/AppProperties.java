package com.example.springcore.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {

    @Value("${app.message}")
    private String message;

    // Exemplo com SpEL (fazendo cálculo direto)
    @Value("#{2 * 10}")
    private int calculation;

    public void print() {
        System.out.println("Mensagem externa: " + message);
        System.out.println("Cálculo com SpEL: " + calculation);
    }
}
