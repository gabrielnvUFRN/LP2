import java.util.Scanner;

public class lQuestaoDoze{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o valor da resistência R1: ");
    float R1 = scanner.nextFloat();

    System.out.print("Informe o valor da resistência R2: ");
    float R2 = scanner.nextFloat();

    System.out.print("Informe o valor da resistência R3: ");
    float R3 = scanner.nextFloat();

    float Rparalelo = (R1 * R2) / (R1 + R2);

    float Req = Rparalelo + R3;

    System.out.printf("A resistência equivalente do circuito é: "+Req);
    
  }
}
