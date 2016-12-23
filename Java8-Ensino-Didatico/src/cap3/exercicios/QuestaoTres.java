package cap3.exercicios;

import javax.swing.JOptionPane;

public class QuestaoTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		final String loginOriginal = "java8";
		final String senhaOriginal = "java8";
		
		while(contador < 3 ){
			
			String login = JOptionPane.showInputDialog("Insira o login");
			String senha = JOptionPane.showInputDialog("Insira a Senha");
			
			if(login == loginOriginal && senha == senhaOriginal){
				JOptionPane.showMessageDialog(null, "SEja bem vindo");
				break;
			}else{
				JOptionPane.showMessageDialog(null, "Falha no logiin \n "+"Voce tem mais "+(3-contador)+"Tentativa!");
			}
			
		}
	}

}
