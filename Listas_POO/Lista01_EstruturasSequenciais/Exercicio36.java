package Lista;

import javax.swing.JOptionPane;

/*
 * 36. Fa�a um algoritmo que receba o valor do sal�rio m�nimo e o valor do 
 * sal�rio de um funcion�rio, calcule e mostre a quantidade de sal�rios m�nimos que ganha esse funcion�rio. 
 */

public class Exercicio36 {
	public static void main(String[] args) {
	
		double salarioMinimo = 0;
		double salarioFuncionario = 0;
		int quantidadeDeSalarios = 0;
		

		salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog("Digite valor do sal�rio m�nimo "));
		salarioFuncionario = Double.parseDouble(JOptionPane.showInputDialog("Digite valor do sal�rio do funcionario "));
		quantidadeDeSalarios = (int) (salarioFuncionario/salarioMinimo);
		
		JOptionPane.showMessageDialog(null, "Este funcionario ganha "+quantidadeDeSalarios+" sal�rios m�nimos");
		
	}

}
