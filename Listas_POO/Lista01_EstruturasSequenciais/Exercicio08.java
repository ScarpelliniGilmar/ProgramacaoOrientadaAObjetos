package Lista01_EstruturasSequenciais;


import javax.swing.*;

/*8.	Faça um algoritmo para ler três notas
de um aluno em uma disciplina e imprimir a sua média ponderada
(as notas tem pesos respectivos de 1, 2 e 3).
 */
public class Exercicio08 {
    public static void main(String[] args) {

        float soma = 0;

        for(int i=1; i<=3;i++){
            float nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a "+i+"ª Nota:"));
            soma = (soma+ nota);

        }

        JOptionPane.showMessageDialog(null,"Média: "+(soma/3));
    }
}
