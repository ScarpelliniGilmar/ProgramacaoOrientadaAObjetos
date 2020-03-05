package Lista;

import javax.swing.JOptionPane;

/*
 * 29. Faça um algoritmo que receba o preço de um produto,
 *  calcule e mostre o novo preço, sabendo-se que este sofreu
 *   um desconto de 10%. 
 */
public class Exercicio29 {
	public static void main(String[] args) {

		double valor,novoValor;

		
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto: "));
			novoValor = valor - valor*0.1;
			JOptionPane.showMessageDialog(null, "Valor com desconto R$ "+novoValor);
		
	}

}
