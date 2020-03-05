package Lista02_EstruturasCondicionais;
/*
5) Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o resultado.
 */

import javax.swing.*;

public class Exercicio05 {
    public static void main(String[] args) {

        double num,resultado;
        num = Double.parseDouble(JOptionPane.showInputDialog("Digite o número:"));

        if (num >=  0){
            resultado = num*2;
    JOptionPane.showMessageDialog(null, "O número "+num+" é POSITIVO e o DOBRO é "+resultado);
            }else{
            resultado = num*3;
            JOptionPane.showMessageDialog(null, "O número "+num+" é NEGATIVO e o TRIPLO é "+resultado);
        }
    }
}
