package semana03;

import java.util.*;

public class Lista01 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("Ana");
		lista.add("Bia");
		lista.add("Carlos");
		for(String nome:lista) {
			System.out.println(nome);
		}
	}

}
