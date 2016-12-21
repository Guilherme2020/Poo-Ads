package domain;
import java.lang.Math;
public class Rectangle {

	 public double witdh;
	 public double height;
	 //Composicao
	 
	 Point ponto = new Point();
	

	 public double area(){
		 
		 return height*witdh; 
	 }
	 
	 public double perimetro(){
		 
		 return (height+witdh)*2;
	 }

	 
	 
	 
	 public String EstaContido(Rectangle rectangle){
		 if(Math.sqrt(Math.pow(rectangle.ponto.pontoX - (ponto.pontoX + witdh),2)) <= Math.sqrt(Math.pow(ponto.pontoX - (ponto.pontoX + witdh),2))){
	            if(Math.sqrt(Math.pow(rectangle.ponto.pontoY - (ponto.pontoY + height),2)) <= Math.sqrt(Math.pow(ponto.pontoY - (ponto.pontoY + height),2))){
	                return "Esta contido";
	            }
	        }
		 return "Nao esta condido";
	 }
	 //
	 
	

	

	public double ampliar(double vezes){
		 
		 return this.area() * vezes;
	 }
	 
	 public double reduzir(double vezes){
		 return this.area()/vezes;
	 }
	 
	 

}
