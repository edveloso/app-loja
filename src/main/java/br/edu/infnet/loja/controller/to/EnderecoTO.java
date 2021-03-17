package br.edu.infnet.loja.controller.to;

public class EnderecoTO {
	
	private String logradouro;
	private int numero;
	private String bairro;
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	@Override
	public String toString() {
		return "EnderecoTO [logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + "]";
	}
	
	
	

}
