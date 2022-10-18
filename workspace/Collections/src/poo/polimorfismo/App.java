package poo.polimorfismo;

public class App {
  public static void main(String[] args) {
    ClasseMae[] classes = new ClasseMae[] { new ClasseFilha1(), new ClasseFilha2(), new ClasseMae() };
    for (ClasseMae classe : classes) {
      classe.metodo1();
    }

    System.out.println("");
    for (ClasseMae classe : classes) {
      classe.metodo2();
    }
    System.out.println("");
    
    // Nessa linha esta ocorrendo apenas a sobre escrita pois está sendo instanciado diretamente da Classe extendida;
    ClasseFilha2 classeFilha2 = new ClasseFilha2();
    classeFilha2.metodo2();
  }
}
