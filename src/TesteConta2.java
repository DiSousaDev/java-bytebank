public class TesteConta2 {
    public static void main(String[] args){

        Cliente cliente1 = new Cliente();

        cliente1.setNome("Diego Sousa");
        cliente1.setCPF("05496280966");
        cliente1.setProfissao("Dev");

        ContaCorrente conta1 = new ContaCorrente();

        conta1.setAgencia("1234");
        conta1.setNumero("123456");
        conta1.setCliente(cliente1);
        conta1.efetuarDeposito(150);

        System.out.println("Cliente: " + conta1.getCliente().getNome() + " Saldo: " + conta1.getSaldo());

    }
}
