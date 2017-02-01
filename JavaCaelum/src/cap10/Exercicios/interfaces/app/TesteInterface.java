package cap10.Exercicios.interfaces.app;
import cap10.Exercicios.interfaces.domain.*;
public class TesteInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AreaCalculavel areaUm = new Retangulo(3, 10);
		System.out.println(areaUm.calculaArea());
		AreaCalculavel areaCirculo = new Circulo(40);
		System.out.println(areaCirculo.calculaArea());
	}

}
