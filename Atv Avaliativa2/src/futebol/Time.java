package futebol;

public class Time {
    String nome;
    Estadio [] estadio;
    int qtdeEstadios = 0;
    
    Time(String n){
        nome = n;
        estadio = new Estadio[3];
    }
    
    public void getInfoEstadios(){
        for(int i = 0; i < estadio.length; i++){
            System.out.println("Nome do estádio: "+estadio[i].nome);
            System.out.println("Capacidade do estádio: "+estadio[i].capacidade);
            System.out.println("Ano de Inauguração do estádio:"+estadio[i].anoInauguracao+"\n");        
        }
    }   
    public String getNome(){
        return nome;
    }
    public boolean criaEstadio(String nome, int capacidade, int ano){
        if (qtdeEstadios < estadio.length){
            estadio[qtdeEstadios] = new Estadio(nome, capacidade, ano);
            qtdeEstadios++;
            return true;    
        }
        return false;
    }
    
}
