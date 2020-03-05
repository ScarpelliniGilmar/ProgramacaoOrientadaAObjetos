package Lista02_EstruturasCondicionais;
/*
3) Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar.
 */

import javax.swing.*;

public class Exercicio03 {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite numero: "));

        if(num % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número "+num+" é par");

        }else{
            JOptionPane.showMessageDialog(null, "O número "+num+" é impar");
        }

    }
}
