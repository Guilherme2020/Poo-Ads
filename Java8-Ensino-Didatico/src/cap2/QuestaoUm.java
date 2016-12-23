package cap2;

import java.io.*;

public class QuestaoUm {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//permite ao programador que um erro seja
		//descartado, mesmo que ele ocorra
		//Ultilzando o throws ao inves do try/catch por hora...
		
		float valorProdut, percentagemDesconto,valorDesconto , valorProcomDesconto;
		
		
		String d;
		BufferedReader dado;
		
		System.out.println("Digite  o valor do produto ");
		dado = new  BufferedReader(new InputStreamReader(System.in));
		
		d	 = dado.readLine();
		
		valorProdut = Float.parseFloat(d);
	
		System.out.println("Digite  a percentagem de desconto ");
		dado = new  BufferedReader(new InputStreamReader(System.in));
		d  = dado.readLine();
		
		percentagemDesconto = Float.parseFloat(d);
		
		valorDesconto = (valorProdut*percentagemDesconto)/100;
		
		valorProcomDesconto = valorProdut - valorDesconto;
		
		System.out.println("Valor do DEsconto = "+valorDesconto);
		System.out.println("Valor do Prod com Desconto = "+valorProcomDesconto);
		
		
		
		
	}

}
