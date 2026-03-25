import java.util.Scanner;

public class Senha {
    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    String senhaCorreta = "R10p5";
    String senhaDigitada;

    System.out.println("Digite a senha");
    senhaDigitada = entrada.next();

if ( senhaDigitada.equals(senhaCorreta)) {
    System.out.println("Imprimido!");
}
else {
    System.out.println("Senha incorreta!");
}
       
        entrada.close();
    
    }
    }