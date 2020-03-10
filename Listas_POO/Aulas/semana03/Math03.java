package semana03;

public class Math03 {

	public static void main(String[] args) {
		
		//gerador de senha numérica
		for(int a=1;a<=10;a++) {
			System.out.print((int)(Math.random()*10));
		}
		
		System.out.println();
		//gerador de senha alfanumérica
		String s = "ABCDEabcde@#$%1234567890";
		int t = s.length();
		for(int a=1;a<=10;a++) {
			int n = (int)(Math.random()*t);
			char c = s.charAt(n);
			System.out.print(c);
		}

	}

}
