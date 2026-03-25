import java.util.Scanner;

public class Divisao {
    public static void main(String[] args ){
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero");
        int num1 = 20;
        int num2 = 2;
        int resultado = num1 / num2;
        
        num1 = entrada.nextInt();
        

      

        if (num1 > 20 ) {
            num1 = num1 / 2;
        System.out.println("resultado " + num1);
        }
            entrada.close();
        }
    }
    