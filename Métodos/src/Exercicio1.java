import java.util.Scanner;

public class Exercicio1 {
        public static void main(String[] args) {
        int [] peso = new int[10];
        double [] altura = new double[10];
        double [] imc = new double[10];
        peso = entradaPeso(peso);
        altura = entradaAltura(altura);
        processaIMC(peso, altura, imc);
}
        
        public static int[] entradaPeso(int[] peso){
            Scanner input = new Scanner(System.in);
            for(int i = 0; i<peso.length; i++){
            System.out.printf("\nPeso da pessoa %d: " ,(i + 1));
            peso[i] = input.nextInt();
        }
            return peso;
}
        
        public static double[] entradaAltura(double[] altura){
            Scanner input = new Scanner(System.in);
            for(int i = 0; i<altura.length; i++){
            System.out.printf("\nAltura da pessoa %d: " ,(i + 1));
            altura[i] = input.nextDouble();
        }
            return altura;
}
            
        public static void processaIMC(int[] peso, double[] altura, double[] imc){
            for(int i = 0; i<peso.length; i++){
            imc[i] = peso[i]/Math.pow(altura[i], 2);
            System.out.printf("\nO IMC da pessoa %d é = %.1f " ,(i+1) ,imc[i]);   
        }
         
        }
        

}

