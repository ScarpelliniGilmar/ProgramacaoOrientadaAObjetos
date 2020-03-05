package Lista01_EstruturasSequenciais;


import javax.swing.*;

/*
11.	Uma fábrica controla o tempo de trabalho sem acidentes
pela quantidade de dias. Faça um algoritmo para converter
 este tempo em anos, meses e dias. Assuma que cada mês possui sempre 30 dias.
 */
public class Exercicio11 {
    public static void main(String[] args) {

        int entrada_dias = Integer.parseInt(JOptionPane.showInputDialog("Fornece a quantidade de dias sem acidente: "));

        int rest_ano,rest_mes,mes,dias;
        int anos = entrada_dias/365;

        rest_ano = entrada_dias-(anos*365);

        mes = rest_ano/30;
        rest_mes = rest_ano -(mes*30);
        dias = rest_mes;

       String a = Integer.toString(anos);

        if(anos >= 1){
            JOptionPane.showMessageDialog(null,"Tempo sem acidentes: "+anos+ " anos, " +
                    mes+" meses e "+dias+" dias");
        }else  {
            JOptionPane.showMessageDialog(null,"Tempo sem acidentes: "+anos+ " ano, " +
                    mes+" meses e "+dias+" dias");
        }



    }
}
