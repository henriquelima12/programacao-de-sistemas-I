import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        
        double preco, novopreco;
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o preço do produto:");
            preco = entrada.nextDouble();
            
            novopreco = preco - (preco * 0.075);
            
            System.out.println("O novo preço do produto é: " +novopreco);
            
    }
}
