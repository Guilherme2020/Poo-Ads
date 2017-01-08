package cap05.Exercicio.domain;

public class Empresa {
	public Funcionario[] empregados;
	
	public	String nome,cnpj;
	
	public int numeroFuncionarios;
	
	public Empresa(String nome,String cnpj){
		 empregados = new Funcionario[10];
		 numeroFuncionarios=0;
		 this.nome = nome;
		 this.cnpj = cnpj;

	}

	public void adiciona(Funcionario f){
        if(numeroFuncionarios < 10){
            empregados[numeroFuncionarios] = f;
            numeroFuncionarios++;
        }
    }
    
    public void mostraEmpregados(){
        System.out.println("Empresa " + this.nome + " CNPJ " + this.cnpj);
        for(int cont=0 ; cont < numeroFuncionarios ; cont++){
            System.out.println("Empregado de número " + (cont + 1) + ": " + empregados[cont].getSalario());
        }
    }
    
   public boolean contem(Funcionario f){
        for(Funcionario funcionario: empregados){
            if(funcionario.numero == f.numero){
                return true;
            }
        }
        return false;
    }

}
