package Lista01_EstruturasSequenciais;

import javax.swing.*;

/*
12.	Faça um algoritmo para ler o salário de um funcionário
 e aumentá-Io em 15%. Após o aumento, desconte 8% de impostos.
  Imprima o salário inicial, o salário com o aumento e o salário final.
 */
public class Exercicio12 {
    public static void main(String[] args) {

        float salario_inicial = Float.parseFloat(JOptionPane.showInputDialog("Digite salario: "));
        double salario_aumento = salario_inicial*1.15;
        double salario_final = salario_aumento - salario_aumento*0.08;
        JOptionPane.showMessageDialog(null,"Salario inicial: "+salario_inicial +
                "\nSalario com aumento de 15%: "+salario_aumento+
                "\nSalario final descontando 8% de impostos: R$"+salario_final);


    }
}
