package Lista01_EstruturasSequenciais;

import javax.swing.*;

/*

23.	Num dia de sol, você deseja medir a altura de um prédio,
 porém, a trena não é suficientemente longa. Assumindo que seja
 possível medir sua sombra e a do prédio no chão, e que você lembre
 da sua altura, faça um algoritmo para ler os dados necessários e calcular a altura do prédio.

 */
public class Exercicio23 {
    public static void main(String[] args) {


        double sombra_predio, sombra_usuario, altura_usuario,altura_predio;

        sombra_predio = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da sombra do prédio: "));
        sombra_usuario = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da sua sombra: "));
        altura_usuario = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));


        altura_predio = (sombra_predio/sombra_usuario) *altura_usuario;


        JOptionPane.showMessageDialog(null, String.format("A altura total do prédio é de %.2f",altura_predio," metros"));



    }
}
