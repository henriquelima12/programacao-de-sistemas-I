public class Retangulo {
    private double largura;
    private double altura;
    
    double calculaPerimetro(double largura, double altura){
        return (largura * 2) + (altura * 2);
    }
    
    double calculaArea(double largura, double altura){
        return altura * largura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
