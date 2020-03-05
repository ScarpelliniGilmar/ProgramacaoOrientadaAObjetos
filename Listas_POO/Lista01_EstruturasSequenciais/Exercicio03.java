package Lista01_EstruturasSequenciais;

import javax.swing.*;

/*
3 - A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia.
 Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou com
 a venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado).
  Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler
  as quantidades de pães e de broas, e depois calcular os dados solicitados.
 */

public class Exercicio03 {
    public static void main(String[] args) {

        // solicitar a quantidade vendida
        int quant_broas = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de broas: "));
        int quant_pães = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de pães: "));

         double valor_arrecadado = (quant_broas*1.5f)+(quant_pães*0.12f); // calculo do valor arredado

         JOptionPane.showMessageDialog(null,"Valor Arrecadado: R$"+valor_arrecadado+
                 "\nGuardar na poupança: R$"+(valor_arrecadado*0.1));

    }
}
