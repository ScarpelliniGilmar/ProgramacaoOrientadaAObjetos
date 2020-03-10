package semana02;

import javax.swing.JOptionPane;

public class Exemplo09 {
	public static void main(String[] args) {

		
		String s = JOptionPane.showInputDialog("N1?");
		switch(s) {
			case "1": s = "Um";break;
			case "2": s = "Dois";break;
			case "3": s = "Três";break;
			case "4": s = "Quatro";break;
			case "5": s = "Cinco";break;
			default: s="Desconhecido";
		}
		JOptionPane.showMessageDialog(null, s);
		
	}

}
