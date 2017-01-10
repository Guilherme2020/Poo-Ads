package app;

import javax.swing.JOptionPane;

import domain.*;
public class TestarEstacionamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Estacionamento park = Estacionamento.getInstance();

		
		
		String opc = ""; 
		while(!"4".equals(opc)){
			opc = JOptionPane.showInputDialog(
					"Escolha a opcao"
							+ "\n1 - Entre com os Veiculos"
							+ "\n2 - Saida de veiculos"
							+ "\n3 - Listar a situacao atual"
							+ "\n4 - Encerrar: "
					);
			
			switch (opc) {
				case "1":
					
					String numeroPlaca =  JOptionPane.showInputDialog("Insira o numero da placa ");
					String nomeVeiculo = JOptionPane.showInputDialog("Insira o nome do veiculo ");
					
					park.registrarEntrada(new Veiculo(numeroPlaca,nomeVeiculo));
					break;
						
				case "2":
					numeroPlaca =  JOptionPane.showInputDialog("Insira o numero da placa ");
					
					park.saidaVeiculo(numeroPlaca);
					break;
				case "3":
					
					park.estadoAtual();
					break;
				case "4":
					JOptionPane.showMessageDialog(null,"Obrigado,Volte Sempre");
					break;
				default:
					break;
					
			}			 
	
		}
	}

}
