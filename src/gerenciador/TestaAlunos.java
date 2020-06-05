package gerenciador;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args){

        Set<String> alunos = new HashSet<>();

        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        System.out.println(alunos);

        for(String aluno : alunos){
            System.out.println(aluno);
        }
        System.out.println(alunos.size());

        boolean diegoEstaMatriculado = alunos.contains("Diego Sousa");
        System.out.println(diegoEstaMatriculado);
        alunos.remove("Renan Saggio");

        for(String aluno : alunos){
            System.out.println(aluno);
        }

        System.out.println(alunos.size());

    }
}
