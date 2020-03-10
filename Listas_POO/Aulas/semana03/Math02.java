package semana03;

public class Math02 {

	public static void main(String[] args) {
		
		for(int b=1;b<=10;b++) {
			System.out.print("Cartão "+b+": ");
			for(int a=1;a<=6;a++) {
				System.out.print((int)(Math.random()*60)+" ");
			}	
			System.out.println();
		}
			

	}

}
