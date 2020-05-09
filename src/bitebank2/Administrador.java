package bitebank2;

public class Administrador extends Funcionario implements Autenticavel{

    private AutenticacaoUtil aut;

    public Administrador(){
        this.aut = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha){
        aut.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.aut.autentica(senha);
    }

    public double getBonificacao(){
        return 50;
    }
}
