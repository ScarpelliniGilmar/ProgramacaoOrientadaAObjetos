package Lista;

import javax.swing.JOptionPane;

/*
 * 39. Jo�o recebeu seu sal�rio de R$ 1200,00 e precisa pagar
 *  duas contas (C1=R$ 200,00 e C2=R$120,00) que est�o atrasadas.
 *   Como as contas est�o atrasadas, Jo�o ter� de pagar multa de 
 *   2% sobre cada conta. Fa�a um algoritmo que calcule e mostre 
 *   quanto restar� do sal�rio do Jo�o 
 */

public class Exercicio39 {
	public static void main(String[] args) {
	
		double salario = 1200;
		double c1 = 200*1.02;
		double c2 = 120*1.02;
		double restoSalario = salario-(c1+c2);

		JOptionPane.showMessageDialog(null, "Sal�rio R$"+salario+
				"\nConta 1 com jutos R$ "+c1+
				"\nConta 2 com jutos R$ "+c2+
				"\nResto do sal�rio R$ "+restoSalario);
				
		
		
	}

}
