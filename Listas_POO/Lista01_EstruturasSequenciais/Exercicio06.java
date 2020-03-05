package Lista01_EstruturasSequenciais;

import javax.swing.*;

/* 6.	O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição.
Escreva um algoritmo que leia o peso do prato montado pelo cliente (em quilos) e
imprima o valor a pagar. Assuma que a balança já desconte o peso do prato.
 */
public class Exercicio06 {
    public static void main(String[] args) {

        float peso = Float.parseFloat(JOptionPane.showInputDialog("Qual peso do prato em quilos: "));
        JOptionPane.showMessageDialog(null,"Total a pagar R$ "+(peso*12f));


    }
}
