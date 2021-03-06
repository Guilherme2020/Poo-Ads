package cap10.Exercicio.ContaInterface.domain;

public class ContaPoupança implements Conta {
	private double saldo;
	
	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public void retira(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo*taxaSelic*2;
		
	}

}
