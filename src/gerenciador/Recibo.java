package gerenciador;

import java.util.Objects;

public class Recibo{

    private int id;
    private double valor;
    private String nome;

    public Recibo(int id, double valor, String nome){
        this.id = id;
        this.valor = valor;
        this.nome = nome;
    }

    public int getId(){
        return id;
    }

    public double getValor(){
        return valor;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString(){
        return "Recibo{" + "id=" + id + ", valor=" + valor + ", nome='" + nome + '\'' + '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Recibo recibo = (Recibo) o;
        return id == recibo.id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
