package Lista_sequencia;

import javax.swing.JOptionPane;

/*
 * 26. Fa�a um algoritmo que receba tr�s n�meros,
 *  calcule e mostre a multiplica��o desses n�meros
 */

public class Exercicio26 {
	public static void main(String[] args) {
		
		
	
		double n1  = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: " ));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: " ));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor: " ));
		
		JOptionPane.showMessageDialog(null, "A multiplica��o � : "+n1*n2*n3);
		
		

	}

}
