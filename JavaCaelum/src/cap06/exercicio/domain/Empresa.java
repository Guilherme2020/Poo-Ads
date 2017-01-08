package cap06.exercicio.domain;

public class Empresa {
	private String nome;
	private Funcionario[] empregados;
	private int total=0,capacidade;
	
	public Empresa(int numeroFuncionarios){
		empregados = new Funcionario[numeroFuncionarios];
		this.capacidade = numeroFuncionarios;
	}
	
	public Funcionario getFuncionario (int posicao) {
	    return this.empregados[posicao];
	}
	
	public void adiciona(Funcionario f){
		if(this.total < this.capacidade){
			empregados[total] = f;
			this.total++;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
