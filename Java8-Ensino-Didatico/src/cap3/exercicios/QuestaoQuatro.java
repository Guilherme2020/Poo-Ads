package cap3.exercicios;

import javax.swing.JOptionPane;

public class QuestaoQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		String espaco = "";
		
		for (int i = 0; i < 10; i++) {
			espaco += (numero + "x"+ i + "="+(numero+i)+"\n");
		}
		JOptionPane.showMessageDialog(null, espaco);
	}

}
