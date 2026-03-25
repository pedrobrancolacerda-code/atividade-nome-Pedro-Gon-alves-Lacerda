
import java.util.Scanner;
public class Credito{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

double salario, prestacao , limite;


        System.out.println("digite o salário");
        salario = entrada.nextDouble();

        System.out.println("digite a prestaçao");
        prestacao = entrada.nextDouble();

        limite = salario * 0.30;

        if(prestacao <= limite){
            System.out.println("emprestimo concedido!");
        }
            else {
                System.out.println("emprestimo nao concedido");
            }
            entrada.close();
    }




    }