package ware.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.google.gson.Gson;

import ware.demo.SysMensageria.Remetente;

@Configuration
public class Beans {
    @Bean
    public Gson gson() {
        return new Gson();
    }
    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("Criando um remetente");
        Remetente remetente = new Remetente();
        remetente.setNome("noreply");
        remetente.setEmail("noreply@ware.com.br");
        return remetente;
    }
}
