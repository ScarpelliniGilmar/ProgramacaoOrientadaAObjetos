package Lista;

import javax.swing.JOptionPane;

/*
 * 29. Fa�a um algoritmo que receba o pre�o de um produto,
 *  calcule e mostre o novo pre�o, sabendo-se que este sofreu
 *   um desconto de 10%. 
 */
public class Exercicio29 {
	public static void main(String[] args) {

		double valor,novoValor;

		
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o do produto: "));
			novoValor = valor - valor*0.1;
			JOptionPane.showMessageDialog(null, "Valor com desconto R$ "+novoValor);
		
	}

}
