package cap11.app;

import cap11.domain.*;
import cap11.util.ValorInvalidoException;

public class TestaDeposito {

	public static void main(String[] args) {

		ContaPoupanca cp001 = new ContaPoupanca();
		
		try{
			cp001.deposita(100);
			
		}catch(ValorInvalidoException e){
			System.out.println(""+e.getMessage());
		}
		
		
		System.out.println("Seu saldo eh	"+
				cp001.getSaldo());
	
	}

}
