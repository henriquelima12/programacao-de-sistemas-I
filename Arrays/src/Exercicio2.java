public class Exercicio2 {
    public static void main(String[] args) {
   int [] num = {2, -3, -7, 2, -6, 1, 0, 2, 0, -8};
   int [] pos = new int[10];
   int [] neg = new int[10];
   int j = 0, k = 0;
   for(int i = 0; i<num.length; i++){
       if(num[i]>=0){
           pos[j] = num[i];
           j++;
       }else{
           neg[k] = num[i];
           k++;
       }
   }
   System.out.println("Valores de Entrada: ");
    for(int i = 0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
    
    System.out.println("\nValores Positivos: ");
    for(int i = 0; i<j; i++){
            System.out.print(pos[i] + " ");
        }
    
    System.out.println("\nValores Negativos: ");
    for(int i = 0; i<k; i++){
            System.out.print(neg[i] + " ");
        }
        System.out.println("");
    
}
    
}
