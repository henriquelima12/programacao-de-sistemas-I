public class Corrente {
    public int numero;
    public double saldo;
    public double credito;
    
    void calculaCredito(){
        if (saldo <= 10000){
            credito = saldo * 0.05;
        }else if (saldo > 10000 && saldo <=50000){
            credito = saldo * 0.06;
        }else{
            credito = saldo * 0.07;
        }
    }
    
    void sacar(double valorSaque){
        if (valorSaque > saldo + credito){
            System.out.println("Esse valor não pode ser sacado, pois o saldo é insuficiente");
        }else{
            saldo = saldo - valorSaque;
        } 
    }
    
    public void depositar(double valorDeposito){
        saldo = saldo + valorDeposito;
    }
    
    
}
