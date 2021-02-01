import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
   double valor, converte;
   int moeda;
   Scanner input = new Scanner(System.in);
   do{
       System.out.println("Digite o valor da compra em reais:");
       valor = input.nextDouble();
   }while(valor<=0);
        System.out.println("1 - dólar americano \n"
                + "2 - euro \n"
                + "3 - libra esterlina");
        moeda = input.nextInt();
        switch(moeda){
            case 1:
                converte = valor/5.61;
                System.out.println("Valor em dólar:  " +converte);
                break;
            case 2:
                converte = valor/6.61;
                System.out.println("Valor em euro:  " +converte);
                break;
            case 3:
                converte = valor/7.34;
                System.out.println("Valor em libra:  " +converte);
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
        
}
    
}
