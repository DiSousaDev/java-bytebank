package bitebank2;

public class Gerente extends Funcionario implements Autenticavel{

    private AutenticacaoUtil aut;

    public Gerente(){
        this.aut = new AutenticacaoUtil();
    }

    public double getBonificacao(){
        return 50;
    }

    @Override
    public void setSenha(int senha){
        this.aut.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.aut.autentica(senha);
    }
}
