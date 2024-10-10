import java.util.Scanner;

public class cQuestaoTres{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Vamos calcular a área e o perimetro de uma circunferência.");

    System.out.println("Digite o valor do raio da circunferência: ");
    float raio = scanner.nextFloat();

    float area = (raio * raio) * 3.14f;
    float perimetro = 2 * 3.14f * raio;
    System.out.println("A área da circunferência é "+area + " e o perimetro é "+perimetro);
    
  }
}
