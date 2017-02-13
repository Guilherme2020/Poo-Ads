package cap16.sessao1606.Ordenacao.domain;

public  abstract class  Conta {

	protected int numero;
	protected double saldo; 
	protected String titular;	
	
	
	public String getTitular() {
		return titular;
	}
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void deposita(double valor){
		 this.saldo += valor;
	}
	public void sacar(double valor){
		this.saldo -= valor;
	}
	
	abstract public void atualiza(double taxa);
	
	@Override
	public String toString() {
		return "titular{ }  numero{ }"+this.titular+""+this.numero;
	}
	
	
}
