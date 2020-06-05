package gerenciador;

import java.util.Objects;

public class Aluno {

    private String nome;
    private int numMatricula;

    public Aluno(String nome, int numMatricula){
        this.nome = nome;
        this.numMatricula = numMatricula;
    }

    public String getNome(){
        return nome;
    }

    public int getNumMatricula(){
        return numMatricula;
    }

    @Override
    public boolean equals(Object o){

        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Aluno aluno = (Aluno) o;
        if(aluno.getNome() != null) {
            return Objects.equals(nome, aluno.nome);
        }else {
            throw new NullPointerException();
        }

    }

    @Override
    public int hashCode(){
        return Objects.hash(nome);
    }

    @Override
    public String toString(){
        return "Aluno{" + "nome='" + nome + '\'' + ", numMatricula=" + numMatricula + '}';
    }
}
