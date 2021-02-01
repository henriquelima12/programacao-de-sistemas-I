
public class Teste {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(888888, "João da Silva", "Bife com batata frita");
        pedido1.valor = 1000;
        System.out.println("Código do cliente: " +pedido1.codigo);
        System.out.println("Nome do cliente: " +pedido1.nome);
        System.out.println("Descrição do pedido: : " +pedido1.descricao);
        System.out.println("O valor total do pedido, incluindo o imposto, é de: " +pedido1.valorComImposto(10));
   
    }
}
