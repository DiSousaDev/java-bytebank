public class ContaCorrente {

    private double saldo;
    private String agencia;
    private String numero;
    private String nome;

    public ContaCorrente(){
    }

    public double getSaldo(){
        return saldo;
    }

    public String getAgencia(){
        return agencia;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void efetuarDeposito(double valor){
        this.saldo += valor;
    }

    public boolean efetuaSaque(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean efetuarTransferencia(double valor, ContaCorrente conta){
        if(this.saldo >= valor){
            efetuaSaque(valor);
            conta.efetuarDeposito(valor);
            return true;
        }
        return false;
    }
}
