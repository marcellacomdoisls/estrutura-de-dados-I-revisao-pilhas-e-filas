import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

public class Exercicio5 {
  public static void main(String[] args) {
    Queue<Integer> filaF = new LinkedList<>();
    Stack<Integer> pilhaP = new Stack<>();
    Set<Integer> numerosSorteados = new HashSet<>();
    Random random = new Random();

    for (int i = 0; i < 1000; i++) {
      int numeroSorteado = random.nextInt(1000) + 1;
      if (numerosSorteados.contains(numeroSorteado)) {
        pilhaP.push(numeroSorteado);
      } else {
        filaF.offer(numeroSorteado);
        numerosSorteados.add(numeroSorteado);
      }
    }

    System.out.println("Fila F: " + filaF);
    System.out.println("Pilha P: " + pilhaP);
  }
}
