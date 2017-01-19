package cap3.exercicios;

import javax.swing.JOptionPane;

public class QuestaoTres {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int contador = 0;
//		final String loginOriginal = "java8";
//		final String senhaOriginal = "java8";
//		
//		while(contador < 3 ){
//			
//			String login = JOptionPane.showInputDialog("Insira o login");
//			String senha = JOptionPane.showInputDialog("Insira a Senha");
//			
//			if(login.equals(loginOriginal) && senha.equals(senhaOriginal)){
//				JOptionPane.showMessageDialog(null, "SEja bem vindo");
//				break;
//			}else{
//				contador++;
//				if(contador == 3){
//					JOptionPane.showMessageDialog(null,"Suas chances acabaram");
//				}else{
//					JOptionPane.showMessageDialog(null, "Falha no logiin \n "+"Voce tem mais "+ (3 - contador) +"Tentativa!");
//
//				}
//			}
//			
//		}
	
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