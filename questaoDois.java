import java.util.Scanner;

public class questaoDois{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Vamos calcular a área e o perimetro de um quadrado.");

    System.out.println("Digite o tamanho do lado do quadrado: ");
    float lado = scanner.nextFloat();

    float area = lado * lado;
    float perimetro = lado * 4;

    System.out.println("O valor da área é: "+area +" e o valor do perimetro é: "+perimetro);
  }
}
