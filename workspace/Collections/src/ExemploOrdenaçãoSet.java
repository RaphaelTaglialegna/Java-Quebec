import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenaçãoSet {
  public static void main(String[] args) {
    System.out.println("Orden Aleatória");
    Set<TvSeries> minhasSeries = new HashSet<>() {
      {
        add(new TvSeries("Rick and Morty", "Animation", 23));
        add(new TvSeries("Love or List", "Reality", 43));
        add(new TvSeries("Gold Rush", "Reality", 50));
      }
    };
    System.out.println(minhasSeries);
  
  
  System.out.println("Orden de inserção");
    Set<TvSeries> minhasSeries2 = new TreeSet<>() {
      {
        add(new TvSeries("Rick and Morty", "Animation", 23));
        add(new TvSeries("Love or List", "Reality", 50));
        add(new TvSeries("Gold Rush", "Reality", 43));
    }};
    System.out.println(minhasSeries2);
  }
}
