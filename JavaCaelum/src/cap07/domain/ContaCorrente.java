package cap07.domain;


public class ContaCorrente extends Conta {

	
	
	public ContaCorrente(){
		
	}
	
	@Override
	public void atualiza(double taxa){
		super.atualiza(taxa*2);
		
	}
	
	@Override
	public void deposita(double valor){
		this.saldo += valor - 0.10;
	}
	
}
