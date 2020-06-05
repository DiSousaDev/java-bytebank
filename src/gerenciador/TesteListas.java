package gerenciador;

import java.util.ArrayList;
import java.util.Collections;

public class TesteListas {

    public static void main(String[] args){

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando Classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);
        aulas.remove(0);
        System.out.println(aulas);

        for(String aula : aulas){
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);

        aulas.add("Aumentando nosso conhecimento.");

        System.out.println("Percorrendo aulas");
        aulas.forEach(aula -> {
            System.out.println("Aula: " + aula);
        });

        Collections.sort(aulas);

        System.out.println("Ordenando aulas");
        aulas.forEach(aula -> {
            System.out.println("Aula: " + aula);
        });

    }

}
