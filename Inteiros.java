import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1 , num2 , num3;
        System.out.println("escreva o primeiro numero");
num1 = entrada.nextInt();

System.out.println("escreva o segundo numero");
num2 = entrada.nextInt();

System.out.println("escreva o terceiro numero");
num3 = entrada.nextInt();

 if (num1 == num2 && num2 == num3) {
            System.out.println("Números iguais");
        } else {
            int maior = num1;

            if (num2 > maior) {
                maior = num2;
            }

            if (num3 > maior) {
                maior = num3;
            }

            System.out.println("Maior número: " + maior);
        }

        entrada.close();
    }
}
    
