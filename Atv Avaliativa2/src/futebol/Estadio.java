package futebol;

public class Estadio {
    int anoInauguracao;
    String nome;
    int capacidade;
    
    Estadio(String n, int c, int ano){
        nome = n;
        capacidade = c;
        anoInauguracao = ano;     
    }
    
    public int getAnoInuaguracao(){
        return 2020 - anoInauguracao;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getCapacidade(){
        return capacidade;
    }
}
