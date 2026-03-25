import java.util.Scanner;
public class Salario{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
double salario, bonus;
int anos;
System.out.println("digite o salario");
salario = entrada.nextDouble();

System.out.println("digite o tempo de trabalho em anos");
anos = entrada.nextInt();

if (anos <=5){
    bonus = salario * 0.20;
}
else {
    bonus = salario * 0.10;
}
System.out.printf("Valor do bônus: R$ %.2f\n", bonus);
    }


    }