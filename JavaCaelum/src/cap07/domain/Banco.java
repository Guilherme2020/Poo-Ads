package cap07.domain;

public class Banco {

	
	private Conta[] contas;
	private int capacidadeTotal,numeroContas=0;
	
	
	
	public Banco(int capacidadeTotal){
		this.capacidadeTotal = capacidadeTotal;
		this.contas = new Conta[this.capacidadeTotal];
	}
	
	public void adiciona(Conta conta){
		if(numeroContas < capacidadeTotal){
			contas[numeroContas] = conta;
			numeroContas++;
		}else{
			System.out.println("Array de Conta cheio");
		}
		
	}
	
	public Conta pegaConta(int x){
		if(x < capacidadeTotal){
			return contas[x]; // Retorna a posição daquela conta no vetor.
		}else{
			System.out.println("Nao existe");
			return null;
		}
	}
	

	public int getNumeroContas() {
		return this.numeroContas;
	}
	
	
}
