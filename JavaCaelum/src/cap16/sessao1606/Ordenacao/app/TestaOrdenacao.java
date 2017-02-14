package cap16.sessao1606.Ordenacao.app;
import cap16.sessao1606.Ordenacao.domain.*;
import java.util.*;

public class TestaOrdenacao {
	public static void main(String[] args) {
		
		
		
		//List<ContaPoupanca> contas = new LinkedList<>();
		List<ContaPoupanca> contas = new ArrayList<>();
		ContaPoupanca contaUm = new ContaPoupanca(199,"Eu",10);
		contaUm.getNomeCliente();
		contaUm.toString();
		contas.add(contaUm);
		
	
		ContaPoupanca contaDois = new ContaPoupanca(333,"nos",212210);
		//contaDois.setNumero(1995);
		contas.add(contaDois);
		
		
		ContaPoupanca contaTres = new ContaPoupanca(1231,"ele",222);
		//contaTres.setNumero(1994);
		contas.add(contaTres);
		
		System.out.println("teste");
		Collections.sort(contas,ContaPoupanca.BY_NAME_INVERSE);
	//	Collections.reverse(contas); //reverter a ordem
	//	Collections.shuffle(contas); // embaralhar os elementos da lista
	//	Collections.rotate(contas, 2); // rotacionar os elementos da lista
		
		/*for (int i = 0; i < contas.size(); i++) {
			Random randind = new Random();
			int numeroContas = randind.nextInt()*1;
			ContaPoupanca contaPoupancaAleatoria = new ContaPoupanca();
			contaPoupancaAleatoria.setNumero(numeroContas);
			contas.add(contaPoupancaAleatoria);
			System.out.println("numeros aleatorios: "+contas.get(i).getNumero());
		}*/
//		
		for(int i = 0; i< contas.size();i++){
			//Conta atual = contas.get(i); Uma forma
			//System.out.println("numero da Conta : "+contas.get(i).getNumero());
			System.out.println(""+contas.get(i).toString());
		}
		/*for(ContaPoupanca conta: contas){
			System.out.println(conta.getNomeCliente());
		}*/
		
		
	}
}
