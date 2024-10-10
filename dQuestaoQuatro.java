import java.util.Scanner;

public class dQuestaoQuatro{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Vamos calcular o perimetro de um triângulo.");

    System.out.println("Digite o lado 1: ");
    float lado1 = scanner.nextFloat();
    System.out.println("Digite o lado 2: ");
    float lado2 = scanner.nextFloat();
    System.out.println("Digite o lado 3: ");
    float lado3 = scanner.nextFloat();

    float perimetro = lado1 + lado2 + lado3;
    System.out.println("O perimetro do triângulo é: "+perimetro);
    
    
    
    
  }
}
