package cap2;

import javax.swing.JOptionPane;

public class QuestaoCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Aqui usaremos contantes devido ao valor de anos pra mulher e homem ser algo fixo
		
		final int quantidadeAnosParaHomem = 35;
		final int quantidadeAnosParaMulher = 30;
		final int limiteDeTempoHomem = 65;
		final int limiteDeTempoMulher = 60;
		
		
		
		
		int idade;
		String sexo,str;
		int quantidadeAnos,faltaContriuicao;
		
		
		str = JOptionPane.showInputDialog("Digite a idade da peope ");
		
		idade = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Digite a os anos de Contribuicao da peole ");
		
		quantidadeAnos = Integer.parseInt(str);
		
		
		
		sexo  = JOptionPane.showInputDialog("Digite o  sexo da peeope homem ou mulher ");
		
		
		if(sexo == "mulher"){
			faltaContriuicao = quantidadeAnosParaMulher - quantidadeAnos;	
			
			if(idade >= limiteDeTempoMulher || faltaContriuicao <= 0){
			  JOptionPane.showMessageDialog(null,"Ja ta na hora de se aposentar moca ");	
			}else{
			  JOptionPane.showMessageDialog(null,"Ainda tem que trabalhar moca ");	
						
			}
			
		}else if(sexo == "homem"){

			faltaContriuicao = quantidadeAnosParaHomem - quantidadeAnos;	
			
			if(idade >= limiteDeTempoHomem || faltaContriuicao <= 0){
			  JOptionPane.showMessageDialog(null,"Ja ta na hora de se aposentar rapaz ");	
						
			}else{
			  JOptionPane.showMessageDialog(null,"Ainda tem que trabalhar rapaz ");	
						
		    }
			
		}
		
		
	}

}
