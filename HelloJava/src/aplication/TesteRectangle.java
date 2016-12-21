package aplication;

import domain.Rectangle;
import domain.Point;
public class TesteRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rectangle = new Rectangle();
		Point  ponto = new Point();
		
		
		rectangle.witdh  = 14.6;
		rectangle.height = 8.5;
		
		ponto.pontoY = 20;
		ponto.pontoX = 15;
		
		String resultEstaCondido = rectangle.EstaContido(rectangle);
		
		String result = "Area = " + rectangle.area();
		
		String resultAmpliar = "Ampliar = " +rectangle.ampliar(10);
		
		String resultReduzir = "Reduzir = "+rectangle.reduzir(5);
		
		System.out.println("O reslutado da area do retangulo eh "+result);
		System.out.println("O retangulo ampliado eh = "+resultAmpliar);
		System.out.println("O retangulo reduzido eh = "+resultReduzir);
		System.out.println("Esta contido = "+resultEstaCondido);
	
		
	
	}

}
