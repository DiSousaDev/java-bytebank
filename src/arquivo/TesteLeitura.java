package arquivo;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException{

        Leitura arquivo1 = new Leitura();
        String caminho = "lorem.txt";

        arquivo1.ler(caminho);

    }

}
