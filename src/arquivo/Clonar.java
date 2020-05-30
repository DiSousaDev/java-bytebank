package arquivo;

import java.io.*;

public class Clonar {

    public void escreve(String leitura, String escrever) throws IOException{

        //fluxo de saida de arquivo
        FileOutputStream fos = new FileOutputStream(escrever);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        //fluxo de entrada de arquivo
        FileInputStream fis = new FileInputStream(leitura);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }
        br.close();
        bw.close();
    }
}

