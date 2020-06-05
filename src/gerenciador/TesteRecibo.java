package gerenciador;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteRecibo {

    public static void main(String[] args){

        Recibo rec1 = new Recibo(1,500.00, "João Silva");
        Recibo rec2 = new Recibo(3,1230.00, "Mario Bruno");
        Recibo rec3 = new Recibo(2,274.00, "Fernanda Abreu");

        Set<Recibo> recibos = new TreeSet<>(new OrdenarPorId());

        recibos.add(rec1);
        recibos.add(rec2);
        recibos.add(rec3);

        Iterator<Recibo> iterator = recibos.iterator();
        while (iterator.hasNext()){
            Recibo rec = iterator.next();
            System.out.println(rec);
        }

    }
}
