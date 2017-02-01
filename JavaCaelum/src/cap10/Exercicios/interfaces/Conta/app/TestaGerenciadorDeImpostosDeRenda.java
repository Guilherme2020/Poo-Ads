package cap10.Exercicios.interfaces.Conta.app;

import cap10.Exercicios.interfaces.Conta.domain.*;
public class TestaGerenciadorDeImpostosDeRenda {

	public static void main(String[] args) {

		GerenciadorDeImpostoDeRenda gerenciador  = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida seguro = new SeguroDeVida();
		gerenciador.adiciona(seguro);

		
		ContaCorrente contaCorrenteUm = new ContaCorrente();
		
		contaCorrenteUm.deposita(2000);
		gerenciador.adiciona(contaCorrenteUm);

		System.out.println(gerenciador.getTotal());
		System.out.printf("o saldo eh %.2f",contaCorrenteUm.getSaldo());
		
		
		
	}

}
