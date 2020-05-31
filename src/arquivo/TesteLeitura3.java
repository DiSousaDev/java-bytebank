package arquivo;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura3 {

    public static void main(String[] args) throws Exception{

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(new File("contas.csv"));

        while(scan.hasNextLine()) {
            String linha = scan.nextLine();
            System.out.println(linha);

            Scanner linhaScan = new Scanner(linha);
            linhaScan.useDelimiter(",");

            String valor1 = linhaScan.next();
            int valor2 = linhaScan.nextInt();
            int valor3 = linhaScan.nextInt();
            String valor4 = linhaScan.next();
            double valor5 = linhaScan.nextDouble();

            System.out.println(valor1 + ", " + valor2 + ", " + valor3 + ", " + valor4 + ", " + valor5);

//            String[] valores = linha.split(",");
//            System.out.println(valores[3]);
            linhaScan.close();

        }

        scan.close();

    }
}
