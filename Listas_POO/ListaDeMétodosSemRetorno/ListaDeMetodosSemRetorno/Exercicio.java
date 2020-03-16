package ListaDeMetodosSemRetorno;
import java.util.ArrayList;
import java.util.List;

public class Exercicio {
	
	/**
	 * A - Método que recebe uma palavra e apresenta as letras separadas
	 * @param palavra - nome da variavel que trará a palavra para teste
	 */
	public static void Palavra(String palavra) {	
		
	char[] letras = null;
	letras = palavra.toCharArray();

	System.out.println("Quantidade de letras: " + letras.length);
	
	for (int i = 0; i < letras.length; i++) {
		System.out.println("Posição de cada Letra: "+i+" - "+letras[i]);
		}
	}
	
	/**
	 * B - Verifica se o numero é maior que 1 e menor ou igual a 10 e imprimi a tabuada
	 * @param numero - variavel a ser testada
	 */
	public static void Tabuada(int numero) {
		if(numero > 1 && numero <=10) {
			System.out.println("*************| TABUADA DO "+numero+" |************");
			for (int i = 0; i <= 10; i++) {
				System.out.println(numero+" X "+i+" = "+numero*i);
			}
		}else {
			System.out.println("Número Inválido");
		}
		
	}
	
	/**
	 * C - Imprimi 5 numero aleatórios de 1 a 100
	 */
	public static void NumeroAleatorio() {
		for (int i = 1; i < 6; i++) {			
			System.out.println(i+"º número aleatório: "+(int) (Math.random()*100));
			}
		}
	/**
	 * D - Recebe um número de 1 a 7 e imprimi o dia da semana
	 * @param numero - variavel deve ter uma numero inteiro entre 1 a 7
	 */
	public static void DiaDaSemana(int numero) {		
			switch(numero){
			case 1: System.out.println("Domingo");break;
			case 2: System.out.println("Segunda");break;
			case 3: System.out.println("Terça");break;
			case 4: System.out.println("Quarta");break;
			case 5: System.out.println("Quinta");break;
			case 6: System.out.println("Sexta");break;
			case 7: System.out.println("Sabado");break;
			default:System.out.println("Inexistente");
			}
	}
	
	/**
	 * E - Método que imprimi os nomes sepados de uma lista
	 * @param nome
	 */
	public static void ListaDeNomes(List nome) {		
		List<String> lista = new ArrayList<String>();
		lista = nome;
		int cont = 1;		
		
		for(String nomes:lista) {
			System.out.print(cont+++" - ");
			System.out.println(nomes);
			}
		}
	
	
	
	
	
	
	
	
	
	}
	



