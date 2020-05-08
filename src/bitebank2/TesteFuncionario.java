package bitebank2;


public class TesteFuncionario {
    public static void main(String[] args){

        Funcionario func1 = new Gerente();

        System.out.println(func1.getNome());
        System.out.println(String.format("%.2f",func1.getBonificacao()));


    }
}
