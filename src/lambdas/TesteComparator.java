package lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteComparator {

    public static void main(String[] args){

        Cliente cliente1 = new Cliente("João");
        Conta conta1 = new Conta(10L, 15641L, cliente1);

        Cliente cliente2 = new Cliente("Emely");
        Conta conta2 = new Conta(10L, 84665L, cliente2);

        Cliente cliente3 = new Cliente("Davi");
        Conta conta3 = new Conta(10L, 64684L, cliente3);

        Cliente cliente4 = new Cliente("Ricardo");
        Conta conta4 = new Conta(10L, 164531L, cliente4);

        Cliente cliente5 = new Cliente("Anderson");
        Conta conta5 = new Conta(10L, 21643L, cliente5);

        List<Conta> contas = new ArrayList<>();

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);

        contas.forEach(conta -> System.out.println(conta));

        System.out.println("------------------");

        contas.sort((c1, c2) -> Long.compare(c1.getNumero(), c2.getNumero()));
        contas.forEach(conta -> System.out.println(conta));

        System.out.println("------------------");

        contas.sort((c1, c2) -> c1.getCliente().getNome().compareTo(c2.getCliente().getNome()));//ordenando por nomes
        contas.forEach(conta -> System.out.println(conta));

    }
}
