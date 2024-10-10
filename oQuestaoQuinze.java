import java.util.Scanner;

public class oQuestaoQuinze{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o comprimento da caixa: ");
        float comprimento = scanner.nextFloat();
        
        System.out.print("Informe a largura da caixa: ");
        float largura = scanner.nextFloat();
        
        System.out.print("Informe a altura da caixa: ");
        float altura = scanner.nextFloat();
        
        float volume = comprimento * largura * altura;
        
        System.out.printf("O volume da caixa é: "+volume);
    }
}
