package ListaDeMetodosSemRetorno;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ExercicioTest {

	public static void main(String[] args) {
		
	//Testando m�todo a
	String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
	Exercicio.Palavra(palavra);	
	
	//Testando m�todo b
	int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero da tabuada de 1 a 10: "));
	Exercicio.Tabuada(numero);	

	//Testando m�todo c
	Exercicio.NumeroAleatorio();
		
	//Testando m�todo d
	Exercicio.DiaDaSemana(Integer.parseInt(JOptionPane.showInputDialog("Digite n�mero de 1 a 7")));
	
	//Testando m�todo e		
	List<String> lista = new ArrayList<String>();
	lista.add("Ana");
	lista.add("Bia");
	lista.add("Carlos");
	lista.add("Diego");
	lista.add("Daniela");	
	Exercicio.ListaDeNomes(lista);
		
	}	
}
