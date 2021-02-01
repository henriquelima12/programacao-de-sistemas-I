import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
   double n1, n2;
   int escolha;
   Scanner input = new Scanner(System.in); 
   while(true){
       System.out.println("Opção de Operação \n"
               + "1 Média entre os números digitados \n"
               + "2 Diferença do maior pelo menor \n"
               + "3 Produto entre os números digitados \n"
               + "4 Divisão do primeiro pelo segundo \n"
               + "5 Sair");
       System.out.println("Escolha uma opção:");
       escolha = input.nextInt();
       if(escolha == 5){
           break;
       }
       System.out.println("Digite os dois números:");
       n1 = input.nextDouble();
       n2 = input.nextDouble();
       switch(escolha){
           case 1:
               System.out.println("Média dos números digitados: " +(n1 + n2)/2);
               break;
           case 2:
               if(n1>n2)
                   System.out.println("Diferença do maior pelo menor: " +(n1 - n2));
               else
                   System.out.println("Diferença do maior pelo menor: " +(n2 - n1));
               break;
           case 3:
               System.out.println("Produto entre os números digitados: " +(n1 * n2));
               break;
           case 4:
               if(n2 == 0)
                   System.out.println("Escolha outro número:");
                   n2 = input.nextDouble();
               System.out.println("Divisão entre os números digitados: " +(n1 / n2));
               break;
           default:
               System.out.println("Opção inválida");
               break;
                   
       }
       
       
           
           
       }
   }
    }

