package semana03;

public class For01 {

	public static void main(String[] args) 
			  throws InterruptedException {
		for(int a=1; a<=10; a++) {
			//bloco
			System.out.print(a + " ");
			Thread.sleep(10); //milisegundos
		}
		System.out.println();
		for(int a=10; a>=1; a--) {
			//bloco
			System.out.print(a + " ");
		}
		System.out.println();
		//alfabeto
		for(char a='a'; a<='z'; a++) {
			//bloco
			System.out.print(a + " ");
			Thread.sleep(5); //milisegundos
		}
		System.out.println();
		for(float a=0; a<=10; a=a+0.5f) {
			//bloco
			System.out.print(a + " ");
		}
		
	}

}
