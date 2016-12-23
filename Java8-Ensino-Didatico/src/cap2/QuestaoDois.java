package cap2;

import java.util.*;


public class QuestaoDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int  pontoDoTimeLider,pontoDoTimeLanterna,numeroDeVitoriasNec;
		
		System.out.println("Digite a quantidade pontos do lider");
		Scanner campeonato =  new Scanner(System.in);
		pontoDoTimeLider = campeonato.nextInt();
		
		System.out.println("Digite a quantidade pontos do Lanterna");
		campeonato = new Scanner(System.in);
		pontoDoTimeLanterna = campeonato.nextInt();
		
		
		numeroDeVitoriasNec = (pontoDoTimeLider-pontoDoTimeLanterna)/3;
		
		System.out.println("A quantidade de vitorias necessarias eh: "+numeroDeVitoriasNec);
		
		
		
		
		
	}
	

}
