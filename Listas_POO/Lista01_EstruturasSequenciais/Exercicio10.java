package Lista01_EstruturasSequenciais;


/*10.	Construa um algoritmo para calcular a distância entre dois pontos
 do plano cartesiano. Cada ponto é um par ordenado (x,y).
 */

import javax.swing.*;

public class Exercicio10 {
    public static void main(String[] args) {
        double x1,x2,y1,y2,ptoab;

        x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite ponto x1"));
        x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite ponto x2"));
        y1 = Double.parseDouble(JOptionPane.showInputDialog("Digite ponto y1"));
        y2 = Double.parseDouble(JOptionPane.showInputDialog("Digite ponto y2"));

        ptoab = Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)));
JOptionPane.showMessageDialog(null, "A distancia entre A e B é: "+ ptoab);
    }
}
