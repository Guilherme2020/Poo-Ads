package domain;

public class Veiculo {

	
	
	
	
	private String placa;
	private String nome;
	
	
	
	public Veiculo(String placa,String nome){
		this.placa = placa;
		this.nome = nome;
	}
	
	
	public String getPlaca() {
		return placa;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Placa-> "+this.placa+" Nome-> "+this.nome;
		
	}
	
	
	
	
}
