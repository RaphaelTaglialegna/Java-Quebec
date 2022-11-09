package br.com.firstSpringProject.springProject;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro {
  private String nome;
  private String codigo;

  public String getNome() {
    return this.nome;
  }

  @Autowired
  LivroAutor livroAutor;

  public LivroAutor getLivroAutor() {
    return this.livroAutor;
  }

  public void setLivroAutor(LivroAutor livroAutor) {
    this.livroAutor = livroAutor;
  }

  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getCodigo() {
    return this.codigo;
  }
  
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public void exibir() {
    System.out.println(this.getNome() + " - " + this.getCodigo());
    livroAutor.exibirAutor();
  }
  
}

