package domain;
import domain.Veiculo;

public class Estacionamento {

	  
	  private static Estacionamento instancia;
	  
	  private int posicao = 0;
	  private String nome;
	  
	  private Veiculo[] vagas;
	  

	  
	  
	  private  Estacionamento(){
		 
		  this.nome = "IFPI";
		  this.vagas = new Veiculo[10];
	  }
	  
	  public String getNome() {
		
		  return nome;
	  
	  }
	  
	  public Veiculo[] getVagas() {
		
		  return vagas;
	  
	  }
	  
	  public static Estacionamento getInstance(){
		
		 if(Estacionamento.instancia == null){
			 Estacionamento.instancia = new Estacionamento();
		 }
		 return Estacionamento.instancia;	 
	  }
	
//	  public boolean validarEntrada(Veiculo veiculo){
//		//TODO
//          if (!contem(veiculo.getPlaca())){
//                  //Faz a entrada de fato
//                  this.vagas[posicao++] = veiculo;
//                  return true;
//          }else {
//                  //Veiculo já estacionado.
//                  return false;
//          }
//
//	  }
	  
	  
	  public void registrarEntrada(Veiculo veiculo){
		    
		  	this.vagas[posicao] = veiculo;
		  	posicao++;
		  
		  
	  }	  
		  
		  
	  //}
	  public Veiculo getPosicao(int i) throws IndexOutOfBoundsException{
		  return this.vagas[i-1];
	  }
	  public void saidaVeiculo(String placa){
		  if(contem(placa)){
			  for (int i = 0; i < vagas.length; i++) {
				  String varPlaca = vagas[i].getPlaca();
				  if(varPlaca.equals(placa)){
					  vagas[i] = null;
					  System.out.println("deu certo");
				  }
			  }
		  }else{
			  System.out.println("nao existe veiculos");
		  }
	  }
		  
	  
	  
	  private boolean contem(String placa){
		  for (Veiculo veiculo : vagas) {
			  if (veiculo.getPlaca().equals(placa)) {
				 return true;
			  }
		  }
		  return false;
	  }

	 public void estadoAtual(){
	 		for (int i = 0; i < vagas.length; i++) {
				System.out.println((i+1)+"Vaga>"+""+getVagas()[i]+"");
			}
	  }
	  @Override
	  public String toString(){
		  
		  return this.nome;
	  }
	  	

}