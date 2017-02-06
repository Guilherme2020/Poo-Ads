import java.util.*;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
public class TestePalavras {

	
	
	
	
	public static void main(String[] args) {
		
//		String[] vetorDePalavras = {"Gordo","erico","aba","asa"};
		String lerPrimeiraLetra,lerSegundaPalavra;
//		
//		int sorteioDoVector = (int)(Math.random()* vetorDePalavras.length);
//		
//		System.out.print(sorteioDoVector+"\n");
//		
//		System.out.print(vetorDePalavras[sorteioDoVector]);
//		
		
		Random random = new Random();
		
		List<String> palavras = Arrays.asList("oi","gordo","aba");
		
		
		String palavraEscolhida = palavras.get(random.nextInt(palavras.size()));
		System.out.println(palavraEscolhida);
		System.out.println("\nInsira a primeira Palavra");
		lerPrimeiraLetra = new Scanner(System.in).next();
		
		if(lerPrimeiraLetra == palavraEscolhida){
			System.out.println("-O-");
			System.out.println("Voce acertou");
		
		
		}
		
		
		
		System.out.println("Insira a segunda Palavra");
		
		lerSegundaPalavra = new Scanner(System.in).next();
		
		
		
		
		
		
		
//		for (int i = 0; i < vetorDePalavras.length; i++) {
//			if (lerPrimeiraPalavra == vetorDePalavras[sorte]) {
//				
//			}
//		}
	
	
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
