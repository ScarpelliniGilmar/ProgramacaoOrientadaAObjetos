package Lista;

import javax.swing.JOptionPane;

/*
 * 31. Fa�a um algoritmo que receba o peso de uma pessoa, calcule e mostre: 
 * a) o novo peso se a pessoa engordar 15% sobre o peso digitado; 
 * b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado. 
 */

public class Exercicio31 {

	public static void main(String[] args) {
		
		double peso = 0;
		double novoPesoA = 0;
		double novoPesoB = 0;
		
		
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
		
		novoPesoA = peso*0.15 + peso;
		novoPesoB = peso*0.20 + peso;
		
		
		JOptionPane.showMessageDialog(null, "Peso com acr�scimo de 15% � "+novoPesoA
				+"\nPeso com acr�scimo de 20% � "+novoPesoB);
	}

}
