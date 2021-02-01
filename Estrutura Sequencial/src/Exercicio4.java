import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        double salario, conta1, conta2, valorTotal1, valorTotal2,salarioTotal;
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o salário de João:");
            salario = entrada.nextDouble();
            System.out.println("Digite o valor da primeira conta:");
            conta1 = entrada.nextDouble();
            System.out.println("Digite o valor da segunda conta:");
            conta2 = entrada.nextDouble();
            
            valorTotal1 = conta1 + (conta1 * 0.02);
            valorTotal2 = conta2 + (conta2 * 0.02);
            
            salarioTotal = salario - (valorTotal1 + valorTotal2);
            
            System.out.println("O valor total da primeira conta é: " +valorTotal1);
            System.out.println("O valor total da segunda conta é: " +valorTotal2);
            System.out.println("O salário restante de João é: " +salarioTotal);
            
            
    }
}
