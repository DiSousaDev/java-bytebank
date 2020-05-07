package bitebank2;

public class TesteGerente {
    public static void main(String[] args){

        Gerente gerente = new Gerente();
        gerente.setNome("Rafael Carvalho");
        gerente.setCpf("054.962.809-66");
        gerente.setSalario(5000);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());

        gerente.setSenha(2222);

        if(gerente.autentica(2222)){
            System.out.println("Autenticado com Sucesso!");
        }else{
            System.out.println("Senha inválida");
        }

        System.out.println(gerente.getBonificacao());

    }
}
