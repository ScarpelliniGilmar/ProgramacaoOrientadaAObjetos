package Lista01_EstruturasSequenciais;

import javax.swing.*;

/*
22.	Pedrinho tem um cofrinho com muitas moedas, e deseja saber
quantos reais conseguiu poupar. Faça um algoritmo para ler a quantidade
 de cada tipo de moeda, e imprimir o valor total economizado, em reais.
  Considere que existam moedas de 1, 5, 10, 25 e 50 centavos, e ainda moedas
   de 1 real. Não havendo moeda de um tipo, a quantidade respectiva é zero.
 */
public class Exercicio22 {
    public static void main(String[] args) {

        int moeda_1c,moeda_5c,moeda_10c,moeda_25c,moeda50c,moeda_1r;


            moeda_1c = Integer.parseInt(JOptionPane.showInputDialog("Fornece quantidade de moeda de 1 centavo: "));
            moeda_5c = Integer.parseInt(JOptionPane.showInputDialog("Fornece quantidade de moeda de 5 centavos: "));
            moeda_10c = Integer.parseInt(JOptionPane.showInputDialog("Fornece quantidade de moeda de 10 centavos: "));
            moeda_25c = Integer.parseInt(JOptionPane.showInputDialog("Fornece quantidade de moeda de 25 centavos: "));
            moeda50c = Integer.parseInt(JOptionPane.showInputDialog("Fornece quantidade de moeda de 50 centavos: "));
            moeda_1r = Integer.parseInt(JOptionPane.showInputDialog("Fornece quantidade de moeda de 1 real: "));

        double valor_total = moeda_1c*0.01 + moeda_5c*0.05 + moeda_10c*0.10 + moeda_25c*0.25 + moeda50c*0.50 + moeda_1r*1;

        JOptionPane.showMessageDialog(null, String.format("Valor total é de R$ %.2f ",valor_total));




    }
}


