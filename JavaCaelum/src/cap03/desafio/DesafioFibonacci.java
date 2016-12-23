package cap03.desafio;

public class DesafioFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int ultimo = 1,penultimo = 0;
		
		
		
		
		while((ultimo + penultimo) <= 100){
			System.out.println(ultimo+penultimo);
			ultimo = ultimo+penultimo;
			
			penultimo = ultimo-penultimo;
			
		}
		
	}

}
