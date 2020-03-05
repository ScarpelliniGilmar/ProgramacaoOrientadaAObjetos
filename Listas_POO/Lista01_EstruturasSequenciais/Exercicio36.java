package Lista;

import javax.swing.JOptionPane;

/*
 * 36. Faça um algoritmo que receba o valor do salário mínimo e o valor do 
 * salário de um funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse funcionário. 
 */

public class Exercicio36 {
	public static void main(String[] args) {
	
		double salarioMinimo = 0;
		double salarioFuncionario = 0;
		int quantidadeDeSalarios = 0;
		

		salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog("Digite valor do salário ménimo "));
		salarioFuncionario = Double.parseDouble(JOptionPane.showInputDialog("Digite valor do salário do funcionario "));
		quantidadeDeSalarios = (int) (salarioFuncionario/salarioMinimo);
		
		JOptionPane.showMessageDialog(null, "Este funcionario ganha "+quantidadeDeSalarios+" salários mínimos");
		
	}

}
