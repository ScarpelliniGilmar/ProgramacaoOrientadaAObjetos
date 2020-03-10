package semana01;

/*
 * Essa aplicação recebe dois valores inteiros,
 * realiza sua soma e apresenta o resultado
 * em tela.
 * 
 * É necessário passar dois valores...
 */
public class Soma {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		System.out.println("A soma é: "+(n1+n2));
		
	}
}


