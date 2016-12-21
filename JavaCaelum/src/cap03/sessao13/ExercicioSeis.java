package cap03.sessao13;

public class ExercicioSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//QUESTAO 6 FIBONACCI
		
		int ultim = 1,num,penultimo = 0;
		
		num = ultim + penultimo;
		
		while(num<=100){
			  System.out.println(num);
			  penultimo = ultim;
	          ultim = num;
	          num = ultim + penultimo;
		}
		
		//
	}

}
