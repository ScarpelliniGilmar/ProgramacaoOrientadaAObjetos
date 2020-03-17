package ListaDeMetodosComRetorno;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ExercicioTest {

	public static void main(String[] args) {

		// Testando m�todo F
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(84);
		lista.add(7);
		lista.add(50);
		lista.add(99);
		lista.add(15);
		lista.add(32);
		Exercicio.ListaDePares(lista);

		// Testando m�todo G
		int[] numeros = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		Exercicio.Soma(numeros);

		// Testando m�todo H
		double nota = 0;
		List<Double> listaNota = new ArrayList<Double>();
		while (nota != -1) {
			nota = Double
					.parseDouble(JOptionPane.showInputDialog("******************| CALCULANDO M�DIA |*****************"
							+ "\nDigite a Nota de 1 e 10 para calcular a m�dia" + "\n-1 para sair "));

			if (nota >= 0 && nota < 11) {
				listaNota.add(nota);
			}

		}
		Exercicio.Nota(listaNota);

		// Testando m�todo I
		Exercicio.gerarDados(10, 100);

		// Testando m�todo J
		Exercicio.VerificaCPF("11111111111");

	}

}
