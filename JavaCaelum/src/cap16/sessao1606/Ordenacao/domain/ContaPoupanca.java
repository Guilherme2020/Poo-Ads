package cap16.sessao1606.Ordenacao.domain;



import java.util.Comparator;
import static java.util.Comparator.*;




public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
	public final static Comparator<ContaPoupanca> BY_NAME = comparing(ContaPoupanca::getNomeCliente);
	public final static Comparator<ContaPoupanca> BY_NAME_INVERSE = comparing(ContaPoupanca::getNomeCliente, reverseOrder());
	private String nomeCliente;

	
	public ContaPoupanca(int numero,String nome,double saldo){
		this.numero = numero;
		this.nomeCliente = nome;
		this.saldo = saldo;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	
	
	/*@Override
	public int compareTo(ContaPoupanca o) {
	
		if(this.getNumero() < o.getNumero()){
			return -1;
		}if(this.getNumero() > o.getNumero()){
			return 1;
		}
		return 0;
		// return Integer.compare(this.getNumero(), outra.getNumero()); Anyway
	}*/
	
   
//	Outra forma
//	/*@Override
//	public String compare(ContaPoupanca outra){
//		return this.getNomeCliente().compareToIgnoreCase(outra.getNomeCliente());
//	}*/
		// Essa forma er pra ser String
	/*
	public String compare(ContaPoupanca outra){
		if(outra.getNomeCliente().equals(this.nomeCliente)){
			return "Sao iguais";
		}
		return "diferentes";
	}
	*/
	public int compareTo(ContaPoupanca outra){
		return this.getNomeCliente().compareToIgnoreCase(outra.getNomeCliente());
	}
	
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo*taxa*2;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome "+ this.nomeCliente + " Numero "+ this.numero+ " Saldo "+ this.saldo;
	}

	
	
}
