package bitebank2;

public class Administrador extends Funcionario implements Autenticavel{

    private int senha;

    public int getSenha(){
        return senha;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }

    public double getBonificacao(){
        return 50;
    }

    @Override
    public boolean autentica(int senha){
        return this.senha == senha;
    }
}
