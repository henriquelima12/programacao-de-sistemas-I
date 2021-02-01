package futebol;
import java.util.Scanner;

/**
 * Henrique Lima Araújo - 32091702
 * Rafael Correia Zarzur - 41924274
 */
public class TestaFutebol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;
        Time time1 = new Time("Sport Club Mackenzie");
        System.out.printf("Estadios que o o time %s pode jogar ",time1.getNome());
        
        do{
            System.out.println("\nMenu\n1-Cria Estadio\n2-Mostra estadios do time\n3-Sair\n");
            op = input.nextInt();
            if (op==3)
                break;
            switch (op){
                case 1 : System.out.println("Nome do Estadio:");
                         String nome = input.next();
                         System.out.println("Capacidade do Estadio:");
                         int capacidade = input.nextInt();
                         System.out.println("Ano de Inauguração do Estadio:");
                         int ano = input.nextInt();
                         if (time1.criaEstadio(nome, capacidade, ano))
                             System.out.println("Estadio cadastrado");
                         else
                             System.out.println("Excedeu limte de estadios");                               
                         break;
                case 2 : time1.getInfoEstadios();
                         break;               
            }    
        }while(op!=3);
        
    }
}

