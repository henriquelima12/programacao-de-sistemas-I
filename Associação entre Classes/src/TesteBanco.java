public class TesteBanco {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Henrique Lima", "000-000-000-00", 235);
        cli1.ctaCorrente.numero = 12345;
        cli1.ctaCorrente.saldo = 20000;
        cli1.ctaCorrente.calculaCredito();
        System.out.println("Saldo da conta corrente: " +cli1.ctaCorrente.saldo);
        System.out.println("Crédito da conta corrente: " +cli1.ctaCorrente.credito);
        System.out.println("Depósito de 5000 reais");
        cli1.ctaCorrente.depositar(5000);
        System.out.println("Saldo da conta corrente: " +cli1.ctaCorrente.saldo);
        System.out.println("Crédito da conta corrente: " +cli1.ctaCorrente.credito);
        cli1.ctaCorrente.calculaCredito();
        System.out.println("Crédito da conta corrente: " +cli1.ctaCorrente.credito);
        System.out.println("Saque de 30000 reais");
        cli1.ctaCorrente.sacar(30000);
        System.out.println("Saldo da conta corrente: " +cli1.ctaCorrente.saldo);
        System.out.println("Saque de 10000 reais");
        cli1.ctaCorrente.sacar(10000);
        System.out.println("Saldo da conta corrente: " +cli1.ctaCorrente.saldo);
        
        System.out.println("\n");
        
        Poupanca poup_cli = new Poupanca(1234600, 520.50);
        cli1.abrirPoupanca(poup_cli);
        System.out.println("Saldo da Poupança: " +cli1.ctaPoupanca.saldo);
        cli1.ctaPoupanca.rendimento = 0.12;
        cli1.ctaPoupanca.calculaRendimento();
        System.out.println("Saldo da Poupança: " +cli1.ctaPoupanca.saldo);
        System.out.println("Depósito de 1000 reais");
        cli1.ctaPoupanca.depositar(1000);
        System.out.println("Saldo da Poupança: " +cli1.ctaPoupanca.saldo);
        System.out.println("Saque de 200 reais");
        cli1.ctaPoupanca.sacar(200);
        System.out.println("Saldo da Poupança: " +cli1.ctaPoupanca.saldo);
        
   
}
    
}
