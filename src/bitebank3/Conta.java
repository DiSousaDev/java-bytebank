package bitebank3;

public class Conta {

    private double saldo;
    private String agencia;
    private String numero;
    private Cliente cliente;
    private static int total;

    public Conta(String agencia, String numero){
        total++;
        System.out.println("O total de contas criadas é: " + total);

        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Conta criada: " + this.numero + " Agência: " + this.agencia );
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

    public static int getTotal(){
        return Conta.total;
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

    public boolean efetuarTransferencia(double valor, Conta conta){
        if(efetuaSaque(valor)){
            conta.efetuarDeposito(valor);
            return true;
        }
        return false;
    }
}
