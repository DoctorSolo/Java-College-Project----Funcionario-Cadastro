package br.uemg.funcionarios;

public class Funcionario {

	private String nome;
	private byte idade;
	private String mat;
	private float comissao; // em porcentagem
	private float salario;
	private Endereco endereco;
	
	//Método construtor sem Parametros (construtor default)
	public Funcionario() {
		nome	= "Manoel Carlos";
		idade	= 25;
		mat		= "583589=Q";
	}
	
	//Método construtor com Parametros
	public Funcionario(String nome, byte idade, String mat, float comissao, float salario, Endereco endereco) {
		this.nome		= nome;
		this.idade		= idade;
		this.mat		= mat;
		this.comissao	= comissao;
		this.salario	= salario;
		this.endereco	= endereco;
	}
	public Funcionario(String nome, byte idade, String mat, Endereco endereco) {
		this.nome		= nome;
		this.idade		= idade;
		this.mat		= mat;
		this.endereco	= endereco;
		comissao		= 0.0F;
		salario 		= 0.0F;
	}
	
	// contrutor de cópia (clonagem)
	public Funcionario(Funcionario func) {
		this.nome		= func.nome;
		this.idade		= func.idade;
		this.mat		= func.mat;
		this.comissao	= func.comissao;
		this.salario	= func.salario;
		this.endereco	= new Endereco(func.endereco);
	}

	public String getNome() {
		return nome;
	}
	public byte getIdade() {
		return idade;
	}
	public String getMatricula() {
		return mat;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(byte idade) {
		this.idade = idade;
	}
	public void setMatricula(String mat) {
		this.mat = mat;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", idade=" + idade + ", mat=" + mat + ", comissao=" + comissao
				+ ", salario=" + salario + ", endereco=" + endereco + "]";
	}
	
	
	
}
