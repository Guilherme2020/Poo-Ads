package app;
import javax.swing.JOptionPane;

import domain.Estacionamento;
import domain.Veiculo;
public class TestarEstacionamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estacionamento park = Estacionamento.getInstance();
		
		park.Entrada(new Veiculo("aah", "gol"));
		
		//park.saidaVeiculo("aah");
		
		System.out.println(park);
		
//		String op = JOptionPane.showInputDialog("Menu"
//				+""
//				+""
//				+"");
		
	}

}
