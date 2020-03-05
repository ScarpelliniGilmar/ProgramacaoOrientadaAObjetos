package Lista01_EstruturasSequenciais;
/*
17.	Alguns países medem temperaturas em graus Celsius, e outros em graus Fahrenheit.
 Faça um algoritmo para ler uma temperatura Celsius e imprimi-Ia em Fahrenheit (pesquise
  como fazer este tipo de conversão).
 */

import javax.swing.*;

public class Exercicio17 {
    public static void main(String[] args) {


                int celsius  = Integer.parseInt(JOptionPane.showInputDialog("Informe o grau Celsius: "));
        int fahrenhait = ((celsius*9/5)+32);
        JOptionPane.showMessageDialog(null,celsius+" graus celsius é o mesmo que "+fahrenhait+" graus fahrenhait");

    }
}
