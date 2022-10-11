import java.util.Objects;

public class TvSeries implements Comparable<TvSeries> {
  private String nome;
  private String genero;
  private Integer tempoEpisodio;

  public TvSeries(String nome, String genero, Integer tempoEpisodio) {
    this.nome = nome;
    this.genero = genero;
    this.tempoEpisodio = tempoEpisodio;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getGenero() {
    return this.genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public Integer getTempoEpisodio() {
    return this.tempoEpisodio;
  }

  public void setTempoEpisodio(Integer tempoEpisodio) {
    this.tempoEpisodio = tempoEpisodio;
  }

  @Override
  public String toString() {
    return "{" +
        " nome='" + nome + "\'" +
        ", genero='" + genero + "\'" +
        ", tempoEpisodio='" + tempoEpisodio + "\'" +
        "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof TvSeries)) {
      return false;
    }
    TvSeries tvSeries = (TvSeries) o;
    return nome.equals(tvSeries.nome) && genero.equals(tvSeries.genero) && tempoEpisodio.equals(tvSeries.tempoEpisodio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, genero, tempoEpisodio);
  }

  @Override
  public int compareTo(TvSeries serie) {
    return Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
  }
}