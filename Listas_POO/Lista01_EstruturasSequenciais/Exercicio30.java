package Lista;

import javax.swing.JOptionPane;

public class Exercicio30 {

	/*
	 * 30. Um funcionário recebe um salário fixo mais 4% de
	 *  comissão sobre as vendas. Faça um algoritmo que receba o 
	 *  salário fixo de um funcionário e o valor de suas vendas, 
	 *  calcule e mostre a comissão e o salário final do funcionário. 
	 */
	public static void main(String[] args) {
		
		double salarioFixo = 0,ValorDasVendas = 0, salarioFinal = 0;
		
		salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário "));
		ValorDasVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de suas vendas "));
		salarioFinal = (ValorDasVendas * 0.04)+salarioFixo;
		
		JOptionPane.showMessageDialog(null, "Salário final R$"+salarioFinal);
	}

}
