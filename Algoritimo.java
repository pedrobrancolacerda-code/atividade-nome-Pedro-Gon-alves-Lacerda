import java.util.Scanner;

public class Algoritimo {
    
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

int numero;

System.out.println("digite um numero");
numero = entrada.nextInt();

if (numero >= 50 && numero <=100){
    System.out.println("pertence ao intervalo");
}
    else {
        System.out.println("nao pertence ao intervalo");
    }
        entrada.close();
    

    }

}