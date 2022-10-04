package br.com.bootcamp;

public class Main {
    public static void main(String[] args) {
        double soma = new Calculadora().sum(2,3);
        System.out.println(soma);

        double subtration = new Calculadora().subtration(2,3);
        System.out.println(subtration);

        double division = new Calculadora().division(2,3);
        System.out.println(division);

        double multiplication= new Calculadora().multiplication(2,3);
        System.out.println(multiplication);
    }
}
