package cap5;

import java.util.Scanner;


public class QuestaoDois {

	
	public static void main(String[] args) {

//		String[] meses = {"Janeiro","Fevereiro","Março",
//				"Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
//		
//
//		int numeroMes = (int) (Math.random()*12);
//		
//		
//		
//		JOptionPane.showMessageDialog(null, "O mes sorteado foi : "+meses[numeroMes]);
//	
//	
//	
		  	float x=0;
	        float y=0;
	        
	        System.out.println("x");
	        
	        x = new Scanner(System.in).nextFloat();
	        
	        System.out.println("y");
	        y = new Scanner(System.in).nextFloat();
	        float distancia = x / y;

	        System.out.println("%.3f = km/l\n"+ distancia);

		
		
	}

}
