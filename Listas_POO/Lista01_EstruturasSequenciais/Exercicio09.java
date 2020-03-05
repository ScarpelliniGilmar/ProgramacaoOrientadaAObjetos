package Lista01_EstruturasSequenciais;

import javax.swing.*;

/* 9.	Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande,
 cada uma sendo vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo
 em que o usuário forneça a quantidade de camisetas pequenas, médias e grandes referentes
  a uma venda, e a máquina informe quanto será o valor arrecadado.
 */
public class Exercicio09 {
    public static void main(String[] args) {
        float p = Float.parseFloat(JOptionPane.showInputDialog("Quantidade de camisetas P: "));
        float m = Float.parseFloat(JOptionPane.showInputDialog("Quantidade de camisetas M: "));
        float g = Float.parseFloat(JOptionPane.showInputDialog("Quantidade de camisetas G: "));


        float soma = ((p*10) + (m*12) + (g*15));
        JOptionPane.showMessageDialog(null, "Valor arrecadado: "+soma);
    }
}
