public class Mensalista extends Funcionario {
    double salMensal;

    public Mensalista(String nome, String sobrenome, int numFunc, double salMensal) {
        super(nome, sobrenome, numFunc);
        this.salMensal = salMensal;
    }
    
    void calcSalario(int faltas){
        if (faltas == 0){
            salario = salMensal;
        }else{
            salario = salMensal - (0.02 * faltas * salMensal);
        }
    }
    
}
