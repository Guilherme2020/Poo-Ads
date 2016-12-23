package cap3.exercicios;


import javax.swing.JOptionPane;

public class QuestaoDois {

	public static void main(String[] args) {
		
		String resistenciaUm = JOptionPane.showInputDialog("R1: "); 
		String resistenciaDois = JOptionPane.showInputDialog("R2: "); 
		String resistenciaTres = JOptionPane.showInputDialog("R3: "); 
		String resistenciaQuatro = JOptionPane.showInputDialog("R4: "); 
		
		try{
			int numeroUm = Integer.parseInt(resistenciaUm);
			int numeroDois = Integer.parseInt(resistenciaDois);
			int numeroTres  = Integer.parseInt(resistenciaTres);
			int numeroQuatro = Integer.parseInt(resistenciaQuatro);
			
			int menor = numeroUm;
			
			if(numeroDois < menor){
				menor = numeroDois;
			}
			if(numeroTres < menor){
				menor = numeroTres;
			}
			if(numeroQuatro < menor){
				menor = numeroQuatro;
			}
			
			int maior = numeroUm;
			if(numeroDois > maior){
				maior = numeroDois;
			}
			if(numeroTres > maior){
				
				maior = numeroTres;
			}
			if(numeroQuatro > maior){
				maior = numeroQuatro;
			}
			
			JOptionPane.showMessageDialog(null, "Resistencias: \n "+resistenciaUm+resistenciaDois+resistenciaTres+resistenciaQuatro
					+"\nA maior resistencia eh "+maior+"A menor resistencia eh "+menor);
			
		}catch(NumberFormatException error){
			JOptionPane.showMessageDialog(null, "Digite valores validos");
		}

		
	}

}
