package poo.updowncast;

public class App {
    public static void main(String[] args) {
      // Exemplos de Upcast e Downcast
      Funcionario funcionario = new Funcionario();
      Funcionario gerente = new Gerente();
      Funcionario vendedor = new Vendedor();
      Funcionario faxineiro = new Faxineiro();


      Vendedor vendedor_ = (Vendedor) new Funcionario(); // Downcast não é recomendado trabalhar com Downcast;

    }
}
