package comparator;

import java.util.Comparator;


public class OrdenarConta implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2){
        return Long.compare(c1.getNumero(), c2.getNumero());
    }
}
