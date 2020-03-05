package Lista01_EstruturasSequenciais;

import javax.swing.*;

/*
13.	Ler um número inteiro (assuma até três dígitos) e imprimir a saída da seguinte forma:
 CENTENA = x
DEZENA = x UNIDADE = x

 */
public class Exercicio13 {
    public static void main(String[] args) {
        int num_digitado = Integer.parseInt(JOptionPane.showInputDialog("Digite numero inteiro com 3 digitos: "));

    int x = num_digitado;

        int centena = x / 100;// encontra a centena dividindo por 100
        x = x % 100;// pegar o resto da divisao por 100
        int dezena = x / 10;// encontra a dezena dividindo por 10
        x = x % 10;// pega o resto da divisao por 10 para encontrar a unidade

        int unidade = x;
        System.out.println(x);

        JOptionPane.showMessageDialog(null,"Numero digitado: "+num_digitado+
                "\nCentena: "+centena+
                "\nDezena: "+dezena+
                "\nUnidade: "+unidade);

    }
}
