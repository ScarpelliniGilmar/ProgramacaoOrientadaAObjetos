package Lista01_EstruturasSequenciais;


/*
4 - Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida ela possui.
Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa com 19 anos possui 6935 dias de vida;
veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935 DIAS
 */

import javax.swing.*;

public class Exercicio04 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

        JOptionPane.showMessageDialog(null,nome+", você já viveu "+idade*365+" dias!!!");

    }
}
