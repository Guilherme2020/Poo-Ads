package cap11.domain;
import cap11.util.*;
public  abstract class Conta {

	protected double saldo;
	
	
	public double getSaldo() {
		return saldo;
		
	}
	
	
	public void deposita(double valor){
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		}else{
			this.saldo += valor - 10;

		}
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public  abstract void atualiza(double taxa);


	
}
