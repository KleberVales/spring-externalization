package com.example.springcore;

import com.example.springcore.config.AppConfig;
import com.example.springcore.properties.AppProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSpring {
    public static void main(String[] args) {
        // Sobe contexto com a configuração manual
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Bean que carrega properties
        AppProperties appProperties = context.getBean(AppProperties.class);
        appProperties.print();

        // Buscar o bean String configurado pelo profile ativo
        String ambiente = context.getBean(String.class);
        System.out.println("Ambiente ativo: " + ambiente);
    }
}



/* - Mostrar no console uma mensagem de arquivo esterno e um valor
   - Fazer um calculo com a linguagem SpEL
   - Criar perfils dev e prod, deixar um ativo no arquivo externo
 */