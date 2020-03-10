package semana03;

public class Vetor01 {

	public static void main(String[] args) {
		
		String[] nomes = {"Ana","Bia","Denilson"};
		int[] idades = {14,45,32};
		int[] copiaIdades = idades;
		copiaIdades[0] = 41;
		
		System.out.println(nomes[0]);
		System.out.println(nomes[1]);
		System.out.println(nomes[2]);
		//System.out.println(nomes[3]);
		
		int tamanho = nomes.length;
		for(int a=0; a<tamanho; a++) {
			System.out.println(nomes[a]+"-"+idades[a]);
		}


	}

}
