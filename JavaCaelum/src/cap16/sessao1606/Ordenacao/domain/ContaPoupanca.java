package cap16.sessao1606.Ordenacao.domain;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	@Override
	public int compareTo(ContaPoupanca o) {
		
		if(this.getNumero() < o.getNumero()){
			return -1;
		}if(this.getNumero() > o.getNumero()){
			return 1;
		}
		return 0;
		// return Integer.compare(this.getNumero(), outra.getNumero()); Anyway
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo*taxa*2;

	}
	
	
}
