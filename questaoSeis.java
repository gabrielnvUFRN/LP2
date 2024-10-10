import java.util.Scanner;

public class questaoSeis{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite sua idade: ");
    int idade = scanner.nextInt();

    int idadeEmAnos = idade;
    int idadeEmMeses = idade * 12;
    int idadeEmDias = idade * 365;

    System.out.println("Sua idade em anos é: "+idadeEmAnos);
    System.out.println("Sua idade em meses é: "+idadeEmMeses);
    System.out.println("Sua idade em dias é: "+idadeEmDias);
    
  }
}
