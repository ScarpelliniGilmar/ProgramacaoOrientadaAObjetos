package semana02;

import javax.swing.JOptionPane;

public class Exemplo08 {
	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(
				JOptionPane.showInputDialog("N1?"));
		
		String s = "";
		switch(n1) {
			case 1: s = "Um";break;
			case 2: s = "Dois";break;
			case 3: s = "Três";break;
			case 4: s = "Quatro";break;
			case 5: s = "Cinco";break;
			default: s="Desconhecido";
		}
		JOptionPane.showMessageDialog(null, s);
		
	}

}
