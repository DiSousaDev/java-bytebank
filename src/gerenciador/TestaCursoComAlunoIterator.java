package gerenciador;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAlunoIterator {

    public static void main(String[] args){

        Curso java = new Curso("Dominando as coleções Java", "Paulo Silveira");

        java.adiciona(new Aula("Trabalhando com ArrayList",21));
        java.adiciona(new Aula("Criando uma Aula",20));
        java.adiciona(new Aula("Modelando as coleções",21));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Marco Bruno", 17645);


        java.matricula(a1);
        java.matricula(a2);
        java.matricula(a3);

        Set<Aluno> alunos = java.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();
        while(iterator.hasNext()){
            Aluno proximo = iterator.next();
            System.out.println(proximo);
        }


    }

}
