import java.util.*;
public class TestePalavras {

	
	
	
	
	public static void main(String[] args) {
		
		String[] vetorDePalavras = {"Gordo","erico","aba","asa"};
		String lerPrimeiraPalavra,lerSegundaPalavra;
		
		int sorteioDoVector = (int)(Math.random()* vetorDePalavras.length);
		
		System.out.println(sorteioDoVector);
		
		System.out.println("Insira a primeira Palavra");
		lerPrimeiraPalavra = new Scanner(System.in).next();
		System.out.println("Insira a segunda Palavra");
		lerSegundaPalavra = new Scanner(System.in).next();
		
		for (int i = 0; i < sorteioDoVector; i++) {
			if (lerPrimeiraPalavra == vetorDePalavras[sorteioDoVector]) {
				
			}
		}
	
	
	}

//	private static int TamanhoDoVector(String[] vetorDePalavras) {
//	
//			int tamanhoDoVector = 0;
//			
//			for ( String i : vetorDePalavras) {
//				tamanhoDoVector+=1;
//			}
//			return tamanhoDoVector;
//		
//		
//	}
}
