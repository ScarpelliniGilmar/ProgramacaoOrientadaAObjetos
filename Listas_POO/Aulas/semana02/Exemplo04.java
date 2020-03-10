package semana02;

import javax.swing.JOptionPane;

public class Exemplo04 {
	public static void main(String[] args) {
		double n1 = Double.parseDouble(
			JOptionPane.showInputDialog("Valor 1?"));
		double n2 = Double.parseDouble(
			JOptionPane.showInputDialog("Valor 2?"));
		System.out.println("Soma: "+(n1+n2));
		System.out.println("Subtração: "+(n1-n2));
		System.out.println("Multiplicação: "+(n1*n2));
		System.out.println("Divisão: "+(n1/n2));
		JOptionPane.showMessageDialog(null, 
				"Valores digitados: "+n1+" e "+n2+"\n"+
				"Soma: "+(n1+n2)+"\n"+
				"Subtração: "+(n1-n2)+"\n"+
				"Multiplicação: "+(n1*n2)+"\n"+
				"Divisão: "+(n1/n2));
	}
}
