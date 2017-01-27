package cap10.domain;


public class ContaCorrente extends Conta {

	
	
	public ContaCorrente(){
		
	}
	
	@Override
	public void atualiza(double taxa){
		this.saldo += this.saldo*taxa;

		
	}
	
	@Override
	public void deposita(double valor){
		this.saldo += valor - 0.10;
	}
	
}
