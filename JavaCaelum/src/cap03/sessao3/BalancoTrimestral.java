package cap03.sessao3;

public class BalancoTrimestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 1700;
		
		int gastosTrismestre = gastosJaneiro+gastosFevereiro+gastosMarco;
		
		System.out.println(gastosTrismestre);
		
		
		
		float mediaMensal = gastosTrismestre/3;
		
		System.out.println("Valor da  média mensal = "+mediaMensal);
		
		
		
	}

}
