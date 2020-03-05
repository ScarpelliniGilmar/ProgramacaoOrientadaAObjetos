package Lista;

import javax.swing.JOptionPane;

/*
 * 33. Faça um algoritmo que calcule e mostre a área de um trapézio.
 *  Sabe-se que: A = (base maior + base menor)* altura)/2 ;
 */
public class Exercicio33 {

	public static void main(String[] args) {
		
		double baseMaior = 0;
		double baseMenor = 0;
		double altura = 0;
		double area = 0;
		
		
		baseMaior = Double.parseDouble(JOptionPane.showInputDialog("Digite a base Maior"));
		baseMenor = Double.parseDouble(JOptionPane.showInputDialog("Digite a base Menor"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		
		area = ((baseMaior + baseMenor)* altura)/2;
		
		JOptionPane.showMessageDialog(null, "A área do triangulo é "+area);
	}

}
