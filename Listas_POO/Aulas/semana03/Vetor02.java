package semana03;

public class Vetor02 {

	public static void main(String[] args) {
		
		double[] n = null;
		n = new double[10];
		
		double[] notas = new double[5];
		notas[3] = 4.5;
		notas[0] = 6.5;
		notas[2] = 8.5;
		notas[1] = 10;
		notas[4] = 9.5;
		
		double media = 0;
		for(int a=0; a<notas.length; a++) {
			//System.out.println(notas[a]);
			media+=notas[a];
		}
		media = media/notas.length;
		System.out.println(media);

	}

}
