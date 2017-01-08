package cap05.Exercicio.domain;

public class Funcionario {


	 public double salario;
	 public int numero;
	    
	 public double getSalario(){
	    return this.salario;
	 }
	    
	 public void mostra(){
		 System.out.println("Empregado de número " + numero + ": " + getSalario());
	 }

}
