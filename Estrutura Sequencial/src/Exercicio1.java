import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        double n1, n2, media;
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite as duas notas:");
            n1 = entrada.nextDouble();
            n2 = entrada.nextDouble();
            media = (n1 + n2)/2;
            System.out.println("Média: " +media);
                    
    }
    
}
