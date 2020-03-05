package Lista02_EstruturasCondicionais;

import javax.swing.*;

/*
11) Elabore um algoritmo que calcule o que deve ser pago por um produto,
considerando o preço normal de etiqueta e a escolha da condição de pagamento.
 Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida
 e efetuar o cálculo adequado.

Código Condição de pagamento

1 À vista em dinheiro ou cheque, recebe 10% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em duas vezes, preço normal de etiqueta mais juros de 10%
 */
public class Exercicio11 {
    public static void main(String[] args) {

        double valor, totalAPagar;
        int formaDePagamento;

        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
        formaDePagamento = Integer.parseInt(JOptionPane.showInputDialog("Forma de pagamento: \n" +
                "1 - À VISTA NO DINHEIRO OU CHEQUE - 10% DE DESCONTO \n" +
                "2 - À VISTA NO CARTÃO DE CRÉDITO - 15% DE DESCONTO \n" +
                "3 - EM 2 VEZES - SEM JUROS \n" +
                "4 - EM 2 VEZES - COM JUROS DE 10%"));


        switch (formaDePagamento) {
            case 1: {
                JOptionPane.showMessageDialog(null, "Total a pagar R$ " + (valor - (valor*.10)));
                break;
            }
            case 2: {
                JOptionPane.showMessageDialog(null, "Total a pagar R$ " + (valor - (valor*0.15)));
                break;
            }
            case 3: {
                JOptionPane.showMessageDialog(null, "Total a pagar R$ " + valor);
                break;
            }
            case 4: {
                JOptionPane.showMessageDialog(null, "Total a pagar R$ " + valor*1.1);
                break;
            }
            default:{
                JOptionPane.showMessageDialog(null, "Forneca uma forma de pagamento valida!");
            }
        }

    }
}
