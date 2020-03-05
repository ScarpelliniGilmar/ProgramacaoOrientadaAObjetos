package Lista01_EstruturasSequenciais;

import javax.swing.*;

/*
19.	A granja Frangotech possui um controle automatizado de cada
frango da sua produção. No pé direito do frango há um anel com um
chip de identificação; no pé esquerdo são dois anéis para indicar
o tipo de alimento que ele deve consumir. Sabendo que o anel com
chip custa R$4,00 e o anel de alimento custa R$3,50, faça um algoritmo
 para calcular o gasto total da granja para marcar todos os seus frangos.
 */
public class Exercicio19 {
    public static void main(String[] args) {

        double  gasto_total= 0,anel_alimen = 7, anel_identi = 4.00;

        int quant_frangos = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de frangos: "));

         gasto_total = anel_alimen*quant_frangos + anel_identi*quant_frangos;

         JOptionPane.showMessageDialog(null,"Gasto total com anéis R$ "+gasto_total);

    }
}
