package domain;
import javax.swing.JOptionPane;

import domain.Veiculo;

public class Estacionamento {

	  
	  private static Estacionamento instancia;
	  
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
		    
		  	this.vagas[getPosicao()] = veiculo;
		  	
		  
		  
	  }	  
		  
		  
	  //}
	  public int getPosicao() throws IndexOutOfBoundsException{
		  int menorPosicao = 0;
	        for(int i = 0; i < 10 ; i++){
	            if(this.vagas[i] == null){
	                return i;
	            }
	        }
	        return menorPosicao;
	  }
	  public void saidaVeiculo(String placa)  throws  IndexOutOfBoundsException{
		  if(contem(placa)){
			  for (int i = 0; i < vagas.length; i++) {
				  
				  if(vagas[i] != null){
					  String varPlaca = vagas[i].getPlaca();
					  if(varPlaca.equals(placa)){
						  vagas[i] = null;
						  System.out.println("deu certo");
					  }  
				  }
				  
			  }
		  }
	  }
		  
	  
	  
	  private boolean contem(String placa){
		  for (int i = 0; i < vagas.length; i++) {
	            if(vagas[i] != null) {
	                if (vagas[i].getPlaca().equals(placa)) {
	                    return true;
	                }
	            }
	        }
	        return false;  
	  }

	 public void estadoAtual(){
	 		for (int i = 0; i < vagas.length; i++) {
				JOptionPane.showMessageDialog(null,((i+1)+"Vaga>"+""+getVagas()[i]+""));
			}
	  }
	  @Override
	  public String toString(){
		  
		  return this.nome;
	  }
	  	

}