public class FolhaPagamento {
    public static void main(String[] args) {
        Horista f1 = new Horista("João", "da Silva", 100, 40, 25.50);
        f1.calcSalario();
        System.out.printf("Salário de %s %s é de %.2f é : \n" ,f1.nome, f1.sobrenome, f1.salario);
        Mensalista f2 = new Mensalista("Maria", "da Silva", 200, 10000 );
        f2.calcSalario(0);
        System.out.printf("Salário de %s %s é de %.2f é: \n" ,f2.nome, f2.sobrenome, f2.salario);
        f2.calcSalario(5);
        System.out.printf("Salário de %s %s é de %.2f é: \n" ,f2.nome, f2.sobrenome, f2.salario);
    }
}
