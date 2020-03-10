package semana02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exemplo11 {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("Teste.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
