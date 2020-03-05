package Lista;

import javax.swing.JOptionPane;

/*
 * 28. Faça um algoritmo que receba duas notas, calcule 
 * e mostre a média ponderada dessas notas, considerando 
 * peso 2 para a primeira nota e peso 3 para a segunda nota. 
 */

public class Exercicio28 {

	public static void main(String[] args) {
		

		double nota1,nota2,mediaPonderada;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota 1: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota 2: "));		
	
		mediaPonderada = (nota1*0.2 + nota2*0.3) / 2 ;
				
		JOptionPane.showMessageDialog(null,"Média ponderada é "+mediaPonderada);
	}

}
