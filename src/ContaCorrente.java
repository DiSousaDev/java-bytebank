public class ContaCorrente {

    private double saldo;
    private String agencia;
    private String numero;
    private Cliente cliente;

    public ContaCorrente(){
    }

    public double getSaldo(){
        return saldo;
    }

    public String getAgencia(){
        return agencia;
    }

    public void setAgencia(String agencia){
        if(agencia != null){
            System.out.println("Numero inválido.");
            return;
        }
        this.agencia = agencia;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        if(numero != null){
            System.out.println("Numero inválido.");
            return;
        }
        this.numero = numero;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
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
