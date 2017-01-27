package cap07.app;

import cap07.domain.*;

public class TestaContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c = new Conta();	
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);;
		
		
	
		AtualizadoDeContas adc = new AtualizadoDeContas(0.01);
		
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println("Saldo total\n"+adc.getSaldoTotal());

	
	
	}

}
