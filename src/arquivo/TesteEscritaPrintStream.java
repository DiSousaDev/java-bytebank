package arquivo;

import java.io.*;

public class TesteEscritaPrintStream {

    public static void main(String[] args) throws IOException{

        //BufferedWriter bw = new BufferedWriter(new FileWriter("lorem3.txt"));

        //PrintStream ps = new PrintStream(new File("lorem3.txt"));
        PrintWriter ps = new PrintWriter(new File("lorem3.txt")) ;

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod \n"
                + "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, \n"
                + "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo \n"
                + "consequat. Duis aute irure dolor in reprehenderit in voluptate velit \n"
                + "esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat \n"
                + "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim \n"
                + "id est laborum. ");
        ps.close();
    }
}
