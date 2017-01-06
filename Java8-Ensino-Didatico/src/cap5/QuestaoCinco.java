package cap5;

import javax.swing.JOptionPane;

public class QuestaoCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String[] vagasDeCarro = new String[10];
			
		int  x;
		
		for (int i = 0; i < 10; i++) {
				vagasDeCarro[i] = "livre";
		}
		
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
				while(x==0){
					int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero da vaga"));
					if(vagasDeCarro[numero-1].equals("livre")){
						vagasDeCarro[numero - 1] = JOptionPane.showInputDialog("Forneca a placa do veiculo");
						x = 1;
					}else{
						JOptionPane.showMessageDialog(null,"Escolha outra vaga");
					}
				}
			}else if(opcao.equals("2")){
				int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero da vaga para liberar"));
				vagasDeCarro[numero-1] = "livre";
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
