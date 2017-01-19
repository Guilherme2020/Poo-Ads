package cap3.exercicios;

import javax.swing.JOptionPane;

public class QuestaoTres {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub

	
		String login = "java8";
		String senha = "java8";
		int cont = 0;
		while(login == "java8"){
			if(cont < 3){
				String logiIn = JOptionPane.showInputDialog("Login: ");
				String senhaIn = JOptionPane.showInputDialog("Senha");
				if(login.equals(logiIn)&& senha.equals(senhaIn)){
					JOptionPane.showMessageDialog(null,"Acesso permitido");
					break;
				}else{
					cont++;
					if(cont == 3){
						JOptionPane.showMessageDialog(null,"Acesso cancelado tentativas encerradas");
						break;
					}if(!login.equals(logiIn) && !senha.equals(senhaIn)){
						JOptionPane.showMessageDialog(null,"tente novamente"+cont);
					}
				}
				
			}
		}
	
	}
}