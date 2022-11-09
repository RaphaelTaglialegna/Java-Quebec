package br.com.firstSpringProject.springProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
  
  public static void main(String[] args) {
    ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

    Livro livro = factory.getBean(Livro.class);
    livro.setNome("Herry Potter");
    livro.setCodigo("AD24");
    Autor autor = factory.getBean(Autor.class);
    autor.setName("J.K. Rowling");
    livro.exibir();

    ((AbstractApplicationContext) factory).close();
  }
}
