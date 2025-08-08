package com.example.springcore;

import com.example.springcore.properties.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);

        AppProperties appProperties = context.getBean(AppProperties.class);
        appProperties.print();

        String ambiente = context.getBean(String.class);
        System.out.println("Ambiente de Desenvolvimento: " + ambiente);



    }
}

/* - Mostrar no console uma mensagem de arquivo esterno e um valor
   - Fazer um calculo com a linguagem SpEL
   - Criar perfils dev e prod, deixar um ativo no arquivo externo
 */