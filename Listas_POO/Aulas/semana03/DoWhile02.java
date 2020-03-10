package semana03;

import javax.swing.JOptionPane;

public class DoWhile02 {

	public static void main(String[] args) {
		//caixa de mercado
		double total = 0;
		double preco = 0;
		do {
			preco = Double.parseDouble(
				JOptionPane.showInputDialog("Preço?"));
			//total+=(preco>=0)?preco:0;
			if(preco>0) {
				total+=preco;
			}
		}
		while(preco!=0);
		System.out.println("Total: "+total);

	}

}
