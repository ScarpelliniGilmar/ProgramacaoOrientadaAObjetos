package Lista01_EstruturasSequenciais;

/* 7 - Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde
o início do ano. Esqueça a questão dos anos bissextos e considere sempre que um mês possui 30 dias.
 */


import javax.swing.*;

public class Exercicio07 {
    public static void main(String[] args) {

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe e dia"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº do mês"));

        JOptionPane.showMessageDialog(null,"Se passaram "+((mes*30)+dia)+" dias desde o inicio do ano");
    }
}
