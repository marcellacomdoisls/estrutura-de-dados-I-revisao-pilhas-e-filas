import java.util.Stack;

public class Exercicio8 {
  private Stack<Integer> pilhaP;
  private Stack<Integer> pilhaN;

  public Exercicio8() {
    pilhaP = new Stack<>();
    pilhaN = new Stack<>();
  }

  public void inserirNumero(int num) {
    if (num > 0) {
      pilhaP.push(num); 
    } else if (num < 0) {
      pilhaN.push(num); 
      if (!pilhaP.isEmpty() && !pilhaN.isEmpty()) {
        System.out.println("Número retirado da pilha P: " + pilhaP.pop());
        System.out.println("Número retirado da pilha N: " + pilhaN.pop());
      } else {
        System.out.println("As pilhas estão vazias!");
      }
    }
  }

  public static void main(String[] args) {
    Exercicio8 testaPilha = new Exercicio8();

    for (int i = 0; i < 1000; i++) {
      int num = (int) (Math.random() * 201) - 100;
      testaPilha.inserirNumero(num);
    }
  }
}
