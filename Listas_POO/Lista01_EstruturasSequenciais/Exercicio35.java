package Lista;

import javax.swing.JOptionPane;

/*
 * 35. Fa�a um algoritmo que calcule e mostre a �rea de um losango.
 *  Sabe-se que: A = (diagonal_maior * diagonal_menor)/2; 
 */
public class Exercicio35 {
	public static void main(String[] args) {
		
		double diagonalMaior = 0;
		double diagonalMenor = 0;
		double area = 0;
		
		
		diagonalMaior = Double.parseDouble(JOptionPane.showInputDialog("Digite a diagonal maior"));
		diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog("Digite a diagonal menor"));
		
		
		area = (diagonalMaior*diagonalMenor)/2;
		
		JOptionPane.showMessageDialog(null, "A �rea do losando � "+area+" cm�");

	}

}
