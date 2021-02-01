public class Cliente {
    public String nome;
    public String cpf;
    public int agencia;
    public Poupanca ctaPoupanca;
    public Corrente ctaCorrente;
    
    
    
    public Cliente(String nome, String cpf, int agencia ){
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = agencia;
        ctaCorrente = new Corrente(); //composição
    }
    
    void abrirPoupanca(Poupanca conta){ //agregação
        ctaPoupanca = conta;
    }
}
