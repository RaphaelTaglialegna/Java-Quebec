import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
      // Dada uma lista com 7 notas de um aluno [ 7, 8.5, 9.3, 5, 7, 0, 3.6], faça: 

      List<Double> notas = new ArrayList<>();
      notas.add(7.0);
      notas.add(8.5);
      notas.add(9.3);
      notas.add(5.0);
      notas.add(7.0);
      notas.add(0.0);
      notas.add(3.6);
      // 1 - Exibir a lista;
      System.out.println(notas.toString()); 
      // 2 - Exibia a posição da nota 5.0;
      System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));
      // 3 - Adicione um elemento na lista através do index na posição 4
      System.out.println("Adicione na lista a nota 8.0 na posição quatro 4:");
      notas.add(4, 8.0); // index e o elemento a ser add;
      System.out.println(notas);
      // 4 - Subtitua uma nota usando o método set;
      System.out.println("Subistitua a nota 5.0 pela nota 6.0: ");
      notas.set(notas.indexOf(5d), 6.0);
      // 5 - Verificar se existe uma nota na lista;
      System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5d));
      // // 6 - Exiba cada elemento da lista; 
      // for (Double nota : notas) {
      //   System.out.println(nota);
      // }
      // 7 - Exiba uma nota por posição;
      System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
      // 8 e 9 - Exiba a menor e a maior nota;
      System.out.println("Exiba a menor nota: " + Collections.min(notas));
      System.out.println("Exiba a maior nota: " + Collections.max(notas));

      // 10 - Some todas a notas usando o método iterator: 
      Iterator<Double> iterator = notas.iterator();
      Double soma = 0d;
      while (iterator.hasNext()) {
        Double next = iterator.next();
        soma += next;
      }
      System.out.println("Exibir a soma de todas a notas: " + soma);
      // 11 - Exiba a média usando o método size());
      System.out.println("Exibir a média: " + (soma / notas.size()));
      // 12 - Remova a nota 0.0
      System.out.println("Remover a nota 0.0");
      notas.remove(0d);
      System.out.println(notas);
      // 13 - Remova a nota na posição 0
      System.out.println("Remover a nota na posição 0");
      notas.remove(0);
      System.out.println(notas);
      // Remover as notas menor que 7
      Iterator<Double> iterator2 = notas.iterator();
      while (iterator2.hasNext()) {
        Double next = iterator2.next();
        if (next < 7) {
          iterator2.remove();
        }
      }
      System.out.println("Remover as notas menores que 7");
      System.out.println(notas);

      //15 - Apague toda a lista
      notas.clear();
      System.out.println("Após apagar a lista checar se há elementos nela: " + notas.isEmpty());
    }
}
