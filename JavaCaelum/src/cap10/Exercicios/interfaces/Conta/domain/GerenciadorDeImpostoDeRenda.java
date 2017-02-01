package cap10.Exercicios.interfaces.Conta.domain;

public class GerenciadorDeImpostoDeRenda {

	
	
	private double total;
	
	
	
	public double getTotal() {
		return this.total;
	}
	public void adiciona(Tributavel t){
		System.out.println("Adicionando Tributavel "+t);
		this.total += t.calculaTributos();
	}
	
	
	
}
