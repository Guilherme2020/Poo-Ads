package cap06.exercicio.app;

import cap06.exercicio.domain.*;

public class TesteApp {
	public static void main(String[] args) {
		
		Funcionario analista = new Funcionario();
	    
		analista.setSalario(2000);
	    analista.setNome("Buguinhoo");
	    analista.setSetor("TI - Programador php");
	    
	    System.out.println("Nome do funcionário: " + analista.getNome() +
	  		  			 "\nSetor de trabalho: " + analista.getSetor() + 
	  		  			 "\nSalário: " + analista.getSalario() + 
	    					 "\nGanho anual: " + analista.getGanhoAtual() +
	    					 "\nID: " + analista.getIdentificador());
	    System.out.println("--------------------------------");
	    
	    Funcionario gerente = new Funcionario("sywra");
	    gerente.setSetor("Gestão de projetos");
	    gerente.setSalario(300000);
	    System.out.println("Nome do Gerente: " + gerente.getNome() + 
	  		  			 "\nID: " + gerente.getIdentificador());
	    
	    System.out.println("\n\nNova empresa");
	    Empresa Carvalho = new Empresa(3);
	    Carvalho.setNome("Empresa Carvalho LTDA");
	    Carvalho.adiciona(analista);
	    Carvalho.adiciona(gerente);
	    Carvalho.adiciona(new Funcionario("Estagiário"));
	    Carvalho.getFuncionario(2).setSetor("Full Stack");
	    Carvalho.getFuncionario(2).setSalario(0);
	    
	    System.out.println(Carvalho.getNome());
	    for(int i=0 ; i < 3 ; i++){
	  	  System.out.println("Nome do funcionário: " + Carvalho.getFuncionario(i).getNome() +
	  			  			 "\nSetor de trabalho: " + Carvalho.getFuncionario(i).getSetor() + 
	  			  			 "\nSalário: " + Carvalho.getFuncionario(i).getSalario() + 
	  			  			 "\nGanho anual: " + Carvalho.getFuncionario(i).getGanhoAtual() +
	  			  			 "\nID: " + Carvalho.getFuncionario(i).getIdentificador() + 
						 		 "\n-----------------------");
	    }
	    
	    

	}
	  
}
