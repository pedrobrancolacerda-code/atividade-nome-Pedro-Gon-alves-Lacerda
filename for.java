import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = entrada.nextLine();
            System.out.println("Olá, " + nome + "!");
        }

        entrada.close();
    }
}