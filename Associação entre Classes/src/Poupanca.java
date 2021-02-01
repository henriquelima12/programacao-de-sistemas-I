public class Poupanca {
    public int numero;
    public double saldo;
    public double rendimento;
    
    public Poupanca(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public void sacar(double valorSaque){
        if (valorSaque > saldo){
            System.out.println("Esse valor não pode ser sacado, pois o saldo é insuficiente");
        }else{
            saldo = saldo - valorSaque;
         } 
     }
    
    void depositar(double valorDeposito){
        saldo = saldo + valorDeposito;
    }
    
    void calculaRendimento(){
        saldo = saldo + ((saldo * rendimento)/100);
    }
}
