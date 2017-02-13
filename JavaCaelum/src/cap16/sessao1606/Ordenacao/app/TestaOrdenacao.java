package cap16.sessao1606.Ordenacao.app;
import cap16.sessao1606.Ordenacao.domain.*;
import java.util.*;

public class TestaOrdenacao {
	public static void main(String[] args) {
		
		
		List<ContaPoupanca> contas = new LinkedList<>();
		
		ContaPoupanca contaUm = new ContaPoupanca();
		contaUm.setNumero(1997);
		contas.add(contaUm);
		
		
		ContaPoupanca contaDois = new ContaPoupanca();
		contaDois.setNumero(1995);
		contas.add(contaDois);
		
		
		ContaPoupanca contaTres = new ContaPoupanca();
		contaTres.setNumero(1994);
		contas.add(contaTres);
		
		Collections.sort(contas);
		
		for(int i = 0; i< contas.size();i++){
			//Conta atual = contas.get(i); Uma forma
			System.out.println("numero da Conta : "+contas.get(i).getNumero());
		}
		
		
	}
}
