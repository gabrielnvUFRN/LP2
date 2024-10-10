import java.util.Scanner;

public class mQuestaoTreze{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o tempo gasto na viagem (em horas): ");
        float tempo = scanner.nextFloat();
        
        System.out.print("Informe a velocidade média durante a viagem (em km/h): ");
        float velocidadeMedia = scanner.nextFloat();
        
        float distancia = tempo * velocidadeMedia;
        
        float litrosUsados = distancia / 12;
        
        System.out.printf("A quantidade de litros de combustível gastos é:"+litrosUsados);
    }
}
