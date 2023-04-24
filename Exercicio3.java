import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Aviao {
  private String nome;
  private int numero;

  public Aviao(String nome, int numero) {
    this.nome = nome;
    this.numero = numero;
  }

  public String getNome() {
    return nome;
  }

  public int getNumero() {
    return numero;
  }

  @Override
  public String toString() {
    return "Nome: " + nome + ", Número: " + numero;
  }
}

public class Exercicio3 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Queue<Aviao> filaDecolagem = new LinkedList<>();

    while (true) {
      System.out.println("-------- Controle de Pista de Decolagem --------");
      System.out.println("1. Listar número de aviões aguardando na fila de decolagem");
      System.out.println("2. Autorizar a decolagem do primeiro avião da fila");
      System.out.println("3. Adicionar um avião à fila de espera");
      System.out.println("4. Listar todos os aviões na fila de espera");
      System.out.println("5. Listar características do primeiro avião da fila");
      System.out.println("0. Sair");
      System.out.print("Digite a opção desejada: ");
      int opcao = teclado.nextInt();
      teclado.nextLine();

      switch (opcao) {
        case 1:
          System.out.println("Número de aviões aguardando na fila de decolagem: " + filaDecolagem.size());
          break;
        case 2:
          if (!filaDecolagem.isEmpty()) {
            Aviao aviaoDecolagem = filaDecolagem.poll();
            System.out.println("Decolagem autorizada para o avião: " + aviaoDecolagem);
          } else {
            System.out.println("Não há aviões aguardando na fila de decolagem.");
          }
          break;
        case 3:
          System.out.print("Digite o nome do avião: ");
          String nome = teclado.nextLine();
          System.out.print("Digite o número do avião: ");
          int numero = teclado.nextInt();
          teclado.nextLine();
          Aviao novoAviao = new Aviao(nome, numero);
          filaDecolagem.offer(novoAviao);
          System.out.println("Avião adicionado à fila de espera: " + novoAviao);
          break;
        case 4:
          System.out.println("Aviões na fila de espera: " + filaDecolagem);
          break;
        case 5:
          if (!filaDecolagem.isEmpty()) {
            Aviao primeiroAviao = filaDecolagem.peek();
            System.out.println("Características do primeiro avião da fila: " + primeiroAviao);
          } else {
            System.out.println("Não há aviões aguardando na fila de decolagem");
          }
      }
      teclado.close();
    }
  }
}
