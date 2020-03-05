package Lista;

import javax.swing.JOptionPane;

/*
 * 32. Faça um algoritmo que receba o peso de uma pessoa em quilos, 
 * calcule e mostre esse peso em gramas. 
 */
public class Exercicio32 {

	public static void main(String[] args) {
		
		double pesoQuilos = 0;
		double pesoGramas = 0;
		
		pesoQuilos = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso em quilos"));
		
		pesoGramas = pesoQuilos*1000;
		
		JOptionPane.showMessageDialog(null, "O peso em grama é "+pesoGramas);

	}

}
