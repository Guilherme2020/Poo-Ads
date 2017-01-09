package app;
import javax.swing.JOptionPane;

import domain.Estacionamento;
import domain.Veiculo;
public class TestarEstacionamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estacionamento park = Estacionamento.getInstance();
		
		park.registrarEntrada(new Veiculo("aah", "gol"));
		
	
		System.out.println(park);
		
		
		
		int op = 4;
		
		while(op != 4 ){
			 String janela =  JOptionPane.showInputDialog("Escolha a opcao"
						+ "\n1 - Entre com os Veiculos"
						+ "\n2 - Saida de veiculos"
						+ "\n3 - Listar a situacao atual"
						+ "\n4 - Encerrar: "
						);
			if(janela.equal(1)){
				
			}
			 
			 
		}
		
		
//		String op = JOptionPane.showInputDialog("Menu"
//				+""
//				+""
//				+"");
		
	}

}
