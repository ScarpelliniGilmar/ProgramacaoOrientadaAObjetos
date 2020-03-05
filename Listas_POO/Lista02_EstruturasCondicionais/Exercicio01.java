package Lista02_EstruturasCondicionais;

/*
1 - Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor que C.
 */

import javax.swing.*;

public class Exercicio01 {
    public static void main(String[] args) {
        int a,b,c;

        a = Integer.parseInt(JOptionPane.showInputDialog("Forneça o valor de A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Forneça o valor de B"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Forneça o valor de C"));

        if(a+b>c){
            JOptionPane.showMessageDialog(null,"Soma de A ("+a+") + B ("+b+") é maior que C ("+c+")");


        }else {
            JOptionPane.showMessageDialog(null,"Soma de A ("+a+") + B ("+b+") não é maior que C ("+c+")");
        }



    }
}
