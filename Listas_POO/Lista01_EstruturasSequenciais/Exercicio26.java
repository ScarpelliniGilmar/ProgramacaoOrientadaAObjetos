package Lista_sequencia;

import javax.swing.JOptionPane;

/*
 * 26. Faça um algoritmo que receba três números,
 *  calcule e mostre a multiplicação desses números
 */

public class Exercicio26 {
	public static void main(String[] args) {
		
		
	
		double n1  = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: " ));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: " ));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor: " ));
		
		JOptionPane.showMessageDialog(null, "A multiplicação é : "+n1*n2*n3);
		
		

	}

}
