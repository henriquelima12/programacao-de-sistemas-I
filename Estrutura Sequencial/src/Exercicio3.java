import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        int a, b, aux;
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite os números:");
            a = entrada.nextInt();
            b = entrada.nextInt();
            aux = a;
            a = b;
            b = aux;
            System.out.println("Variável 'A': " +a);
            System.out.println("Variável 'B': " +b);
                
            
    }
}
