package semana02;

import javax.swing.JOptionPane;

public class Exemplo06 {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Valor?");
		//cuidado!!!!
		if(s.equals("1")) System.out.println("UM");
		if(s.equals("2")) System.out.println("DOIS");
		if(s.equals("3")) System.out.println("TRÊS");
		//Por que isso não funciona???
	}
}
