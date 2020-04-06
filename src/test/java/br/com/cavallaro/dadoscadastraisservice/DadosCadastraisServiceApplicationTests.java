package br.com.cavallaro.dadoscadastraisservice;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

import java.util.LinkedHashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class DadosCadastraisServiceApplicationTests {

	private static final Logger LOGGER = LoggerFactory.getLogger(DadosCadastraisServiceApplicationTests.class);

	@InjectMocks
	DadosCadastraisServiceApplication service;

	String cpf;
	String cep;
//	DadosCadastrais dadosCadastrais;

    @BeforeEach
    void initContas() {
        this.cpf = "12345678901";
        this.cep = "01246000";
//        this.dadosCadastrais = new DadosCadastrais() {{
//        	getEndereco().setCep("01246000");}};
    }
    
    
	@Test
    @DisplayName("Retorna o get com sucesso")
    void validExecuteGet() {
        // given

        // when
		DadosCadastrais obj = (DadosCadastrais) service.get(this.cpf);

        // then
        assertThat(obj.getNome(), equalTo("Alexander Cavallaro"));
        assertThat(obj.getEndereco().getCep(), equalTo("05577-902"));
        LOGGER.info("\nGET Retorna o get com sucesso:\n"+obj.getNome()+"\n"+obj.getEndereco().getCep());
    }
	
	@Test
    @DisplayName("Retorna o put com sucesso")
    void validExecutePut() {
        // given

        // when
		DadosCadastrais obj = (DadosCadastrais) service.put(this.cpf, this.cep);

        // then
        assertThat(obj.getNome(), equalTo("Alexander Cavallaro"));
        assertThat(obj.getEndereco().getCep(), equalTo("01246-000"));
        LOGGER.info("\nPUT Retorna o get com sucesso:\n"+obj.getNome()+"\n"+obj.getEndereco().getCep());
    }
	
	@Test
    @DisplayName("Retorna o get com sucesso da alteração do teste anterior PUT")
    void validExecuteGet2() {
        // given

        // when
		DadosCadastrais obj = (DadosCadastrais) service.get(this.cpf);

        // then
        assertThat(obj.getNome(), equalTo("Alexander Cavallaro"));
        assertThat(obj.getEndereco().getCep(), equalTo("01246-000"));
        LOGGER.info("\nGET Retorna o get com sucesso da alteração do teste anterior PUT:\n"+obj.getNome()+"\n"+obj.getEndereco().getCep());
    }
}
