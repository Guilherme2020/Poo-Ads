package cap11.domain;

public  abstract class Conta {

	protected double saldo;
	
	
	public double getSaldo() {
		return saldo;
		
	}
	
	
	public void deposita(double valor){
		if (valor <0) {
			throw new IllegalArgumentException();
		}else{
			this.saldo += valor;

		}
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public  abstract void atualiza(double taxa);


	
}
