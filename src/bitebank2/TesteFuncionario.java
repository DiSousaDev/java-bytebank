package bitebank2;


public class TesteFuncionario {
    public static void main(String[] args){

        Funcionario func1 = new Funcionario("Nico Steppat", "012.635.987-85", 2600);

        System.out.println(func1.getNome());
        System.out.println(String.format("%.2f",func1.getBonificacao()));


    }
}
