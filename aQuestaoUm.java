import java.util.Scanner;

public class aQuestaoUm{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
    System.out.println("Vamos calcular a área e o perimetro de um retângulo.");
    
    System.out.println("Digite o tamanho da base do retângulo: ");
    float base = scanner.nextFloat();
    
    System.out.println("Digite o tamanho da altura do retângulo: ");
    float altura = scanner.nextFloat();
    
    float area = base * altura;
    float perimetro = 2 * (base + altura);
    System.out.println("A área do retângulo é: "+area);
    System.out.println("O perimetro do retângulo é: "+perimetro);
    
    
    
  }
}
