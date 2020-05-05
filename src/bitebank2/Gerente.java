package bitebank2;

public class Gerente extends Funcionario{

    private int senha;

    public Gerente(){
    }

    public int getSenha(){
        return senha;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }

    public double getBonificacao(){
        return getSalario();
    }

    public boolean autentica(int senha){
        return this.senha == senha;
    }
}
