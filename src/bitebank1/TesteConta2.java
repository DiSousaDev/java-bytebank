package bitebank1;

public class TesteConta2 {
    public static void main(String[] args){

        Cliente cliente1 = new Cliente();

        cliente1.setNome("Diego Sousa");
        cliente1.setCPF("05496280966");
        cliente1.setProfissao("Dev");

        ContaCorrente conta1 = new ContaCorrente("1234", "123456");

        conta1.setCliente(cliente1);
        conta1.efetuarDeposito(150);

        System.out.println("bitebank1.Cliente: " + conta1.getCliente().getNome() + " Saldo: " + conta1.getSaldo());

        ContaCorrente conta2 = new ContaCorrente("1234", "654321");

        System.out.println(ContaCorrente.getTotal());
    }
}
