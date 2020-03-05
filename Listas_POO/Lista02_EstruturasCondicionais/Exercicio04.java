package Lista02_EstruturasCondicionais;
/*
4) Faça um algoritmo que leia dois valores inteiros A e B se os
valores forem iguais deverá se somar os dois, caso contrário multiplique
 A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado
  para uma variável C e mostrar seu conteúdo na tela.
 */

import javax.swing.*;

public class Exercicio04 {
    public static void main(String[] args) {

        int a,b,c;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));

        if (a == b){
            c = a+b;
            JOptionPane.showMessageDialog(null,"Valor A+B é "+c);
        }else {
            c = a*b;
            JOptionPane.showMessageDialog(null,"Valor A*B é "+c);
        }


    }
}
