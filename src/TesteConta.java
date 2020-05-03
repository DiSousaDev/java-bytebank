public class TesteConta {
    public static void main(String[] args){

        ContaCorrente conta1 = new ContaCorrente();

        conta1.efetuarDeposito(100);
        conta1.efetuaSaque(50);
        System.out.println(conta1.getSaldo());

        ContaCorrente conta2 = new ContaCorrente();
        conta2.efetuarDeposito(200);

        if(conta2.efetuarTransferencia(300, conta1)){
            System.out.println("Transferência Realizada!");
        }else{
            System.out.println("Saldo insuficiente.");
        }

        System.out.println(conta2.getSaldo());
        System.out.println(conta1.getSaldo());




    }
}
