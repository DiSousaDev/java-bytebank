package arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod \n"
                + "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, \n"
                + "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo \n"
                + "consequat. Duis aute irure dolor in reprehenderit in voluptate velit \n"
                + "esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat \n"
                + "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim \n"
                + "id est laborum. ");
        bw.close();
    }
}
