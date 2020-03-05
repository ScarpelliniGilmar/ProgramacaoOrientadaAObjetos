package Lista01_EstruturasSequenciais;



//14.	Calcule a área de uma pizza que possui um raio R (pi=3.14).

import javax.swing.*;

public class Exercicio14 {
    public static void main(String[] args) {

        double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite valor do raio: "));
        double pi = 3.14;

        double area = (Math.pow(raio, 2))*Math.PI;

        JOptionPane.showMessageDialog(null,"Area é igual a "+area+"m²");

    }
}
