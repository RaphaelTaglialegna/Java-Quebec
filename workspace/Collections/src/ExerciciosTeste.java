/**
 * ExerciciosTeste
 */
import java.util.Scanner;

public class ExerciciosTeste {
public static void main(String[] args){ 
    try (Scanner leitor = new Scanner(System.in)) {
      int t = leitor.nextInt(); 
  
// TODO: Implemente uma condição onde possamos preencher o vetor de N.
// Lembre-se a sequência de valores é de 0 até T-1:
          int[] vetor = new int[1000];

          for(int i =0; i < 1000; i++ ){
              vetor[i] = i%t;
              System.out.println("N[" + i + "] = " + vetor[i]);
              }
    }
        }
}