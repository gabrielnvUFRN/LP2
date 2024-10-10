import java.util.Scanner;

public class nQuestaoQuatorze{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o valor de A: ");
        int a = scanner.nextInt();
        
        System.out.print("Informe o valor de B: ");
        int b = scanner.nextInt();
        
        a = a + b;
        b = a - b; 
        a = a - b; 
        
        System.out.println("Após a troca, o valor de A é: "+a);
        System.out.println("Após a troca, o valor de B é: "+b);
    }
}
