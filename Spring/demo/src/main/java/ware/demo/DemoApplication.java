package ware.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@SpringBootApplication
public class SpringDemoApps {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApps.class, args);

        @Bean
        public CommandLineRunner run(ConversorJson conversorJson) throws Exception {
            return args -> {
                String json = "{\"cep\":\"01001-000\",\"logradouro\":\"Praça da Sé\",\"complemento\":\"lado ímpar\",\"bairro\":\"Sé\",\"localidade\":\"São Paulo\",\"uf\":\"SP\",\"ibge\":\"3550308\",\"gia\":\"1004\",\"ddd\":\"11\",\"siafi\":\"7107\"}";
                ViaCepResponse response = conversorJson.converter(json);
                System.out.println(response);
            };
        }
    }
}

@SpringBootApplication
public class SpringDemoApps {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApps.class, args);

		@Bean
		public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
			return args -> {
				sistema.enviarConfirmacao();
				sistema.enviarBoasVindas();
				sistema.enviarConfirmacao();
			};
		}
	}
}