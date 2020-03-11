package semana04;

/**
 * Essa classe é apenas experimental
 * @author Gilmar Trindade
 */

public class Metodos {

	public static void main(String[] args) {	
		//		imprimir();
		//		imprimirFrase("Apostila de Python");
		//		somar(2, 3);
		//		imprimir("Sobrecarga");
		//		System.out.println("");
		//		System.out.println(1);
		//		verificarLotacao(45, 90);
		//		verificarLotacao(45, 91);
		contaLetra("FATEC-INDAIATUBA", 'A');

	}

	//friendly (visível apenas dentro do pacote)
	/**
	 * Imprimi sempre a mesma frase em tela
	 */
	static void imprimir() {
		System.out.println("Apostila de Java");
	}	

	//sobrecarga - overdly
	static void imprimir(String s) {
		System.out.println(s);
	}	

	/**
	 * Imprimir uma frase em tela
	 * @param s - a frase a ser impressa
	 */
	public static void imprimirFrase(String s) {
		System.out.println(s);
	}

	/**
	 * Realiza a soma de dois valores inteiros
	 * @param numero1 - primeiro valor
	 * @param numero2 - segundo valor
	 */
	public static void somar(int numero1, int numero2) {
		System.out.println(numero1+numero2);
	}
	
	public static void somar(float numero1, float numero2) {
		System.out.println(numero1+numero2);
	}

	/**
	 * Veridica a quantidade de onibus necessarios para transportar todos os passageiros
	 * @param lotacaoMaxima - a quantidade de lugares do õnibus
	 * @param qtdoPassageiros - a quantidade necessaria de passageiros
	 */
	public static void verificarLotacao(double lotacaoMaxima, double qtdoPassageiros) {

		int qtde = (int) Math.ceil(qtdoPassageiros/lotacaoMaxima);

		System.out.println("Ônibus necessários: "+qtde);
	}
	
	
	/**
	 * Conta quantas vezes uma letra aparece na palavra
	 * @param palavra - palavra fornecida
	 * @param letra - a letra será contada na palavra
	 */	
	public static void contaLetra(String palavra, char letra) {
		int tamanho = palavra.length();
		int contador = 0;
		
		
		for (int i = 0; i < tamanho; i++) {
			if (palavra.charAt(i) == letra)contador ++;
				
			}
		System.out.println(contador);
			
		}
	
	}


