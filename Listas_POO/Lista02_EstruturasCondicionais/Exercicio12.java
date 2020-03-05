package Lista02_EstruturasCondicionais;
/*
12) Escreva um algoritmo que leia o número de identificação,
as 3 notas obtidas por um aluno nas 3 verificações e a média
dos exercícios que fazem parte da avaliação, e calcule a média
de aproveitamento, usando a fórmula: MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7

A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve escrever
 o número do aluno, suas notas, a média dos exercícios, a média de aproveitamento,
  o conceito correspondente e a mensagem 'Aprovado' se o conceito for A, B ou C,
  e 'Reprovado' se o conceito for D ou E.

Média de aproveitamento Conceito
>= 90 A
>= 75 e < 90 B
>= 60 e < 75 C
>= 40 e < 60 D
< 40 E
 */

import javax.swing.*;
import java.sql.SQLOutput;

public class Exercicio12 {
    public static void main(String[] args) {

        int numeroIdentificacao;
        float nota1,nota2,nota3,mediaExercicios, mediaDeAproveitamento, conceito;

        numeroIdentificacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de idenficação: "));
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira Nota: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda Nota: "));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira Nota: "));
        mediaExercicios = Float.parseFloat(JOptionPane.showInputDialog("Digite a média dos exercicios: "));


        mediaDeAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios)/7;
        System.out.println(mediaDeAproveitamento);
        conceito = (mediaDeAproveitamento * 100)/10;


        JOptionPane.showMessageDialog(null, "Numero de identificação: "+ numeroIdentificacao+
                "\nNota 1 = "+ nota1+
                "\nNota 2 = "+ nota2+
                "\nNota 3 = "+ nota3+
                "\nMédia dos exercicios = "+ mediaExercicios);
        if (conceito > 75){
            JOptionPane.showMessageDialog(null, "APROVADO");
        } else{
            JOptionPane.showMessageDialog(null, "REPROVADO");
        }
        }

    }

