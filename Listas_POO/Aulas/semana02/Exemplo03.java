package semana02;

import javax.swing.JOptionPane;

public class Exemplo03 {
	public static void main(String[] args) {
		String nome = 
			JOptionPane.showInputDialog("Nome?");
		String idade = 
			JOptionPane.showInputDialog("Idade?");
		JOptionPane.showMessageDialog(null, 
				      nome+"\n"+idade);
	}
}
