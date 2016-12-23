package cap3.exercicios;

import javax.swing.JOptionPane;

public class QuestaoUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valor,desconto = 0;
		
		
		String nomeProd = JOptionPane.showInputDialog(null,"Digite aqui o nome do prod: ");
		if(nomeProd != null){
			String valorProduto = JOptionPane.showInputDialog("Digite o valor do prod ");
		
			if(valorProduto != null){
				try{
					valor = Float.parseFloat(valorProduto);				
					String msg = "Valor do prod com desconto ";
					if(valor >= 50 && valor < 200){
						
						desconto += (valor*0.5);
					}else if(valor >= 200 && valor < 500){
						desconto += (valor*0.6);
					}else if(valor >= 500 && valor < 1000){
						desconto += (valor * 0.7);
					}else if(valor >= 1000){
						desconto += (valor*0.8);
					}else{
						msg = ("Nao temos desconto para esse valor");
					}
				
					JOptionPane.showMessageDialog(null,"Nome do produto "+nomeProd+ "\nValor original R$: "+valor+"\n"+msg+desconto);
				
				}catch(NumberFormatException error){
					JOptionPane.showMessageDialog(null, "Ocorreram erros numericos, por favor tente com valores aceitos. "+error.toString());
					
				}
			}
		
		}
		
		
		
	}

}
