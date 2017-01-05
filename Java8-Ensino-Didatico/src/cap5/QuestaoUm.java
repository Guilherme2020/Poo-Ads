package cap5;

//import java.util.Arrays;

import javax.swing.JOptionPane;





public class QuestaoUm {

	public static void main(String[] args) {
	
		
		float [] notas = new float[5];
		//float [] arrayAux = new float[5];
		
		float somaNotas = 0 , mediaNotas;
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite as cinco notas: "));
			somaNotas += notas[i];
			
		}
		
		mediaNotas = somaNotas/5;
		//Arrays.sort(notas);
		for(int n=1;n<=5;n++){
			for(int i=0;i<=3;i++){
				if (notas[i]>notas[i+1]) {
					float aux = notas[i];
					notas[i] = notas[i+1];
					notas[i+1] = aux;
				}
			}
		}
		
		System.out.println("A media Aritimética das notas eh =  "+mediaNotas);
		System.out.println("Notas: ");


		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}
	
}
