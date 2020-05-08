package bitebank2;

public class TesteReferencia {
    public static void main(String[] args){

        Funcionario gerente = new Gerente();

        gerente.setNome("Marcos");
        gerente.setSalario(5000.0);

        Funcionario editordevideo = new EditorDeVideo();
        editordevideo.setSalario(2000.0);

        Funcionario designer = new Designer();
        designer.setSalario(3000.00);

        ContoleBonificacao controle = new ContoleBonificacao();

        controle.registra(gerente);
        controle.registra(editordevideo);
        controle.registra(designer);


        System.out.println(controle.getSoma());



    }

}
