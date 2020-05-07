package bitebank3;

public class ContaCorrente extends Conta{

    private static double taxa = 0.1;

    public ContaCorrente(String agencia, String numero){
        super(agencia, numero);
    }

    public static void setTaxa(double taxa){
        ContaCorrente.taxa = taxa;
    }

    public static double getTaxa(){
        return taxa;
    }

    public boolean efetuaSaque(double valor){
        double valorASacar = valor + 0.2;
        return super.efetuaSaque(valorASacar);
    }
}

