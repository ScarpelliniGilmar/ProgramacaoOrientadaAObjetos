package Lista02_EstruturasCondicionais;
/*
2) Faça um algoritmo que leia o nome, o sexo e o estado civil
de uma pessoa. Caso sexo seja “F” e estado civil seja “CASADA”,
solicitar o tempo de casada (anos).
 */

import javax.swing.*;

public class Exercicio02 {
    public static void main(String[] args) {

        String nome,estado_civil;
        String sexo;
        int anos_casado;

        nome = JOptionPane.showInputDialog("Digite seu nome:");
        sexo = JOptionPane.showInputDialog("Digite sexo \n" +
                "F para Feminino\n" +
                "M para Masculino");
        estado_civil = JOptionPane.showInputDialog("Digite estado civil:\n" +
                "casado\n" +
                "solteiro\n" +
                "divorciado\n" +
                "viuvo");


        if(estado_civil.equals("casado")){
            anos_casado = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos de casado: "));

            JOptionPane.showMessageDialog(null, "Nome: "+nome+
            "\nSexo: "+sexo+
            "\nEstado Civil: "+estado_civil+
            "\nAnos de casado: "+anos_casado);
        }else {
            JOptionPane.showMessageDialog(null, "Nome: "+nome+
                    "\nSexo: "+sexo+
                    "\nEstado Civil: "+estado_civil);
        }

    }
}
