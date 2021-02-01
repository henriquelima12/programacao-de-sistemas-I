public class Exercicio2 {
    public static void main(String[] args) {
        double[] preco = {23, 20.50, 32, 18, 17.50, 25, 26, 21.40, 29, 19.60};
        System.out.println("Preço Médio: " +PrecoMedio(preco));
    }
    public static double PrecoMedio (double[] preco) {
        double soma = 0;
        double media;
        for(double valor: preco){
            soma = soma + valor;
        }
        media = soma / preco.length;
        
        return media;
    }
}



