import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String resposta = "sim";

        while (resposta.equals("sim")) {

            System.out.print("Digite sua idade: ");
            int idade = entrada.nextInt();

            if (idade >= 5 && idade <= 7) {
                System.out.println("Infantil A!");
            } else if (idade >= 8 && idade <= 10) {
                System.out.println("Infantil B!");
            } else if (idade >= 11 && idade <= 13) {
                System.out.println("Juvenil A!");
            } else if (idade >= 14 && idade <= 17) {
                System.out.println("Juvenil B!");
            } else if (idade >= 18) {
                System.out.println("Senior!");
            } else {
                System.out.println("Idade inválida!");
            }

            System.out.print("Deseja repetir? (sim/nao): ");
            resposta = entrada.next();
        }

        entrada.close();
    }
}