package cap2;

import javax.swing.JOptionPane;

public class QuestaoTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float valorTransacao,valorVenal,percentualImposto, valorImposto;
		
		
		String msg = JOptionPane.showInputDialog("Entre com o valor da transaçao ");
	
		valorTransacao = Float.parseFloat(msg);
		
		msg = JOptionPane.showInputDialog("Entre com o valor venal ");
		valorVenal =  Float.parseFloat(msg);
		
		msg = JOptionPane.showInputDialog("Entre com o percentual de imposto ");
		percentualImposto = Float.parseFloat(msg);
		
		
		
		if(valorTransacao >= valorVenal){
			valorImposto  = (valorTransacao *percentualImposto)/100;
			
		}else{
			valorImposto  = (valorVenal*percentualImposto)/100;
		}
		
		JOptionPane.showMessageDialog(null, "O valor do imposto eh R$: "+valorImposto);
		
		
		
		
	
	
		
	
	}

}
