package cap11.app;

import cap11.domain.*;

public class TestaDeposito {

	public static void main(String[] args) {

		ContaPoupanca cp001 = new ContaPoupanca();
		
		
		cp001.deposita(-100);
		
		System.out.println(
				cp001.getSaldo());
	
	}

}
