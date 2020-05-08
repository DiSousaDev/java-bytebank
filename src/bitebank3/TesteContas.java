package bitebank3;

public class TesteContas {
    public static void main(String[] args){

        Conta cc = new ContaCorrente("111","1234");
        cc.efetuarDeposito(100);

        Conta cp = new ContaPoupanca("222","4321");
        cp.efetuarDeposito(200);

        cc.efetuarTransferencia(10.0,cp);

        System.out.println("C/C: " + cc.getSaldo());

        System.out.println("C/P: " + cp.getSaldo());



    }
}
