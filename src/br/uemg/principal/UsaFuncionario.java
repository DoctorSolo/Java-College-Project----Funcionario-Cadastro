package br.uemg.principal;

import br.uemg.funcionarios.Funcionario;
import br.uemg.funcionarios.Empresa;
import br.uemg.funcionarios.Endereco;

public class UsaFuncionario {
	public static void main(String[] args) {
		Endereco end1 = new Endereco("Rua das laranjas", "120", "Universitario", "6245245-@##","Ituiutaba", "MG");
		Funcionario func1 = new Funcionario("Roberto"	, (byte)22, "123165355-X", 15.0F, 14200.0F, end1);
		Funcionario func2 = new Funcionario("Renata "	, (byte)28, "123917391-Y", 30.0F, 20000.0F, end1);

		func1.setSalario(1200.00F);
		//func1.salario = 1200.00F;
		
		Funcionario func3 = func1;
		
		Funcionario func6 = new Funcionario(func1);
		
		System.out.println(func6);
		
		Endereco end2 = new Endereco("Rua das laranjas", "120", "Universitario", "6245675-@##","Ituiutaba", "MG");
		Empresa emp1 = new Empresa("Bom Bocado Ltda","23,456.0001/77",end2);
		
		emp1.contrataFuncionario(func1);
		emp1.contrataFuncionario(func2);
		emp1.contrataFuncionario(func3);
		
		
		System.out.println(emp1);
		emp1.listaFuncionarios();
	}
}