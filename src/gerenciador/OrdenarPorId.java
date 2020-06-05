package gerenciador;

import java.util.Comparator;

public class OrdenarPorId implements Comparator<Recibo> {


    @Override
    public int compare(Recibo rec1, Recibo rec2){
        return rec1.getId() - rec2.getId();
    }
}
