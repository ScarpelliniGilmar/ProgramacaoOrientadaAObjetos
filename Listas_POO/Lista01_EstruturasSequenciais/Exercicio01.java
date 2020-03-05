package Lista01_EstruturasSequenciais;

import javax.swing.*;

// 1- A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo para ler as dimensões
// de um terreno e depois ixibir a área do terreno.

public class Exercicio01 {
    public static void main(String[] args) {

        float largura = Float.parseFloat(JOptionPane.showInputDialog("Informe a Largura do Terreno: "));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do Terreno: "));

        JOptionPane.showMessageDialog(null, "Area do terreno: "+largura*altura);

    }
}
