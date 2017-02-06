import java.util.*;

public class TestePalavras {

	
	
	
	
	public static void main(String[] args) {
		
		String lerPrimeiraLetra,lerSegundaLetra;
		
		
		String op = "S";

		int contadorDeErrosJ1 = 0;
		int contadorDeAcertosJ1 = 0;
		int contadorDeAcertosJ2 = 0;		
		int contadorDeErrosJ2 = 0;
		
		Random random = new Random();
		
		List<String> palavras = Arrays.asList("oi","gordo","aba");
		
		
		String asterisco = "";
		
		String palavraEscolhida = palavras.get(random.nextInt(palavras.size()));
		
		
		
		for (int i = 0; i < palavraEscolhida.length(); i++) {
			if(palavraEscolhida.toCharArray()[i] == ' '){
				asterisco += palavraEscolhida.toCharArray()[i];
			}else{
				asterisco += "*"; 
			}
		}

		while(op.equals("S")){
			System.out.println("\nInsira uma Letra");
			lerPrimeiraLetra = new Scanner(System.in).next();
			
			boolean validaAcertos = false;
			String temp = "" ;
			for (int i = 0; i < palavraEscolhida.length();i++) {
				if(palavraEscolhida.toCharArray()[i] == lerPrimeiraLetra.toCharArray()[0]){
				   temp  += palavraEscolhida.toCharArray()[i];
				   validaAcertos = true;
				}else{
					temp += asterisco.toCharArray()[i];
				}
			}
			asterisco = temp;
			
			
			if(validaAcertos == false){
				
				contadorDeErrosJ1++;
				criaBoneco(contadorDeErrosJ1);
				System.out.println(asterisco);
				if(contadorDeErrosJ1 == 6){
					System.out.println("Seu perdedor!");
					break;
				}
				
			}else{
				contadorDeAcertosJ1++;
				System.out.println(asterisco);
				if(asterisco.equals(palavraEscolhida)){
					System.out.println("Voce ganhou");
					break;
				}
			}
			System.out.println("Você quer continuar ? S-N");
			
			op = new Scanner(System.in).next();
			
		}
		
}

	public static void criaBoneco(int acertos){
		if(acertos > 0){
			System.out.println(" O ");
			
		}else if(acertos > 1){
			System.out.println(" |  " );
			
		}else if(acertos > 2){
			System.out.println("  O ");
			System.out.println(" |  " );
			
		}else if(acertos > 3){
			System.out.println("  O ");
			System.out.println(" |  " );
			
			System.out.println("/ ");
			System.out.println(" \\ ");
		}else if(acertos > 4){
			System.out.println("  O ");
			System.out.println(" |  " );
			
			System.out.println("/ ");
			System.out.println(" \\ ");
		}else if(acertos > 5){
			System.out.println("  O ");
			System.out.println(" |  " );
			
			System.out.println("/ ");
			System.out.println(" \\ ");
			System.out.println("| ");
		}else if(acertos > 6){
			System.out.println("  O ");
			System.out.println(" |  " );
			
			System.out.println("/ ");
			System.out.println(" \\ ");
			System.out.println("| ");
			System.out.println(" |");
		}
		
	}
}
