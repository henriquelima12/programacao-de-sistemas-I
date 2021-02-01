import java.util.Scanner;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a largura do retângulo: ");
        retangulo.setLargura(entrada.nextDouble());
        System.out.println("Digite a altura do retângulo: ");
        retangulo.setAltura(entrada.nextDouble());
        System.out.println("Largura: " +retangulo.getLargura());
        System.out.println("Altura: " +retangulo.getAltura());
        System.out.println("Perímetro: " +retangulo.calculaPerimetro(retangulo.getLargura(), retangulo.getAltura()));
        System.out.println("Área: " +retangulo.calculaArea(retangulo.getLargura(), retangulo.getAltura()));
    }
    
}
