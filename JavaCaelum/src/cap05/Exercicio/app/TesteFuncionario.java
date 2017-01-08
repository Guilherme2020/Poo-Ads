package cap05.Exercicio.app;

import cap05.Exercicio.domain.*;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 Empresa Java = new Empresa("Java K19", "12345");
	        
	        for (int i = 0; i < 10; i++) {
	            Funcionario leopoldo = new Funcionario();
	            leopoldo.salario = 1000 + i * 100;
	            leopoldo.numero = i+1;
	            Java.adiciona(leopoldo);
	        }
	        System.out.println("Empregados: ");
	        Java.mostraEmpregados();
	        
	        for(int i=0 ; i < Java.empregados.length ; i++){
	            Java.empregados[i].mostra();
	        }
	        
	        Funcionario Urias = new Funcionario();
	        Funcionario Davi = new Funcionario();
	        Urias.numero = 5;
	        Davi.numero = 13;
	        System.out.println("\nContém o funcionario 5? : " + Java.contem(Urias));
	        System.out.println("Contém o funcionario 13? : " + Java.contem(Davi));
	        
	        Funcionario[] empregadosDois = new Funcionario[11];
	        
	        for(int i=0 ; i < Java.empregados.length ; i++){
	            empregadosDois[i] = Java.empregados[i];
	            
	        }
	        empregadosDois[10] = Davi;

	        System.out.println("\nContém o funcionario 11? : " + Java.contem(Davi));
	        
	        for(int i=0 ; i < empregadosDois.length ; i++){
	            empregadosDois[i].mostra();
	        }
	        

	}

}
