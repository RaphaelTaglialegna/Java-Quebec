import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {

  public static void main(String[] args) {
    List<Gato> meusGatos = new ArrayList<>() {
      {
        add(new Gato("Jon", 18, "preto"));
        add(new Gato("Simba", 6, "Tigrado"));
        add(new Gato("Jon", 12, "amarelo"));
        add(new Gato("Ginger", 1, "Caramelo"));
      }
    };
    System.out.println(meusGatos);

    // 01 - Orderna a lista pelo nome; 
    System.out.println("Ordenar a lista pelo nome");
    Collections.sort(meusGatos);
    System.out.println(meusGatos);

    // 02- Ordem aleatória da lista utilizando o método shuffle;
    System.out.println("Ordem aleatória da lista");
    Collections.shuffle(meusGatos);
    System.out.println(meusGatos);

    // 03 - Ordernar a lista pela idade;
    System.out.println("Ordenar a lista pela idade");
    // Collections.sort(meusGatos, new ComparatorIdade()); - Dessa forma também funciona.
    meusGatos.sort(new ComparatorIdade());
    System.out.println(meusGatos);

    // 04 - Ordernar a lista pela cor;
    System.out.println("Ordenar a lista pela cor");
    // Collections.sort(meusGatos, new ComparatorCor()); - Dessa forma também funciona.
    meusGatos.sort(new ComparatorCor());
    System.out.println(meusGatos);

    // 05 - Ordernar a lista pela Nome / Cor / idade;;
    System.out.println("Ordenar a lista pelo Nome / Cor / idade");
    // Collections.sort(meusGatos, new ComparatorNomeCorIdade()); - Dessa forma também funciona.
    meusGatos.sort(new ComparatorNomeCorIdade());
    System.out.println(meusGatos);
  }
}
/**
 * Gato
 */
class Gato implements Comparable<Gato> {
  private String nome;
  private Integer idade;
  private String cor;

  public Gato(String nome, Integer idade, String cor) {
    this.nome = nome;
    this.idade = idade;
    this.cor = cor;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getIdade() {
    return this.idade;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  @Override
  public String toString() {
    return "{" + "nome=" + nome + '\'' + ", idade=" + idade + '\'' + ", cor=" + cor + '\'' + '}';
  }

  @Override
  public int compareTo(Gato gato) {
    return this.getNome().compareToIgnoreCase(gato.getNome());
  }

}


class ComparatorIdade implements Comparator<Gato> {
  @Override
  public int compare(Gato g1, Gato g2) {
    return Integer.compare(g1.getIdade(), g2.getIdade());
  }
}

class ComparatorCor implements Comparator<Gato> {
  @Override
  public int compare(Gato g1, Gato g2) {
return g1.getCor().compareToIgnoreCase(g2.getCor());
  }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
  @Override
  public int compare(Gato g1, Gato g2) {
    int nome = g1.getNome().compareTo(g2.getNome());
    if (nome != 0) { return nome; }

    int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
    if (cor!= 0) { return cor; }

    return Integer.compare(g1.getIdade(), g2.getIdade()); 
  }
  }