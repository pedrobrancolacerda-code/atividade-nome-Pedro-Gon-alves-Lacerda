
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = 15; // número que o jogador precisa adivinhar
        int tentativa;

        System.out.println("Tente adivinhar o número de 1 a 20:");

        tentativa = scanner.nextInt();

        if (tentativa == numeroSecreto) {
            System.out.println("🎉 Acertou!");
        } else if (tentativa < numeroSecreto) {
            System.out.println("Errou! O número é MAIOR.");
        } else if (tentativa > numeroSecreto) {
            System.out.println("Errou! O número é MENOR.");
        } else {
            System.out.println("Entrada inválida");
        }

        scanner.close();
    }
}