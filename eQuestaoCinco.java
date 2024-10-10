import java.util.Scanner;

public class eQuestaoCinco{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite dois números inteiros para calcularmos o resultado da divisão e o resto: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    int divisao = num1 / num2;
    int resto = num1 % num2;

    System.out.println("O resultado da divisão é "+divisao +" e o resto é "+resto);
    
  }
}
