package io.github.igorrllima.vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema de Vendas";
    }
}
