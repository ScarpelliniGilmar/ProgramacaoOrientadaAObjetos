package Lista_sequencia;

import javax.swing.JOptionPane;

/*
 * 25. Calcule o volume de uma caixa d'�gua cil�ndrica. 
 * 
 */
public class Exercicio25 {
	public static void main(String[] args) {
		
		double largura,profundidade,altura,volume;
		
		largura = Double.parseDouble(JOptionPane.showInputDialog("Informe a largura:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura:"));
		profundidade = Double.parseDouble(JOptionPane.showInputDialog("Informe a profundidade:"));

		volume = profundidade*altura*largura;
		JOptionPane.showMessageDialog(null, String.format("O volume � %.2f m�",volume));
		
	}

}
