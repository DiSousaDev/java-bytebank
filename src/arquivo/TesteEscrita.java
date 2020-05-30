package arquivo;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException{

       Clonar esc = new Clonar();
       esc.escreve("Lorem.txt","LoremTeste.txt");

    }

}
