package cap09.domain;

public class AtualizadoDeContas {

	
	private double saldoTotal = 0;
	private double selic;
	
	
	public AtualizadoDeContas(double selic){
		this.selic = selic;
	}
	public void roda(Conta c){
		System.out.println("Saldo antes de atualizar\n "+c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Apos atualizacao\n"+c.getSaldo());
		this.saldoTotal += c.getSaldo();
	}
	
	public double getSaldoTotal() {
		return saldoTotal;
	}
}


