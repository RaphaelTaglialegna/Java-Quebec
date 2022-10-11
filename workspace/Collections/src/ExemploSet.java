import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Observações
- O SET não possui métodos gets e sets
- Não possui indices
 */ 

public class ExemploSet {
  public static void main(String[] args) {
    

    System.out.println("Crie um conjunto e adicione as notas: ");
    Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
    System.out.println(notas);

    System.out.println("Confira se a nota 5 está no conjunto: " + notas.contains(5d));
    System.out.println("Exiba a menor nota: " + Collections.min(notas));
    System.out.println("Exiba a maior nota: " + Collections.max(notas));

    Iterator<Double> iterator = notas.iterator();
    Double soma = 0d;
    while (iterator.hasNext()) {
      Double next = iterator.next();
      soma += next;
    }
    System.out.println("Exiba a soma das notas: " + soma);
    System.out.println("Exiba a média das notas :" + (soma / notas.size()));
    System.out.println("Remove a nota zeor: ");
    notas.remove(0d);
    System.out.println(notas);

    System.out.println("Exiba as notas pela ordem de entrada no conjunto: ");
    // Para exibir apenas usando o LinkedHashSet.
    Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 0d, 3.6));
    System.out.println(notas2);

    System.out.println("Exiba a notas em ordem crescente: ");
    Set<Double> notas3 = new TreeSet<>(notas2); // Só da certo que em notas2 existe o método comparable.
    System.out.println(notas3);

    System.out.println("Apague o conjunto notas:");
    notas.clear();
    System.out.println("Conferindo se o conjunto notas esta vazio: " + notas.isEmpty());
  }
}
