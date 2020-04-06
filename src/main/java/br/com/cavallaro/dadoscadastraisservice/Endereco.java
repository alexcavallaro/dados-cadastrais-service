package br.com.cavallaro.dadoscadastraisservice;

import java.util.LinkedHashMap;

public class Endereco {
	
	private String cep; //05577-902
	private String logradouro; //Rodovia Raposo Tavares km 17
	private String complemento; //5
	private String bairro; //Jardim Arpoador
	private String localidade; //São Paulo
	private String uf; //SP
	private String unidade; //
	private String ibge; //3550308
	private String gia; //1004
	
	
	public Endereco() {
	}
	
	public Endereco(LinkedHashMap<String, String> result) {
		this.setCep(result.get("cep"));
		this.setLogradouro(result.get("logradouro"));
		this.setComplemento(result.get("complemento"));
		this.setBairro(result.get("bairro"));
		this.setLocalidade(result.get("localidade"));
		this.setUf(result.get("uf"));
		this.setUnidade(result.get("unidade"));
		this.setIbge(result.get("ibge"));
		this.setGia(result.get("gia"));
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getIbge() {
		return ibge;
	}
	public void setIbge(String ibge) {
		this.ibge = ibge;
	}
	public String getGia() {
		return gia;
	}
	public void setGia(String gia) {
		this.gia = gia;
	}

}
