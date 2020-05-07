package bitebank2;

public class ContoleBonificacao {

    private double soma;

    public void registra(Funcionario funcionario){
        double bonificacao = funcionario.getBonificacao();
        this.soma += bonificacao;
    }

    public double getSoma(){
        return soma;
    }
}
