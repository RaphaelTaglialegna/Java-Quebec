package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.model.User;
import dio.web.api.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
  @Autowired
  private UserRepository repository;
  @GetMapping()
  public List<User> getUsers() {
    return repository.listAll();
  }

  @GetMapping("/{id}")
  public User getOne(@PathVariable("id") Integer id) {
    return repository.finById(id);
  }

   @DeleteMapping("/{id}")
   public void delete(@PathVariable("id") Integer id) {
     repository.remove(id);
   }
    
    @PostMapping()
    public void post(@RequestBody User user){
        repository.save(user);
    }
    @PutMapping()
    public void put(@RequestBody User user){
        repository.update(user);
    }
}
