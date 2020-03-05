package Lista_sequencia;
import javax.swing.JOptionPane;

/*
 * 24. Um tonel de refresco é feito com 8 partes de água mineral e 
 * 2 partes de suco de maracujá. Faça um algoritmo para calcular 
 * quantos litros de água e de suco são necessários para se fazer
 *  X litros de refresco (informados pelo usuário). 
 */

public class Exercicio24 {

	public static void main(String[] args) {
		
		double tonel = Double.parseDouble(JOptionPane.showInputDialog("Digite quantidade de litros do tonel:  "));
		
		double agua,suco,calculo;
		
			calculo = tonel/100;
			agua = calculo*80;
			suco = calculo*20;
		
		JOptionPane.showMessageDialog(null, "Litros de agua = "+agua
				+ "\n Litros de suco = "+suco);
	}

}
