package semana02;

import javax.swing.JOptionPane;

public class Exemplo10 {

	public static void main(String[] args) {
		
		try {
			int n = Integer.parseInt(
					JOptionPane.showInputDialog("N?"));
			int m = Integer.parseInt(
					JOptionPane.showInputDialog("M?"));
			int r = n/m;
			System.out.println(r);
		}
		catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null,
					 "Forneça um valor numérico!!\n"+
			          erro.toString());
		}
		catch(ArithmeticException erro) {
			JOptionPane.showMessageDialog(null,
					 "O valor de M não pode ser zero!!\n"+
			          erro.toString());
		}
		finally {
			JOptionPane.showMessageDialog(null,"Fim");
		}

	}

}
