package Lista;

import javax.swing.JOptionPane;

/*
 * 37. Faça um algoritmo que calcule e mostre a tabuada de um número digitado pelo usuário.
 */

public class Exercicio37 {
	public static void main(String[] args) {
	
		int tabuada = 0;
		
		tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a número da tabuada desejada"));
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(" "+tabuada+" X "+i+" = "+(i*tabuada));
			
		}
		
	}

}
