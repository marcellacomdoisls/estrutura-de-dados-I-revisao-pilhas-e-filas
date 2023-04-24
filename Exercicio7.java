import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exercicio7 {
  public static void main(String[] args) {
    Queue<Integer> fila = new LinkedList<>();
    for (int i = 1; i <= 20; i++) {
      fila.offer(i);
    }

    System.out.println("Fila original:");
    System.out.println(fila);

    inverterFilaComPilha(fila);

    System.out.println("Fila invertida:");
    System.out.println(fila);
  }

  public static void inverterFilaComPilha(Queue<Integer> fila) {
    if (fila == null || fila.isEmpty()) {
      return;
    }

    Stack<Integer> pilha = new Stack<>();
    int tamanho = fila.size();

    while (!fila.isEmpty()) {
      pilha.push(fila.poll());
    }

    while (!pilha.isEmpty()) {
      fila.offer(pilha.pop());
    }

    for (int i = 0; i < tamanho - 1; i++) {
      fila.offer(fila.poll());
    }
  }
}
