package semana02;

import javax.swing.JOptionPane;

public class Exemplo07 {
	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(
				JOptionPane.showInputDialog("N1?"));
		int n2 = Integer.parseInt(
				JOptionPane.showInputDialog("N2?"));
		int n3 = Integer.parseInt(
				JOptionPane.showInputDialog("N3?"));
		
		int m = (n1>n2 && n1>n3)?n1:(n2>n3)?n2:n3;
		System.out.println("O maior valor é: "+m);

	}

}
