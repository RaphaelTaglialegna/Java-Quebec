package poo.basicclass;

public class Main {
  public static void main(String[] args) {
    Carro carro1 = new Carro("Gol", "Preto", 56);
    
    System.out.println(carro1.getName());
    System.out.println(carro1.getCollor());
    System.out.println(carro1.getFuelCapacity());
    System.out.println(carro1.totalFuelCapacity(2.50));
  }
}
