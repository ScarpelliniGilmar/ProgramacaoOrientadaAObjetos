package semana04;

public class App {

	public static void main(String[] args) {
		
//		System.out.println(MetodosComRetorno.somar(1, 2));
		
		for (int i = 1; i <10; i++) {			
			System.out.println(MetodosComRetorno.jogarDado());
		}
		
		int[] v = MetodosComRetorno.gerarDados(3);		
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(i+"º "+v[i]);
		}
		
		System.out.println(MetodosComRetorno.somarDigitos(345));
		
	}
}
