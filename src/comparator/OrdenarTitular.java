package comparator;

import java.util.Comparator;

public class OrdenarTitular implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2){
            return c1.getCliente().getNome().compareTo(c2.getCliente().getNome());
    }
}
