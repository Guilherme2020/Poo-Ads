package cap10.Exercicios.interfaces.domain;

public class Quadrado implements AreaCalculavel {

	private int lado;

	
	public void quadrado(int lado){
		 this.lado = lado;
	}
	
	@Override
	public double calculaArea() {
	  return  this.lado * this.lado;
	}
	
	
	
	
}
