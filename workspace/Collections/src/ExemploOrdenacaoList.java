import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {

  public static void main(String[] args) {
    List<Gato> meusGatos = new ArrayList<>(){{
      add(new Gato("Jon", 18, "preto"));
      add(new Gato("Simba", 6, "Tigrado"));
      add(new Gato("Jony", 12, "amarelo"));
      }
    };
    System.out.println(meusGatos);

    // 01 - Orderna a lista pelo nome; 
    System.out.println("Ordemar o lista pelo nome");
    Collections.sort(meusGatos);
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