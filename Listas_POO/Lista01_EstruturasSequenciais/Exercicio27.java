package Lista_sequencia;

import javax.swing.JOptionPane;

/*
 * 27. Faça um algoritmo que receba dois números, 
 * calcule e mostre a divisão do primeiro número 
 * pelo segundo. Sabe-se que o segundo número não 
 * pode ser zero, portanto não é necessário se preocupar com validações. 
 */

public class Exercicio27 {
	public static void main(String[] args) {
		
		double n1  = Double.parseDouble(JOptionPane.showInputDialog("Digite 1º valor: "));
		double n2  = Double.parseDouble(JOptionPane.showInputDialog("Digite 2º valor: "));
	
	double divisao = n1/n2;
	
	JOptionPane.showMessageDialog(null, "A divisão é : "+divisao);
	}

}
