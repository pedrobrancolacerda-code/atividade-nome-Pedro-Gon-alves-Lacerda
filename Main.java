import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numeroSecreto = 15;
        int tentativa;

        System.out.println("Tente adivinhar um numero de 1 a 30:");

        tentativa = entrada.nextInt();
      
        if (tentativa == numeroSecreto) {
            System.out.println(" parabéns, voce acertou!");
    
         }else if (tentativa < numeroSecreto){
            System.out.println(" Errou, o numero que voce digitou é menor" );
        
         }else if (tentativa > numeroSecreto){
            System.out.println("Errou, o numero que voce digitou é maior" );

         }
            entrada.close();
        }
    }


