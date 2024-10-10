import java.util.Scanner;

public class iQuestaoNove{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número inteiro menor que 32: ");
        int numero = scanner.nextInt();
        
        if (numero < 0 || numero >= 32){
            System.out.println("Número inválido! O número deve ser menor que 32.");
            return;
        }

        String binario = "";
        int valorAtual = numero;

        for (int i = 4; i >= 0; i--){
            int potenciaDeDois = (int) Math.pow(2, i);
            if (valorAtual >= potenciaDeDois){
                binario += "1";
                valorAtual -= potenciaDeDois;
            } else {
                binario += "0";
            }
        }

        System.out.println("Representação binária: "+binario);
    }

  
}
