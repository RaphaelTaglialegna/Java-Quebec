package br.com.firstSpringProject.springProject;

public class Autor implements LivroAutor{
  private String name;
  

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void exibirAutor() {
    System.out.println(this.name);
  }
  
}
