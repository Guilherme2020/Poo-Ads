import java.util.*;
public class TestePalavras {

	
	
	
	
	public static void main(String[] args) {
		
		String[] vetorDePalavras = {"Gordo","erico"};
		String lerPrimeiraPalavra,lerSegundaPalavra;
		int sorteioDoVector = (int) (Math.random()*TamanhoDoVector(vetorDePalavras) *1);
				
		Scanner primeiraPalavra = new Scanner(System.in);
		
		Scanner segundaPalavra = new Scanner(System.in);
		
		System.out.println("Insira a primeira Palavra");
		lerPrimeiraPalavra = primeiraPalavra.next();
		System.out.println("Insira a segunda Palavra");
		lerSegundaPalavra = segundaPalavra.next();
		
	}

	private static int TamanhoDoVector(String[] vetorDePalavras) {
	
			int tamanho = 0;
			for ( String i : vetorDePalavras) {
				tamanho+=1;
			}
			return tamanho;
		
		
	}
}
