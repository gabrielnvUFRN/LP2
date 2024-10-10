import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Vamos calcular a nota semestral.");

    System.out.println("Digite as duas notas do primeiro bimestre: ");
    float nota1bi1 = scanner.nextFloat();
    float nota2bi1 = scanner.nextFloat();
    float notab1geral = (nota1bi1 + nota2bi1) / 2;

    System.out.println("Digite as duas notas do segundo bimestre: ");
    float nota1bi2 = scanner.nextFloat();
    float nota2bi2 = scanner.nextFloat();
    float notab2geral = (nota1bi2 + nota2bi2) / 2;

    float notasem = (notab1geral + notab2geral) / 2;
    System.out.println("A nota semestral é: " + notasem);
    
  }
}
