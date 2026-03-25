Peso.java

import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double altura;
        char sexo;
        double pesoIdeal;

        System.out.println("digite a altura (em metros)");
        altura = entrada.nextdouble();

        System.out.println("digite o sexoo (M/F)");
       sexo = sc.next().toUpperCase().charAt(0);

        if (sexo == "M") {
            pesoIdeal = (72.7 * altura) -58;
            System.out.println("peso ideal (Homem) %2f kg\n", pesoIdeal);

             } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Peso ideal (Mulher): %.2f kg\n", pesoIdeal);
        } else {
            System.out.println("Sexo inválido!");
        }

        entrada.close();
    }
}