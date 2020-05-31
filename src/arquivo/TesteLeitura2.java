package arquivo;

import javax.imageio.IIOException;
import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.Scanner;

public class TesteLeitura2 {

    public static void main(String[] args) throws Exception{

        Locale.setDefault(Locale.US);
        //Scanner scan = new Scanner(new File("contas.csv"));
        Properties props = loadProperties();

        String cc = props.getProperty("TESTE");

        System.out.println(cc);

    }


    public static Properties loadProperties(){
        try (FileInputStream fs = new FileInputStream(new File("contas.csv"))) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException erro) {
         throw new RuntimeException();
        }
    }
}



