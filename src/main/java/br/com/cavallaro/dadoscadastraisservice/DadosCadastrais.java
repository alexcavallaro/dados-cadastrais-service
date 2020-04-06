package br.com.cavallaro.dadoscadastraisservice;

public class DadosCadastrais {
	
	private static String cpf;
	private static String nome = "Alexander Cavallaro";
	private static Endereco endereco = new Endereco() {{setCep("05577902");}};
	
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		DadosCadastrais.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		DadosCadastrais.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		DadosCadastrais.nome = nome;
	}
	
	
}
