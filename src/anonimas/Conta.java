package anonimas;

public class Conta implements Comparable<Conta> {

    private Long agencia;
    private Long numero;
    private double saldo;
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

    public Double getSaldo(){
        return saldo;
    }

    public void efetuarDeposito(double valor){
        this.saldo += valor;
    }

    @Override
    public int compareTo(Conta outra){ //ordernar contas por saldo.
        return Double.compare(this.saldo, outra.saldo);
    }

    @Override
    public String toString(){
        return "Conta{" + "agencia=" + agencia + ", numero=" + numero + ", cliente=" + cliente + ", saldo=" + saldo + '}';
    }
}
