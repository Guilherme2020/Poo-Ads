package cap5;

import javax.swing.JOptionPane;

public class QuestaoCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String[] vagasDeCarro = new String[10];
			
		int  x;
		
		
		
		String opcao = "";
		while(opcao != "4") {
			 
			opcao = JOptionPane.showInputDialog("Escolha a opcao"
					+ "\n1 - Entre com os Veiculos"
					+ "\n2 - Saida de veiculos"
					+ "\n3 - Listar a situacao atual"
					+ "\n4 - Encerrar: "
					);
			x = 0;
			if(opcao == null){
				break;
			}else if(opcao.equals("1")){
				
					int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero da vaga"));
					if(vagasDeCarro[numero].equals("livre")){
						vagasDeCarro[numero] = JOptionPane.showInputDialog("Forneca a placa do veiculo");
						break;
					}
			}else if(opcao.equals("2")){
				int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero da vaga para liberar"));
				vagasDeCarro[numero] = "livre";
			}else if(opcao.equals("3")){
				for (int i = 0; i < 10; i++) {
					JOptionPane.showMessageDialog(null,"Vaga: "+(i+1)+" => "+vagasDeCarro[i]);
				}
			}else if(opcao.equals("4")){
				JOptionPane.showMessageDialog(null,"Saiu");
				
				break;
			}
			
			
		} 
	
	}

}
