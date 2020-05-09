package bitebank3;

public class TesteTributaveis {
    public static void main(String[] args){

        ContaCorrente cc = new ContaCorrente("1234","1111");
        cc.efetuarDeposito(100);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calculador = new CalculadorDeImposto();

        calculador.registra(cc);
        calculador.registra(seguro);

        System.out.println(calculador.getTotalImposto());

    }
}
