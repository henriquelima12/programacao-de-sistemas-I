public class Pedido {
    int codigo;
    String nome, descricao;
    double valor;
 
public Pedido(int codigo, String nome, String descricao){
    this.codigo = codigo;
    this.nome = nome;
    this.descricao = descricao;

    }

public double valorComImposto(double imposto){
    double valorTotal;
    valorTotal = valor + ((imposto/100) * valor);
    return valorTotal;
    }

}


