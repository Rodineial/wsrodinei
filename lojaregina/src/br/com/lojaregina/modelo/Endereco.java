package br.com.lojaregina.modelo;

public class Endereco {
	
	private String logradouro;
	private String numero;
	private String Complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	
	
	
	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", Complemento=" + Complemento
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep + "]";
	}
	public Endereco() {
		super();
	}
	public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade, String uf,
			String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		Complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return Complemento;
	}
	public void setComplemento(String complemento) {
		Complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	}
	
	

