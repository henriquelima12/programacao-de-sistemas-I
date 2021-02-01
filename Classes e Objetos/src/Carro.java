public class Carro {
    boolean ligado;
    double velocidadeAtual;
    double velocidadeMaxima;
    
    void ligar(){
        ligado = true;
        System.out.println("O carro está ligado"); 
    }
    
    void buzinar(){
        System.out.println("BIBI"); 
    }
    
    void desligar(){
        ligado = false;
        System.out.println("O carro está desligado"); 
    }
    
    int acelerar(double quantidade){
        double novaVelocidade = velocidadeAtual + quantidade;
        velocidadeAtual = novaVelocidade;
        if (novaVelocidade >= velocidadeMaxima){
            return -1;
        }else{
            return 0;
        }
    }
    
    int pegarMarcha(double velocidadeAtual){
        if (velocidadeAtual == 0){
            System.out.println("Carro parado");
            return -1;
        }else if (velocidadeAtual > 0 && velocidadeAtual <= 25 ){
            System.out.println("Primeira Marcha");
            return 1;
        }else if (velocidadeAtual > 25 && velocidadeAtual <= 40 ){
            System.out.println("Segunda Marcha");
            return 2;
        }else if (velocidadeAtual > 40 && velocidadeAtual <= 60 ){
            System.out.println("Terceira Marcha");
            return 3;
        }else if (velocidadeAtual > 60 && velocidadeAtual <= 80 ){
            System.out.println("Quarta Marcha");
            return 4;
        }else{
            System.out.println("Quinta Marcha");
            return 5;
        }      
    }
}
