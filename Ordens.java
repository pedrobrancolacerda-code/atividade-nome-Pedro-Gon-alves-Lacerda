
    import java.util.Scanner;

    public class Ordens {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2;
        
        System.out.println("digite o primeiro numero");
        num1 = entrada.nextInt();

        System.out.println("digite o segundo numero");
        num2 = entrada.nextInt();

        if (num1> num2) {
            System.out.println("Ordem descrescente: " + num1 + "," +  num2);

            }else {
        System.out.println("Ordem descrescente " +num2 + "," + num1);
        entrada.close();
            } 
        }
            
        }