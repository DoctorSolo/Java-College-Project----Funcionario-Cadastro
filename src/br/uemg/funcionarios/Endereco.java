package br.uemg.funcionarios;

public class Endereco {
	private String logradouro;
	private String numero;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;

	public Endereco(String logradouro, String numero, String bairro, String cep, String cidade, String estado) {
		this.logradouro	= logradouro;
		this.numero 	= numero;
		this.bairro 	= bairro;
		this.cep 		= cep;
		this.cidade 	= cidade;
		this.estado 	= estado;
	}

	public String getLogradouro() {
		return logradouro;
	}
	
	//Construtor de cópia (CLONAGEM) ///////////////////////////////////////////////////////////////////////////////////////////////////
	public Endereco(Endereco end) {
		this.logradouro	= end.logradouro;
		this.numero 	= end.numero;
		this.bairro 	= end.bairro;
		this.cep 		= end.cep;
		this.cidade 	= end.cidade;
		this.estado 	= end.estado;
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

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep
				+ ", cidade=" + cidade + ", estado=" + estado + "]";
	}

}
