package cap04Exercicio.app;

import cap04Exercicio.domain.*; 

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Funcionario funcionarioUm = new Funcionario();
		
		funcionarioUm.contrata();
		funcionarioUm.nomeFuncionario = "Valdecir";
		funcionarioUm.departamento = "DEPTI";
		funcionarioUm.dataEntrada = "25/12/12";
		funcionarioUm.rg = "212121";
		funcionarioUm.salario = (4000);
		funcionarioUm.receberAumento(2000);
		
		Funcionario funcionarioDois = funcionarioUm;
		
		
		if(funcionarioUm == funcionarioDois){
			System.out.println("iguais");
		}else{
			System.out.println("diferentes");
		}
		
		
		System.out.println(funcionarioUm.toString());
		System.out.println("Salario com aumento "+funcionarioUm.salario);
		System.out.println("Salario anual "+funcionarioUm.calculoGanhoAnual());
	
	}

}
