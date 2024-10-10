import java.util.Scanner;

public class gQuestaoSete{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a temperatura em Fahrenheit para que ela seja exibida na escala Celsius: ");
    float fahrenheit = scanner.nextFloat();

    float celsius = (fahrenheit - 32) * 5/9;
    System.out.println("A temperatura em Celsius é: "+celsius);
    
  }
}
