package cap2;

import javax.swing.JOptionPane;

public class QuestaoQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		float notaUm,notaDois,media;
		
		str = JOptionPane.showInputDialog("Entre com a primeira nota ");
		
		notaUm = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Entre com a segunda	 nota ");
		notaDois = Float.parseFloat(str);
		
		media = (notaUm+notaDois)/2;
		
		if(media >= 6){
			
			JOptionPane.showMessageDialog(null,"Voce esta aprovado  ");
			
		}else if(media < 6){

			JOptionPane.showMessageDialog(null,"Voce esta reprovado  ");
			
			
		}
		
		
		
	}

}
