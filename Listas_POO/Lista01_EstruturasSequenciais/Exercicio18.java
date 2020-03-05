package Lista01_EstruturasSequenciais;


/*
18.	A empresa Hipotheticus paga R$10,00 por hora normal trabalhada,
e R$15,00 por hora extra. Faça um algoritmo para calcular e imprimir
o salário bruto e o salário líquido de um determinado funcionário.
Considere que o salário líquido é igual ao salário bruto descontando-se 10% de impostos.
 */

import javax.swing.*;

public class Exercicio18 {
    public static void main(String[] args) {

        double salario_liquido, salario_bruto, valor_hora_normal, valor_hora_extra;

        valor_hora_normal = 10;
        valor_hora_extra = 15;

        salario_bruto = valor_hora_normal*220;
        salario_liquido = (salario_bruto - (salario_bruto*0.1));

        JOptionPane.showMessageDialog(null,"Valor do Salário Bruto R$ "+salario_bruto+
                "\n Valor do Salário liquido R$ "+salario_liquido);


    }
}
