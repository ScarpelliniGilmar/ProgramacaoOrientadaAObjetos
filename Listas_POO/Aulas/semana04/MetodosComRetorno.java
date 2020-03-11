package semana04;

public class MetodosComRetorno {


	public static final int QTDE_MINIMA_DE_CARACTERES = 8;

	/**
	 * Retorna a soma de dois valores inteiros
	 * @param a - o primeiro valor
	 * @param b - o segundo vaçpr
	 * @return - a soma dos valores
	 */
	public static int somar(int a, int b) {		
		return a+b;		
	}

	/**
	 * Simula um dadinho de 6 passos
	 * @return
	 */
	public static int jogarDado() {
		return (int) (Math.random()*6)+1;			
	}


	/**
	 * Gera um vetor com numeros inteiros entre 0 e 999
	 * @param qtde - a quantidade de valores
	 * @return - um valor de inteiro com valores aleatorios
	 */
	public static int [] gerarDados(int qtde){
		int [] v = new int[qtde];
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random()*1000);
			System.out.println();			
		}
		return v;		
	}

	/**
	 * Métodos que receba um valor inteiro e realiza a soma de sues algarismos
	 * @param numero - o número a ser somado
	 * @return - a soma dos digitoss
	 */
	public static int somarDigitos(int numero)	{
		//		poderia ser resolvido com divisões
		//		sucesso com módulo
		String s = ""+numero;
		int soma = 0;
		for (int a = 0; a < s.length(); a++) {
			soma+=Integer.parseInt(s.substring(a,a+1));			
		}
		return soma;
	}


	/**
	 * Valida a senha de acordo com RN01
	 * @param senha - a senha a ser verificada
	 * @return - true em caso de válida
	 */
	public static boolean validarSenha(String senha) {		
		if (senha.length()<QTDE_MINIMA_DE_CARACTERES) 
			return false;
		else {
			//to be continued
			if(temAlgarismos(senha) && temLetras(senha)) {
				return true;
			}	else {
				return false;	
			}
		}
	}


	public static boolean temLetras(String senha) {
		return false;
	}

	public static boolean temAlgarismos(String senha) {
		return false;

	}
}






