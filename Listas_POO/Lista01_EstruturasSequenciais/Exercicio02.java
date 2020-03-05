package Lista01_EstruturasSequenciais;


//2 - Faça um algoritmo para calcular quantas ferraduras são necessarias para
// equipar todos os cavalos comprados para um haras.


import javax.swing.*;

public class Exercicio02 {
    public static void main(String[] args) {

        int quantidade_ferraduras = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de cavalos: "));

        JOptionPane.showMessageDialog(null,"Serão necessárias "+(quantidade_ferraduras*4)+ " ferraduras.");

    }
}
