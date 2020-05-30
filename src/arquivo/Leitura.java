package arquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

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
