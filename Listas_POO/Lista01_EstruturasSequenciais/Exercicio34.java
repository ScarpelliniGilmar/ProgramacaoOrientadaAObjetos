package Lista;

import javax.swing.JOptionPane;

/*
 * 34. Fa�a um algoritmo que calcule e mostre a �rea de um quadrado. Sabe-se que: A = lado * lado; 
 */

public class Exercicio34 {
	public static void main(String[] args) {
		
		double lado = 0;
		double area = 0;
		
		
		lado = Double.parseDouble(JOptionPane.showInputDialog("Digite lado do quadrado"));
				
		area = lado*lado;
		
		JOptionPane.showMessageDialog(null, "A �rea do quadrado � "+area);
	}

}
