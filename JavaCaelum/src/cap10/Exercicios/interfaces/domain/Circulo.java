package cap10.Exercicios.interfaces.domain;

public class Circulo  implements AreaCalculavel{

	private double raio  = 0;
	
	
	public Circulo(double raio){
		this.raio = raio;
	}


	@Override
	public double calculaArea() {
		
		return Math.PI * this.raio*this.raio;
	}
	
	
	
	
}
