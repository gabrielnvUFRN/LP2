import java.util.Scanner;

public class kQuestaoOnze{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Forneca a velocidade em m/s para conversão: ");
    float velocidadems = scanner.nextFloat();
    float velocidadekmh = velocidadems * 3.6f;
    System.out.println("A velocidade em km/h é: "+velocidadekmh);
    
  }
}
