package cap5;

public class QuestaoQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] par = new int[10];
		int[] impar = new int[10];
		int x = 0, y = 0;
		
		for (int i = 0; i < 10; i++) {
			int num  = (int)(Math.random()*20)+1;
			if(num%2 == 0){
				par[x] = num;
				x++;
			}else{
				impar[y] = num;
				x++;
			}
		}
		System.out.println("Array de par: ");
		
		for(int i = 0; i< 10;i++){
			System.out.println(">"+i+"<"+"="+par[i]);
		}
		System.out.println("Array de impar");
	
		for (int i = 0; i < 10; i++) {
			System.out.println(">"+i+"<"+"="+impar[i]);
		}
	}

}
