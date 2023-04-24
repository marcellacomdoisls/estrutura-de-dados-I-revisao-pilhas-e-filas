import java.util.*;

public class Exercicio2 {

  public static void removerItemPilha(Stack<Integer> pilha, int chave) {
    Stack<Integer> auxiliar = new Stack<>();
    while (!pilha.isEmpty()) {
      int item = pilha.pop();
      if (item != chave) {
        auxiliar.push(item);
      }
    }
    while (!auxiliar.isEmpty()) {
      pilha.push(auxiliar.pop());
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Stack<Integer> pilha = new Stack<>();

    pilha.push(5);
    pilha.push(10);
    pilha.push(15);
    pilha.push(20);
    pilha.push(25);

    System.out.print("Digite a chave do item a ser removido: ");
    int chave = scanner.nextInt();

    System.out.println("Pilha original: " + pilha);

    removerItemPilha(pilha, chave);

    System.out.println("Pilha após a remoção: " + pilha);

    scanner.close();
  }
}
