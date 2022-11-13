package dio.aulaspringdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aulaspringdatajpa.model.User;
import dio.aulaspringdatajpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
  @Autowired
  private UserRepository repository;

  @Override
  public void run(String... args) throws Exception { 
    User user = new User();
    user.setName("Raphael");
    user.setUsername("tagarela89");
    user.setPassword("dio123");

    repository.save(user);

    for (User u : repository.findAll()) {
      System.out.println(u);
    }
  }
  
}
