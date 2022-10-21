package exceptions;

import javax.swing.JOptionPane;

public class UncheckedException {
  public static void main(String[] args) {
    boolean looping = true;
    do {
       String a = JOptionPane.showInputDialog("Numerador: ");
    String b = JOptionPane.showInputDialog("Denomidador: ");
    try {
      int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
      System.out.println("Resultado: " + resultado);
      looping = false;

    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, e, "Entrada inválida, informe um número inteiro", 0);
    }
    catch (ArithmeticException e) {
      JOptionPane.showMessageDialog(null, e, "Entrada inválida, é impossível dividir um numero por zero", 0);      
    }
    } while (looping);
  }
  
  public static int dividir(int n1, int n2) {
    return n1 / n2;
  }
}
