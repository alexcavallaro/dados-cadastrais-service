package br.com.cavallaro.dadoscadastraisservice;

import java.util.LinkedHashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class DadosCadastraisServiceApplication {

	private DadosCadastrais dadosCadastrais = new DadosCadastrais();
	
	public static void main(String[] args) {
		SpringApplication.run(DadosCadastraisServiceApplication.class, args);
	}

	@GetMapping("/dados-cadastrais/{cpf}")
	public Object get(@PathVariable String cpf) {
		
		//getDados(cpf)
		dadosCadastrais.setCpf(cpf);
		dadosCadastrais.setEndereco(new Endereco((new RestTemplate()).getForObject(
		"http://localhost:8090/endereco/"+
				dadosCadastrais.getEndereco().getCep(), LinkedHashMap.class)));
		return dadosCadastrais;
	}
	
	@PutMapping("/dados-cadastrais/{cpf}/endereco/{cep}")
	public Object put(@PathVariable String cpf, @PathVariable String cep) {
		
		//getDados(cpf)
		dadosCadastrais.setCpf(cpf);
		dadosCadastrais.setEndereco(new Endereco((new RestTemplate()).getForObject(
		"http://localhost:8090/endereco/"+cep, LinkedHashMap.class)));
		return dadosCadastrais;
	}
}
