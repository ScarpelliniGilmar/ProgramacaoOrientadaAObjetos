package semana02;

public class Exemplo01 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		double x = a; //cast automático
		System.out.println(x);
		int b = (int)x;//cast manual
		String s = "100.5";
		double m = Double.parseDouble(s);
		System.out.println(m);
	}

}
