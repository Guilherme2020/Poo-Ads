package cap3.exercicios;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class QuestaoUm {

	public static void main(String[] args) throws IOException {
		float valor,desconto = 0;
		String nomeProd;
		Scanner lerNomeProd = new Scanner(System.in);
		Scanner valorProdu = new Scanner(System.in);
		
		
		System.out.println("Insira o nome do produdto ");
		nomeProd = lerNomeProd.next();
		
		
		if(nomeProd != ""){
			System.out.println("Digite o valor do produto ");
			valor = valorProdu.nextFloat();
			if(valor != 0){
				
					String msg = "Valor do produto com desconto ";
					if(valor >= 50 && valor < 200){
						
						desconto += (valor*0.5);
					}else if(valor >= 200 && valor < 500){
						desconto += (valor*0.6);
					}else if(valor >= 500 && valor < 1000){
						desconto += (valor * 0.7);
					}else if(valor >= 1000){
						desconto += (valor*0.8);
					}else{
						msg = "Nao temos desconto para esse valor";
					}
				
					System.out.println("Nome do produto "+nomeProd+ "\nValor original R$: "+valor+"\n"+msg+desconto);
				
			}
		
		}
		
		
		
	}

}
