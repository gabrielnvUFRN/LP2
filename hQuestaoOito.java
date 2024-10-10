import java.util.Scanner;

public class hQuestaoOito{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Vamos calcular o volume de uma lata de oléo.");

    System.out.println("Digite o raio: ");
    float raio = scanner.nextFloat();
    System.out.println("Digite a altura: ");
    float altura = scanner.nextFloat();

    float volume = 3.14f * raio * raio * altura;
    System.out.println("O volume da lata é: "+volume);
    
  }
}
