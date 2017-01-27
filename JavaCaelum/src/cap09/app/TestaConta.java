package cap09.app;

import cap09.domain.*;

public class TestaConta {

	public static void main(String[] args) {
	
		ContaCorrente guilherme = new ContaCorrente();

		AtualizadoDeContas atu = new AtualizadoDeContas(12);

	
		atu.roda(guilherme);
	}

}
