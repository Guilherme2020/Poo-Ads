package aplication;

import domain.Rectangle;
import domain.Point;
public class TesteRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rectangle = new Rectangle();
		Rectangle rectangle2 = new Rectangle();
		
		
		rectangle.ponto = new Point();
		rectangle2.ponto = new Point(); 
		rectangle.witdh  = 14.6;
		rectangle.height = 8.5;
		rectangle2.witdh =15 ;
		rectangle2.height = 13;
		
		rectangle.ponto.pontoY = 20;
		rectangle.ponto.pontoX = 15;
		
		rectangle2.ponto.pontoY = 10;
		rectangle2.ponto.pontoX = 12;
		
		
		
		String resultEstaCondido = rectangle.EstaContido(rectangle2);
		
		String result = "Area = " + rectangle.area();
		String resultPerimetro = "Perimetro = "+ rectangle.perimetro();
		String resultAmpliar = "Ampliar = " +rectangle.ampliar(10);
		
		String resultReduzir = "Reduzir = "+rectangle.reduzir(5);
		
		System.out.println("O reslutado da area do retangulo eh "+result);
		System.out.println("O retangulo ampliado eh = "+resultAmpliar);
		System.out.println("O retangulo reduzido eh = "+resultReduzir);
		System.out.println("Esta contido? = "+resultEstaCondido);
		System.out.println("PERIMETRO = "+resultPerimetro);
	
		
	
	}

}
