package Lista_sequencia;

import javax.swing.JOptionPane;

/*
 * 27. Fa�a um algoritmo que receba dois n�meros, 
 * calcule e mostre a divis�o do primeiro n�mero 
 * pelo segundo. Sabe-se que o segundo n�mero n�o 
 * pode ser zero, portanto n�o � necess�rio se preocupar com valida��es. 
 */

public class Exercicio27 {
	public static void main(String[] args) {
		
		double n1  = Double.parseDouble(JOptionPane.showInputDialog("Digite 1� valor: "));
		double n2  = Double.parseDouble(JOptionPane.showInputDialog("Digite 2� valor: "));
	
	double divisao = n1/n2;
	
	JOptionPane.showMessageDialog(null, "A divis�o � : "+divisao);
	}

}
