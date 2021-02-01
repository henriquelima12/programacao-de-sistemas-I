import java.util.Scanner;

public class TestaCarro {
    public static void main(String[] args) {
        Carro fusca;
        fusca = new Carro();
        
        fusca.ligar();
        fusca.buzinar();
        
        
        fusca.velocidadeMaxima = 100;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quanto você quer acelerar?");
        double valor = entrada.nextDouble();
        int teste = fusca.acelerar(valor);
        System.out.println("A velocidade atual é: " +fusca.velocidadeAtual+ "KM/H");
        if (teste == -1){
            System.out.println("A velocidade é igual ou superior a velocidade máxima");
        }
        System.out.println("Digite a velocidade atual do carro: ");
        double velAtual = entrada.nextDouble();
        int testaMarcha = fusca.pegarMarcha(velAtual);
        if (testaMarcha == -1){
            fusca.desligar();
        }
        
    }
}
