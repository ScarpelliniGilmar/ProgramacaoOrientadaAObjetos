package semana02;

import javax.swing.JOptionPane;

public class Exemplo05 {
	public static void main(String[] args) {
		
		int a = Integer.parseInt(
			JOptionPane.showInputDialog("idade"));
		String faixa = "Desconhecido";
		if(a<=3) faixa = "Beb�";
		else if(a<=12) faixa = "Crian�a";
		else if(a<=18) faixa = "Aborrecente";

		JOptionPane.showMessageDialog(null, faixa);
		

	}
}
