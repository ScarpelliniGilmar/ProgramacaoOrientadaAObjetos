package semana03;

import javax.swing.JOptionPane;

public class DoWhile01 {

	public static void main(String[] args) {
		
		float nota1 = -1;
		do {
			try {
			   nota1 = Float.parseFloat(
					JOptionPane.showInputDialog("Nota1?"));
			}
			catch(NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, 
						"Digite novamente!");
			}
			catch(NullPointerException erro) {
				JOptionPane.showMessageDialog(null, 
						"Cancelar Pressionado!");
				System.exit(0);//encerra a app
			}
		}
		while(nota1<0 || nota1>10);

		float nota2 = -1;
		do {
			nota2 = Float.parseFloat(
					JOptionPane.showInputDialog("Nota2?"));
		}
		while(nota2<0 || nota2>10);
		
		float media = (nota1+nota2)/2;
		System.out.println("A média é "+media);
	}

}
