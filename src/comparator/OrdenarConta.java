package comparator;

import java.util.Comparator;


public class OrdenarConta implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2){
        if(c1.getNumero() < c2.getNumero()){
            return -1;
        }
        if(c1.getNumero() > c2.getNumero()){
            return 1;
        }
        return 0;
    }
}