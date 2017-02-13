package cap16.sessao1606.Ordenacao.domain;



import java.util.Comparator;
import static java.util.Comparator.*;



public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
	public final static Comparator<ContaPoupanca> BY_NAME = comparing(ContaPoupanca::getNomeCliente);
	
	private String nomeCliente;

	public String getNomeCliente() {
		return nomeCliente;
	}
	
	
//	@Override
//	public int compareTo(ContaPoupanca o) {
//		
//		if(this.getNumero() < o.getNumero()){
//			return -1;
//		}if(this.getNumero() > o.getNumero()){
//			return 1;
//		}
//		return 0;
//		// return Integer.compare(this.getNumero(), outra.getNumero()); Anyway
//	}
//   
//	Outra forma
	@Override
	public int compareTo(ContaPoupanca outra){
		return this.getNomeCliente().compareToIgnoreCase(outra.getNomeCliente());
	}
		// Essa forma er pra ser String
	
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo*taxa*2;

	}



	
	
}
