package Lista02_EstruturasCondicionais;


/*
9) Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule
seu peso ideal, utilizando as seguintes fórmulas: ● para homens: (72.7 * h) – 58; ● para mulheres: (62.1 * h) – 44.7.
 */

import javax.swing.*;

public class Exercicio09 {
    public static void main(String[] args) {

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
        String sexo = JOptionPane.showInputDialog("Digite sexo: ");

        if (sexo == "masculino"){
            JOptionPane.showMessageDialog(null," Seu peso ideal é "+((72.7*altura)-58));

        }else {
            JOptionPane.showMessageDialog(null," Seu peso ideal é "+((62.1*altura)-44.7));
        }


    }
}
