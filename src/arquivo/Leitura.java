package arquivo;

import java.io.*;
import java.util.Properties;

public class Leitura {

    public void ler(String arquivo) throws IOException{

        //fluxo de entrada de arquivo
        FileInputStream fis = new FileInputStream(arquivo);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();
    }
}
