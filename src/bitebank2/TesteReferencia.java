package bitebank2;

public class TesteReferencia {
    public static void main(String[] args){

        Gerente gerente = new Gerente();

        gerente.setNome("Marcos");
        gerente.setSalario(5000.0);

        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2000.0);

        ContoleBonificacao controle = new ContoleBonificacao();

        controle.registra(gerente);
        controle.registra(funcionario);

        System.out.println(controle.getSoma());



    }

}
