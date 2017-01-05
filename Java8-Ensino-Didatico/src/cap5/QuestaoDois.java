package cap5;

import java.lang.Math;

import javax.swing.JOptionPane;

public class QuestaoDois {

	public static void main(String[] args) {

		String[] meses = {"Janeiro","Fevereiro","Março",
				"Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
		

		int numeroMes = (int) (Math.random()*12);
		
		JOptionPane.showMessageDialog(null, "O mes sorteado foi : "+meses[numeroMes]);
	
	
	
	}

}
