package Lista02_EstruturasCondicionais;


import javax.swing.*;

/*
7) Faça um algoritmo que leia uma variável e some 5 caso
seja par ou some 8 caso seja ímpar, imprimir o resultado desta operação.
 */
public class Exercicio07 {
    public static void main(String[] args) {

        int variavel = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da variavel: "));

        if(variavel % 2 == 0){
            JOptionPane.showMessageDialog(null,"O valor "+variavel+" é par, portanto o novo número é "+variavel+" + 5 = "+(variavel+5));

        }else        {
            JOptionPane.showMessageDialog(null,"O valor "+variavel+" é impar, portanto o novo número é "+variavel+" + 8 = "+(variavel+8));
        }

    }
}
