import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1, num2, resultado;
        char operacao;

        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = entrada.next().charAt(0);

        if (operacao == '+') {
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);

        } else if (operacao == '-') {
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);

        } else if (operacao == '*') {
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);

        } else if (operacao == '/') {
            if (num2 <= 0) {
                System.out.println("Impossível dividir!");
            } else {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            }

        } else {
            System.out.println("Sinal inválido");
        }

        entrada.close();
    }
}