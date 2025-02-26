package ware.demo.Calculadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // Indica que a classe é um componente do Spring
public class MyApp implements CommandLineRunner {

    @Autowired // Injeção de dependência
    private Calculadora calculadora; 
    
    @Override // Indica que o método é uma sobreescrita
    public void run(String... args) throws Exception {
        System.out.println("O resultado é " + calculadora.somar(7, 5));
    }
}
