package Lista02_EstruturasCondicionais;

/*
8) Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os em ordem decrescente.
 */

import javax.swing.*;

public class Exercicio08 {
    public static void main(String[] args) {

        int primeiroNumero,segundoNumero,terceiroNumero,op=1,n1,n2,n3;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor:"));


      if (n1 < n2 && n1 < n3){
          primeiroNumero = n1;
          if (n2 < n3){
              segundoNumero = n2;
              terceiroNumero = n3;
          }else{
              segundoNumero = n3;
              terceiroNumero = n2;
          }
        }else if(n2 < n1 && n2 < n3){
          primeiroNumero = n2;
          if (n1 < n3){
              segundoNumero = n1;
              terceiroNumero = n3;
          } else{
              segundoNumero = n3;
              terceiroNumero = n1;
          }
      } else {
          primeiroNumero = n3;
          if (n1 < n2){
              segundoNumero = n1;
              terceiroNumero = n2;
          }else{
              segundoNumero = n2;
              terceiroNumero = n1;
          }
      }

      JOptionPane.showMessageDialog(null,"Ordem crescente: " +
              "\n 1º = "+ primeiroNumero+
              "\n 2º = "+ segundoNumero+
              "\n 3º = "+ terceiroNumero);

      JOptionPane.showMessageDialog(null,"Ordem decrescente: " +
              "\n 3º = "+ terceiroNumero+
              "\n 2º = "+ segundoNumero+
              "\n 1º = "+ primeiroNumero);

    }
}