package domain;

public class Estacionamento {

	  
	  private static Estacionamento instancia;
	  
	  private int pos = 0;
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
	
	  
	  public boolean Entrada(Veiculo veiculo){
	//	  
		  if(!contem(veiculo.getPlaca())){ 
			  vagas[pos++] = veiculo;
			  return true;
		  }else{
			  return false;
		  }
	  }
	 
	  public boolean saidaVeiculo(String placa){
		  if(contem(placa)){
			  //Procurar a posicao e torna null;
			  return true;
		  }
		  return false;
	  }
	  
	  private boolean contem(String placa){
		  for (Veiculo veiculo : vagas) {
			  if (veiculo.getPlaca().equals(placa)) {
				 return true;
			  }
		  }
		  return false;
	  }
	  @Override
	  public String toString(){
		  
		  return this.nome;
	  }
	  

}