package Lista;

import javax.swing.JOptionPane;

/*
 * 37. Fa�a um algoritmo que calcule e mostre a tabuada de um n�mero digitado pelo usu�rio.
 */

public class Exercicio37 {
	public static void main(String[] args) {
	
		int tabuada = 0;
		
		tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a n�mero da tabuada desejada"));
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(" "+tabuada+" X "+i+" = "+(i*tabuada));
			
		}
		
	}

}
