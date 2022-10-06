package br.dio.bootcamp;

public class Quadrilatero {
  
  // Aqui estamos fazendo a sobre carga de um método o que muda é a assinatura dele.
  public static void area(double lado) {
    double result = lado * lado;
    System.out.println("A área do quadrado: " + result);
  }

  public static void area(double lado1, double lado2) {
    double result = lado1 * lado2;
    System.out.println("A área do retangulo: " + result);
  }
  
    public static void area(double baseMaior, double baseMenor, double altura) {
    double result = ((baseMaior+baseMenor) * altura) / 2;
    System.out.println("A área do trapézio: " + result);
  }
}
