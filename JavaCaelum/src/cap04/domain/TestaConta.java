package cap04.domain;

import cap04.app.Conta;
import cap04.app.Cliente;
public class TestaConta {

	public static void main(String[] args) {
		Conta contaUm = new Conta();
		
		Cliente clienteUm = new Cliente();
		
		contaUm.numero = 212121234;
		
		contaUm.saldo = 200.0;
		
		contaUm.limite = 1000.9;
		
		contaUm.titular = clienteUm;
		
		contaUm.sacar(100);
		
		contaUm.depositar(50);
		
		
		System.out.println(contaUm.saldo);
	}

}
