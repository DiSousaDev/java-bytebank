package comparator;

public class Conta {

    private Long agencia;
    private Long numero;
    private Cliente cliente;

    public Conta(Long agencia, Long numero, Cliente cliente){
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
    }

    public Long getAgencia(){
        return agencia;
    }

    public void setAgencia(Long agencia){
        this.agencia = agencia;
    }

    public Long getNumero(){
        return numero;
    }

    public void setNumero(Long numero){
        this.numero = numero;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    @Override
    public String toString(){
        return "Conta{" + "agencia=" + agencia + ", numero=" + numero + ", cliente=" + cliente + '}';
    }
}
