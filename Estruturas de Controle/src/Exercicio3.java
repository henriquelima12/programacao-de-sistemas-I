import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int i, idade, c, p, a;
        double peso, altura, mediaIdade;
        c = 0;
        p = 0;
        a = 0;
        
        Scanner entrada = new Scanner(System.in);
        for(i = 1; i<21; i++){
            System.out.println("Digite a idade: ");
            idade = entrada.nextInt();
            System.out.println("Digite o peso: ");
            peso = entrada.nextDouble();
            System.out.println("Digite a altura: ");
            altura = entrada.nextDouble();
            System.out.println("\n");
            c = c + idade;
            if(peso > 90)
                p = p + 1;
                
            if(altura < 1.50)
                a = a + 1;
        }
        mediaIdade = (double)c / 20;
        System.out.println("Média das idades: " +mediaIdade);
        System.out.println("Pessoas com mais de 90 quilos: " +p);
        System.out.println("Pessoas com menos de 1.50 de altura: " +a);
    }
}
