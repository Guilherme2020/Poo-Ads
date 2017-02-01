package cap10.Exercicio.ContaInterface.app;

import cap10.Exercicio.ContaInterface.domain.*;

public class TesteTributavel {
	public static void main(String[] args) {
		ContaCorrente c = new ContaCorrente();
		
		
		c.deposita(1000);
		System.out.println("Valor de Tributos: "+c.calculaTributos());
		System.out.println("saldo da conta "+c.getSaldo());
		
		Tributavel t = c;
	
		System.out.println(((ContaCorrente) t).getSaldo());
	
		}
}
