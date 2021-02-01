public class Horista extends Funcionario{
    int numHora;
    double salHora;

    public Horista(String nome, String sobrenome, int numFunc, int numHora, double salHora) {
        super(nome, sobrenome, numFunc);
        this.numHora = numHora;
        this.salHora = salHora;
    }
    
    void calcSalario(){
        salario = numHora * salHora;
    }
}
