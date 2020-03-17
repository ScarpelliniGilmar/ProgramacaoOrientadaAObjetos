package ListaDeMetodosSemRetorno;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ExercicioTest {

	public static void main(String[] args) {
		
	//Testando método a
	String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
	Exercicio.Palavra(palavra);	
	
	//Testando método b
	int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da tabuada de 1 a 10: "));
	Exercicio.Tabuada(numero);	

	//Testando método c
	Exercicio.NumeroAleatorio();
		
	//Testando método d
	Exercicio.DiaDaSemana(Integer.parseInt(JOptionPane.showInputDialog("Digite número de 1 a 7")));
	
	//Testando método e		
	List<String> lista = new ArrayList<String>();
	lista.add("Ana");
	lista.add("Bia");
	lista.add("Carlos");
	lista.add("Diego");
	lista.add("Daniela");	
	Exercicio.ListaDeNomes(lista);
		
	}	
}
