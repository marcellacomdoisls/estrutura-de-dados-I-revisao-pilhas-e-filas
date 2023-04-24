import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Exercicio4 {
  public static void main(String[] args) {
    Queue<Integer> filaF1 = new LinkedList<>();
    Random random = new Random();

    for (int i = 0; i < 100; i++) {
      filaF1.offer(random.nextInt(1000));
    }

    System.out.println("Fila F1 original: " + filaF1);

    Queue<Integer> filaF2 = inverterFila(filaF1);

    System.out.println("Fila F2 invertida: " + filaF2);
  }

  public static Queue<Integer> inverterFila(Queue<Integer> fila) {
    Queue<Integer> filaInvertida = new LinkedList<>();
    Stack<Integer> pilha = new Stack<>();

    while (!fila.isEmpty()) {
      pilha.push(fila.poll());
    }

    while (!pilha.isEmpty()) {
      filaInvertida.offer(pilha.pop());
    }

    return filaInvertida;
  }
}
