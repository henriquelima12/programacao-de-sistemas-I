public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(999999999, "Henrique Lima", 2);
        cliente1.defineLimite();
        System.out.println("Nome do cliente: " +cliente1.nome);
        System.out.println("Valor do limite de compras do cliente: " +cliente1.limiteCompras);
        
        System.out.println("\n");
        
        Cliente cliente2 = new Cliente(888888888, "Antônio da Silva");
        cliente2.defineLimite();
        System.out.println("Nome do cliente: " +cliente2.nome);
        System.out.println("Valor do limite de compras do cliente: " +cliente2.limiteCompras);
        
   
}
    
}
