package com.example.springcore.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {

    @Value("${app.message}")
    private String message;

    @Value("${app.max-items}")
    private int maxItems;

    @Value("#{2 * 3}") // Exemplo de SpEL
    private int calculado;

    public void print() {
        System.out.println("Mensagem: " + message);
        System.out.println("Máx itens: " + maxItems);
        System.out.println("SpEL: 2 * 3 = " + calculado);
    }

    // Opcional: Getters, caso precise injetar em outros beans
    public String getMessage() {
        return message;
    }

    public int getMaxItems() {
        return maxItems;
    }

    public int getCalculado() {
        return calculado;
    }
}
