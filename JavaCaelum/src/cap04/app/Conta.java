package cap04.app;


public class Conta {
	public int numero;
	public double saldo;
	public double limite;
	public Cliente titular = new Cliente();
	
	public void depositar(double quantidade){
		this.saldo += quantidade;
	}
	
	public void  sacar(double quantidade){
		double novoSaldo = 	this.saldo - quantidade;	
		this.saldo = novoSaldo;
	}
	
	public void tranferePara(Conta destino,double valor){
		this.saldo -=  valor;
		destino.saldo = destino.saldo+valor;
	}
	/*ou 
		 boolean transfere(Conta destino,double valor){
		 	boolean retirou  = this.sacar(valor);
		 	if(retirou == false){
		 		return false
		 	}else{
		 		destino.depositar(valor)
		 		return true;
		 	}
		 } 
	 */
}


