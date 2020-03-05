package Lista;

import javax.swing.JOptionPane;

/*
 * 40. Faça um algoritmo que receba o valor dos catetos de um triângulo, calcule e mostre o valor da hipotenusa. 
 */

public class Exercicio40 {
	public static void main(String[] args) {
		
		double catetoOposto = 0;
		double catetoAdjacente = 0;
		double hipotenusa = 0;
		
		
		catetoOposto = Double.parseDouble(JOptionPane.showInputDialog("Digite o cateto Oposto"));
		catetoAdjacente = Double.parseDouble(JOptionPane.showInputDialog("Digite o cateto Adjacente"));
		
		catetoAdjacente = Math.pow(catetoAdjacente, 2);
		catetoOposto = Math.pow(catetoOposto, 2);
		hipotenusa = Math.sqrt(catetoAdjacente+catetoOposto);
		
		
		JOptionPane.showMessageDialog(null, "A hipotenusa é "+hipotenusa);
		
		

	}

}
