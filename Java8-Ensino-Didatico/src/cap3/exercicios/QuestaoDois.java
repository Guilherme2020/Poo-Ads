package cap3.exercicios;


import java.io.IOException;
import java.util.Scanner;


public class QuestaoDois {

	public static void main(String[] args) throws IOException {
		int resistenciaUm,resistenciaDois,resistenciaTres,
			maior,menor,resistenciaQuatro;
		
			Scanner lerResUm = new Scanner(System.in);
			Scanner lerResDois= new Scanner(System.in);
			Scanner lerResTres = new Scanner(System.in);
			Scanner lerResQuatro = new Scanner(System.in);
			
			
			
			System.out.println(" Resistencia Um ");
			resistenciaUm = lerResUm.nextInt();
			System.out.println(" Resistencia Dois ");
			resistenciaDois = lerResDois.nextInt();
			System.out.println(" Resistencia Tres ");
			resistenciaTres = lerResTres.nextInt();
			System.out.println(" Resistencia Quatro ");
			resistenciaQuatro = lerResQuatro.nextInt();
				
			int numeroUm = resistenciaUm;
			int numeroDois = resistenciaDois;
			int numeroTres  = resistenciaTres;
			int numeroQuatro = resistenciaQuatro;
			
			 menor = numeroUm;
			
			if(numeroDois < menor){
				menor = numeroDois;
			}
			if(numeroTres < menor){
				menor = numeroTres;
			}
			if(numeroQuatro < menor){
				menor = numeroQuatro;
			}
			
			maior = numeroUm;
			if(numeroDois > maior){
				maior = numeroDois;
			}
			if(numeroTres > maior){
				
				maior = numeroTres;
			}
			if(numeroQuatro > maior){
				maior = numeroQuatro;
			}
			
			System.out.println("Resistencias: \n "+resistenciaUm+"\n"+resistenciaDois+"\n"+resistenciaTres+"\n"+resistenciaQuatro
					+"\nA maior resistencia eh "+maior+"\nA menor resistencia eh "+menor);
			
		

		
	}

}
