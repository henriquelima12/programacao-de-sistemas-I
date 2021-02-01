import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        double n1, n2, media;
        int peso1, peso2;
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite as duas notas:");
            n1 = entrada.nextDouble();
            n2 = entrada.nextDouble();
            System.out.println("Digite os respectivos pesos das notas:");
            peso1 = entrada.nextInt();
            peso2 = entrada.nextInt();
            media = ((n1 * peso1) + (n2* peso2))/(peso1 + peso2);
            System.out.println("Média: " +media);
                    
    }
}