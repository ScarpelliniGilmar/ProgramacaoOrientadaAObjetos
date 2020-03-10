package semana03;

import javax.swing.JOptionPane;

public class While02 {

	public static void main(String[] args) {
		
		
		//nota deve estar entre 0 e 10
/*
		while(true) {
			nota = Double.parseDouble(
				JOptionPane.showInputDialog("Nota?"));
			if(nota>=0 && nota<=10) break;
		}
*/
		double nota=20; //força entrar no laço
		while(nota<0 || nota>10) {
			nota = Double.parseDouble(
				JOptionPane.showInputDialog("Nota?"));
		}
		System.out.println(nota);

	}

}
