package cap10.Exercicios.interfaces.Conta.app;

import cap10.Exercicios.interfaces.Conta.domain.*;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente contacorre = new ContaCorrente();
		contacorre.deposita(1000.0);
		System.out.println(contacorre.calculaTributos());
		
		//polimorfismo
		
		Tributavel tributo = contacorre;
		System.out.println(tributo.calculaTributos());
		//System.out.println(((Conta) tributo).getSaldo());
	}

}
