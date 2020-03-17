package ListaDeMetodosComRetorno;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio {

	/**
	 * F - M�todo que recebe n�meros inteiros e retorna os pares
	 * 
	 * @param numero - variavel do tipo List que recebe os n�meros
	 */
	public static List ListaDePares(List numero) {
		List<Integer> lista = new ArrayList<Integer>();
		List<Integer> lista2 = new ArrayList<Integer>();
		lista = numero;
		int testa, cont = 0;

		for (Integer numeros : lista) {
			if (numeros % 2 == 0) {
//				System.out.println(numeros + " � par");
				lista2.add(numeros);
				cont++;
			} else {
//				System.out.println(numeros + " � impar");
			}
		}
		System.out.printf("Temos " + cont + " n�meros parer, sendo eles: ");
		for (Integer numeros : lista2) {
			System.out.print("  " + numeros);
		}
		System.out.println();
		return lista2;
	}

	/**
	 * G - M�todo recebe uma Array e retorna a soma dos numeros
	 * 
	 * @param numero - Variavel que recebe um array de numeros inteiros
	 * @return
	 */
	public static int Soma(int numero[]) {
		int soma = 0;
		for (int i = 0; i < numero.length; i++) {
			soma += numero[i];
		}
		System.out.println("A soma dos n�meros � " + soma);
		return soma;
	}

	/**
	 * H - Lista que recebe varias notas e retorna a m�dia aritmetica
	 * 
	 * @param notas - variavel do tipo List com varias notas
	 * @return
	 */
	public static List Nota(List notas) {
		int contador = 0;
		int somanota = 0;

		List<Double> nota = new ArrayList<Double>();
		nota = notas;
		for (Double notas1 : nota) {

			somanota += notas1;
			contador++;
		}
		System.out.println("Sua m�dia � " + somanota / contador);
		return nota;
	}

	/**
	 * I - Um m�todo que recebe dois n�meros inteiros (n1 e n2) e retorna um vetor
	 * contendo n1 valores gerados aleatoriamente cujos valores estejam
	 * compreendidos entre 0 e n2.
	 * 
	 * @param n1 - valores gerados aleatoriamente
	 * @param n2 - ser�o gerados numero de 0 at� o valor de n2.
	 * @return
	 */
	public static int[] gerarDados(int n1, int n2) {
		int[] vetor = new int[n1];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * n2);
			System.out.println(vetor[i]);
		}
		return vetor;
	}

	/**
	 * J - Um m�todo que receba um n�mero de CPF e retorne verdadeiro caso ocorram
	 * as seguintes condi��es: a. deve conter 11 algarismos b. deve conter o formato
	 * xxx.xxx.xxx/xx (os algarismos devem estar no lugar de cada x)
	 * 
	 * @param CPF - Variavel que recebe o numero do CPF
	 * @return
	 */
	public static boolean VerificaCPF(String CPF) {
		char[] letras = null;
		letras = CPF.toCharArray();

		if (CPF.length() == 14) {
			if (letras[3] == '.' && letras[7] == '.' && letras[11] == '/') {
				JOptionPane.showMessageDialog(null, "CPF V�lido!");
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "CPF Inv�lido, digite da seguinte maneira: xxx.xxx.xxx-xx");
				return false;
			}
		} else if (CPF.length() == 11) {
			JOptionPane.showMessageDialog(null,
					"Inv�lido, tente assim: " + letras[0] + "" + letras[1] + "" + letras[2] + "." + letras[3] + ""
							+ letras[4] + "" + letras[5] + "." + letras[6] + "" + letras[7] + "" + letras[8] + "/"
							+ letras[9] + "" + letras[10]);
			return false;
		} else {
			return false;
		}
	}
}
