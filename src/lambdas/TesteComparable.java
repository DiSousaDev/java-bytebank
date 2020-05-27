package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TesteComparable {

    public static void main(String[] args){


        Cliente cliente1 = new Cliente("João");
        Conta conta1 = new Conta(10L,15641L,cliente1);
        conta1.efetuarDeposito(1000.0);

        Cliente cliente2 = new Cliente("Emely");
        Conta conta2 = new Conta(10L,84665L,cliente2);
        conta2.efetuarDeposito(new Random().nextInt(1000));

        Cliente cliente3 = new Cliente("Davi");
        Conta conta3 = new Conta(10L,64684L,cliente3);
        conta3.efetuarDeposito(new Random().nextInt(1000));

        Cliente cliente4 = new Cliente("Ricardo");
        Conta conta4 = new Conta(10L,164531L,cliente4);
        conta4.efetuarDeposito(new Random().nextInt(1000));

        Cliente cliente5 = new Cliente("Anderson");
        Conta conta5 = new Conta(10L,21643L,cliente5);
        conta5.efetuarDeposito(new Random().nextInt(1000));

        List<Conta> contas = new ArrayList<>();

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);

        for (Conta conta : contas) {
            System.out.println(conta);
        }

        System.out.println("------------------");
        Collections.sort(contas);

        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

}
