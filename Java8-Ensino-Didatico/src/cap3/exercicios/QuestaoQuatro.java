package cap3.exercicios;

import java.io.IOException;


import java.util.Scanner;


public class QuestaoQuatro {

	public static void main(String[] args) throws IOException {
		
		int numeroFornecido,x=1;
		Scanner lerNumeroFornecido = new Scanner(System.in);
		
		System.out.println("Digite o numero da tabuada ");
		numeroFornecido = lerNumeroFornecido.nextInt();
		
		while(x <= 10){
			System.out.println(+numeroFornecido+" * " + x);
			x++;
		}
		
	}

}
