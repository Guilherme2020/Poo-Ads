package cap04Exercicio.domain;

public class Funcionario {

		public String nomeFuncionario;
		public String departamento;
		public double salario;
		public String dataEntrada;
		public String rg;
		
		
		
		public void contrata(){
			salario = 4000;
		}
		
		public void receberAumento(double valorAumento){
			this.salario += valorAumento;
		}
		public double calculoGanhoAnual(){
			return salario * 12;
		}
	
		
		@Override
		public String toString() {
			return "Nome:  "+this.nomeFuncionario+"\nDepartamento: "+this.departamento+ "\nSalario Base "+salario;
		}
}
