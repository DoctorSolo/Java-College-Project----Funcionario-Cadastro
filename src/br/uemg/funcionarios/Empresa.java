package br.uemg.funcionarios;

import java.util.ArrayList;

public class Empresa {
	private String razaoSocial;
	private String cnpj;
	private Endereco endereco;
	private ArrayList<Funcionario> funcionarios; 
	
	//cadastro
	public Empresa(String razaoSocial, String cnpj, Endereco endereco) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.endereco = endereco;
		funcionarios = new ArrayList<>(); //cadastro inicialmente vazio
	}	//contrutor com parametros
	
	//contratacao de funcionarios
	public void contrataFuncionario (Funcionario func) {
		funcionarios.add(func);		//funcionario contratado
	}

	
	
	public void listaFuncionarios() {
		for(Funcionario func : funcionarios) {
			System.out.println(func);
		}
	}
	@Override
	public String toString() {
		return "Empresa [razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", endereco=" + endereco + "]";
	}

	
}
