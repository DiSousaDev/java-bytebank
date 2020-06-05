package gerenciador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestarCurso {

    public static void main(String[] args){

        Curso java = new Curso("Dominando as coleções Java", "Paulo Silveira");

        java.adiciona(new Aula("Revistando as ArrayList",21));
        java.adiciona(new Aula("Criando uma Aula",20));
        java.adiciona(new Aula("Revistando as ArrayList",21));

        List<Aula> aulasImutaveis = java.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(java.getTempoTotal());


    }

}
