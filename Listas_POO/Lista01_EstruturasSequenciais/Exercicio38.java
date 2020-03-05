package Lista;

import java.util.Calendar;

import javax.swing.JOptionPane;

/*
 * 38. Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre: 
 * a) a idade dessa pessoa em anos; 
 * b) a idade dessa pessoa em meses;
 * c) a idade dessa pessoa em dias; 
 * d) a idade dessa pessoa em semanas
 */

public class Exercicio38 {
	public static void main(String[] args) {
		
		int anoDeNascimento = 0;
		int anoAtual = 0;
		int idade = 0;
		int meses = 0;
		int dias = 0;
		int semanas = 0;
		
		
		anoDeNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite ano de nascimento"));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite ano Atual"));
		
		idade = anoAtual-anoDeNascimento;
		meses = idade*12;
		dias = idade*365;
		semanas = idade*52;
	
		JOptionPane.showMessageDialog(null, "Idade em anos = "+idade+
				"\nOu "+meses+" meses"+
				"\nOu "+dias+" dias"+
				"\nOu "+semanas+" semanas");

	}

}
