package gerenciador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TestePessoa {

    public static void main(String[] args) throws FileNotFoundException{

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(new File("nomes.txt"));

        List<Pessoa> pessoas = new ArrayList<>();

        while(scan.hasNext()){
            Scanner linhaScan = new Scanner(scan.nextLine());
            linhaScan.useDelimiter(",");
            pessoas.add(new Pessoa(linhaScan.next(),linhaScan.nextInt()));
            linhaScan.close();
        }

        Collections.sort(pessoas);
        System.out.println("Ordenando por ordem alfabética:");
        System.out.println("---------------------------------------");
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }

        Collections.sort(pessoas, Comparator.comparing(Pessoa::getIdade));
        System.out.println("Ordenando por ordem de idade:");
        System.out.println("---------------------------------------");
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }

        scan.close();
    }

}
