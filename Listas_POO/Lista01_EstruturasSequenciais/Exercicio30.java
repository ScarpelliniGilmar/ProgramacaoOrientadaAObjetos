package Lista;

import javax.swing.JOptionPane;

public class Exercicio30 {

	/*
	 * 30. Um funcion�rio recebe um sal�rio fixo mais 4% de
	 *  comiss�o sobre as vendas. Fa�a um algoritmo que receba o 
	 *  sal�rio fixo de um funcion�rio e o valor de suas vendas, 
	 *  calcule e mostre a comiss�o e o sal�rio final do funcion�rio. 
	 */
	public static void main(String[] args) {
		
		double salarioFixo = 0,ValorDasVendas = 0, salarioFinal = 0;
		
		salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite seu sal�rio "));
		ValorDasVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de suas vendas "));
		salarioFinal = (ValorDasVendas * 0.04)+salarioFixo;
		
		JOptionPane.showMessageDialog(null, "Sal�rio final R$"+salarioFinal);
	}

}
