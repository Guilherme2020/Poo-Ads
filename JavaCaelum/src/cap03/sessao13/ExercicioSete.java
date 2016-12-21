package cap03.sessao13;

public class ExercicioSete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//7(opcional) Escreva um programa que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:
//		
		int x=13; //Numero do PT xD;
		
		while(x != 1){
			
			if(x % 2 == 0){
				x = x/2;
			}else{
				x = x*3+ 1;
			}
			//tirei o ln do print para n pular a linha
			System.out.print(" -> "+x);
		}
		
	}

}
