import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Exercicio6 {
  public static void main(String[] args) {
    Queue<Integer> fila = new LinkedList<>();
    Stack<Integer> pilha = new Stack<>();
    Random random = new Random();

    for (int i = 0; i < 1000; i++) {
      fila.offer(random.nextInt(1000) + 1);
      fila.offer(-1 * (random.nextInt(1000) + 1));
    }

    while (!fila.isEmpty()) {
      int numero = fila.poll();
      if (numero > 0) {
        pilha.push(numero);
      } else {
        if (!pilha.isEmpty()) {
          int topoPilha = pilha.pop();
          System.out.println("Número retirado da pilha: " + topoPilha);
        }
      }
    }
  }
}
