package Lista01_EstruturasSequenciais;

import javax.swing.*;

/*
16.	A lanchonete Gostosura vende apenas um tipo de sanduíche,
 cujo recheio inclui duas fatias de queijo, uma fatia de presunto
 e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou
 presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas,
  faça um algoritmo em que o dono forneça a quantidade de sanduíches a fazer,
   e a máquina informe as quantidades (em quilos) de queijo, presunto e carne
    necessários para compra.
 */
public class Exercicio16 {
    public static void main(String[] args) {

        int quant_hamburguer = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de Sanduíches: "));
        float queijo = quant_hamburguer*100;
        float presunto = quant_hamburguer*50;
        float hambunguer = quant_hamburguer*100;

        JOptionPane.showMessageDialog(null,"Para "+quant_hamburguer+ " samduíches "+
                "\nSerão necessários: "+(queijo/1000)+" quilos de queijo;"+
                "\nSerão necessários: "+(presunto/1000)+" quilos de presunto;"+
                "\nSerão necessários: "+(hambunguer/1000)+ " quilos de presunto.");
    }
}
