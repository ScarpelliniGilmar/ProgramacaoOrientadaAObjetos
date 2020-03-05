package Lista01_EstruturasSequenciais;


import javax.swing.*;

/*
21.	A fábrica de refrigerantes Meia-Cola vende seu produto
em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa
de 2 litros. Se um comerciante compra uma determinada quantidade
de cada formato, faça um algoritmo para calcular quantos litros de refrigerante ele comprou.
 */
public class Exercicio21 {
    public static void main(String[] args) {

        int quant_latas_350ml,quant_garrafas_600ml,quant_garrafas_2l;
        double  latas350ml ,garrafas600ml,garrafas2l ,total_litros;

        quant_latas_350ml = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Latas 350ml: "));
        quant_garrafas_600ml = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Garrafas 600ml: "));
        quant_garrafas_2l = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Garrafas 2L: "));

        latas350ml = 0.35;
        garrafas600ml = 0.6;
        garrafas2l = 2;

        total_litros = (quant_latas_350ml*latas350ml) + (quant_garrafas_600ml*garrafas600ml) + (quant_garrafas_2l*garrafas2l);

        JOptionPane.showMessageDialog(null,"Total de "+total_litros+" litros");

    }
}

