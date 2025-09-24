package com.devsuperior.dscatalog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DscatalogApplicationTests {

    /*
        Quando você cria um projeto Spring Boot, o Spring Initializr já gera essa classe de teste.
        O objetivo dela é verificar se o contexto da aplicação Spring sobe sem erros.
👉      “Contexto da aplicação” = toda a configuração do Spring (Beans, Controllers, Services, Configurações de banco,
        etc.).
        Se durante o processo de inicialização alguma dependência obrigatória faltar (ex: @Autowired em algo que não
        existe, erro no application.properties, configuração inválida de datasource…), esse teste vai falhar.
    */
	@Test
	void contextLoads() {
	}

}
