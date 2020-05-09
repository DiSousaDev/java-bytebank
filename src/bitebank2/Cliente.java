package bitebank2;

public class Cliente implements Autenticavel{

    private AutenticacaoUtil aut;

    public Cliente(){
        this.aut = new AutenticacaoUtil();
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
