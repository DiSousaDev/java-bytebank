package bitebank2;

public abstract interface Autenticavel {

    void setSenha(int senha);

    boolean autentica(int senha);
}
