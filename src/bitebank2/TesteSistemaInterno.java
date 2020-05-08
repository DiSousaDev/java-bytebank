package bitebank2;

public class TesteSistemaInterno {

    public static void main(String[] args){

        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(2233);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);

        SistemaInterno aut = new SistemaInterno();

        aut.autentica(gerente);
        aut.autentica(adm);
        aut.autentica(cliente);


    }

}
