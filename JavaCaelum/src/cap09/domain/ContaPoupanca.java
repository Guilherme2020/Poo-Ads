package cap09.domain;

public class ContaPoupanca extends Conta {

	@Override
	public void atualiza(double taxa) {
		
		this.saldo += this.saldo*taxa*2;

	}
	

	
//	public void atualiza(double taxa){
//		
//		super.atualiza(taxa*3);
//	}
//	
}
