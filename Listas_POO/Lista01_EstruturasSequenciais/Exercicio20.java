package Lista01_EstruturasSequenciais;

/*

20.	Uma confecção produz X blusas de lã e para isto gasta
uma certa quantidade de novelos. Faça um algoritmo para calcular
 quantos novelos de lã ela gasta por blusa.

 */

import javax.swing.*;

public class Exercicio20 {
    public static void main(String[] args) {

        int blusas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de blusas: "));
        int novelos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de novelos utilizados: "));

        int quanti_por_blusa = novelos/blusas;

        JOptionPane.showMessageDialog(null,"Foram utilizados em média "+quanti_por_blusa+" novelos por blusa");

    }
}
