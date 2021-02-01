public class Cliente {
    double cpf;
    String nome;
    int status;
    double limiteCompras;
    
Cliente(double cpf, String nome, int status){
    this.cpf = cpf;
    this.nome = nome;
    this.status = status;
    
}

Cliente(double cpf, String nome){
    this.cpf = cpf;
    this.nome = nome;
       
}
void defineLimite(){
    if (status == 0){
        limiteCompras = 250.00;
    }else if (status == 1){
        limiteCompras = 500.00;
    }else if (status == 2){
        limiteCompras = 750.00;
        
    }
}
    
}
