package Lista01_EstruturasSequenciais;

/*
15.	Três amigos, Carlos, André e Felipe. decidiram rachar igualmente
 a conta de um bar. Faça um algoritmo para ler o valor total da conta
 e imprimir quanto cada um deve pagar, mas faça com que Carlos e André
 não paguem centavos. Ex: uma conta de R$101,53 resulta em R$33,00 para
 Carlos, R$33,00 para André e R$35,53 para Felipe.
 */

import javax.swing.*;

public class Exercicio15 {
    public static void main(String[] args) {

        double valor_inicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total: "));
        double andre,carlos,felipe;

        double resto = valor_inicial % 3;

        double valor_inteiro = valor_inicial-resto;

        andre = valor_inteiro/3;
        carlos = valor_inteiro/3;
        felipe = (valor_inteiro/3) +resto;



        System.out.printf("\nValor de André: R$ %.2f",andre);
        System.out.printf("\nValor de André: R$ %.2f",carlos);
        System.out.printf("\nValor de André: R$ %.2f",felipe);



    }
}
