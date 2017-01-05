package cap5;

public class QuestaoTres {

	public static void main(String[] args) {

		int n = 1;
		
		int [][] matrizDeImagem = new int[40][40];
		
		
		for(int linha = 0; linha < matrizDeImagem.length;linha++){
			
			for(int coluna = 0 ; coluna < matrizDeImagem[linha].length;coluna++){
				
				matrizDeImagem[linha][coluna] = (int)(Math.random()*255);
			
				System.out.println(n+" - ["+linha+","+coluna+"] = "+matrizDeImagem[linha][coluna]);
				n++; 
			}
			
			
		}
		
	
	}

}
