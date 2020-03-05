package Lista02_EstruturasCondicionais;

        import javax.swing.*;
/*
6) Escreva um algoritmo que lê dois valores booleanos (lógicos) e então determina se ambos são VERDADEIROS ou FALSOS.
 */
public class Exercicio06 {
    public static void main(String[] args) {

        boolean primeiroValor =  Boolean.parseBoolean(JOptionPane.showInputDialog("1º ) Digite: " +
                        "\n true para VERDADEIRO" +
                        "\n false para FALSO"));

        boolean segundoValor =  Boolean.parseBoolean(JOptionPane.showInputDialog("2º ) Digite" +
                "\n true para VERDADEIRO" +
                "\n false para FALSO"));
              if (primeiroValor == true && segundoValor == true){
                  JOptionPane.showMessageDialog(null,"Ambas são VERDADEIRAS");

              } else if(primeiroValor == false && segundoValor == false){
                  JOptionPane.showMessageDialog(null,"Ambas são FALSAS");
              }else {
                  JOptionPane.showMessageDialog(null,"Uma é VERDADEIRA e a outra é FALSA");
              }
    }
}
