package Lista02_EstruturasCondicionais;

/*

 10) O IMC – Indice de Massa Corporal é um critério da Organização Mundial de Saúde para
 dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2
  Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo.

IMC em adultos Condição

 Abaixo de 18,5 Abaixo do peso
 Entre 18,5 e 25 Peso normal
  Entre 25 e 30 Acima do peso
   Acima de 30 obeso
 */

import javax.swing.*;

public class Exercicio10 {
    public static void main(String[] args) {

       double peso =  Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
       double altura =  Double.parseDouble(JOptionPane.showInputDialog("Digite seu altura: "));

       double pesoIdeal = peso/(Math.pow(altura,2));

       if (pesoIdeal < 18.5){
           JOptionPane.showMessageDialog(null,"Condição: ABAIXO DO PESO");
       }else if(pesoIdeal<25){
           JOptionPane.showMessageDialog(null,"Condição: PESO NORMAL");
        } else if(pesoIdeal< 30) {
           JOptionPane.showMessageDialog(null, "Condição: ACIMA DO PESO");
       } else {
           JOptionPane.showMessageDialog(null,"Condição: OBESO");
       }






    }
}
