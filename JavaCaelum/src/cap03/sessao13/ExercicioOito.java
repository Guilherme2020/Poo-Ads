package cap03.sessao13;

public class ExercicioOito {

	public static void main(String[] args) {
				
//		(opcional) Imprima a seguinte tabela, usando fors encadeados:
//			1
//			2 4
//			3 6 9
//			4 8 12 16
//			n n*2 n*3 .... n*n
			
			int n = 5,line,collum;
		
			for(line=1; line <= n ;line++){
				for(collum = 1; collum <= line ;collum++){
					System.out.print((line*collum) + " ");
				}
				System.out.println();
			}
		}

}
