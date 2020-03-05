package Lista01_EstruturasSequenciais;

import javax.swing.*;

/* 5 - Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o preço do litro
 da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no tanque.
 */

public class Exercicio05 {

    public static void main(String[] args) {

        float preco_gasolina = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço da gasolina: "));
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser inserido: "));

    System.out.println(preco_gasolina);
    System.out.println(valor);
    System.out.println("Total de Litros: "+(valor/preco_gasolina));



        
    }
}
