package poo.basicclass;

public class Carro {
  String name;
  String collor;
  int fuelCapacity;

  public Carro(String name, String collor, int fuelCapacity) {
    this.name = name;
    this.collor = collor;
    this.fuelCapacity = fuelCapacity;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCollor() {
    return this.collor;
  }

  public void setCollor(String collor) {
    this.collor = collor;
  }

  public int getFuelCapacity() {
    return this.fuelCapacity;
  }

  public void setFuelCapacity(int fuelCapacity) {
    this.fuelCapacity = fuelCapacity;
  }

  double totalFuelCapacity(double fuelValue) {
    return this.fuelCapacity * fuelValue;
  }
}
