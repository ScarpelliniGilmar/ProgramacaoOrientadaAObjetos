package semana03;

import javax.swing.JOptionPane;

public class For02 {

	public static void main(String[] args) {
		int maxLinha = Integer.parseInt(
				JOptionPane.showInputDialog("Linhas?"));
		int maxColuna = Integer.parseInt(
				JOptionPane.showInputDialog("Colunas?"));
		
		for(int linha=1;linha<=maxLinha;linha++) {
			for(int coluna=1; coluna<=maxColuna;coluna++) {
				System.out.println("["+linha+","+coluna+"]");
			}
		}

	}

}
