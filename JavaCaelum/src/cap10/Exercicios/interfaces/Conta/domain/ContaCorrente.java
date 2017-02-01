package cap10.Exercicios.interfaces.Conta.domain;


public class ContaCorrente extends Conta implements Tributavel {

	
	
	public ContaCorrente(){
		
	}
	
	@Override
	public void atualiza(double taxa){
		this.saldo += this.saldo*taxa*3;

		
	}
	
	@Override
	public void deposita(double valor){
		this.saldo += valor - 0.10;
	}

	@Override
	public double calculaTributos() {
		return this.saldo * 0.01;
	}
	
}
