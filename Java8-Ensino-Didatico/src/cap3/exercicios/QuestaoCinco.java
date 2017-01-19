package cap3.exercicios;

import java.io.IOException;

import javax.swing.JOptionPane;

public class QuestaoCinco {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String menu = JOptionPane.showInputDialog("Digite uma opcao para exercicio: \n1-ExerUm \n2-ExerDois \n3-ExerTres \n4-ExerQuatro");
		
		
		switch (menu) {
		case "1":
			QuestaoUm.main(null);
			break;
		case "2":
			QuestaoDois.main(null);
		case "3":
			QuestaoTres.main(null);
		case "4":
			QuestaoQuatro.main(null);
		default:
			break;
		}
	}

}
