package bitebank2;

public class SistemaInterno {

    private int senha = 2222;

   public boolean autentica(Autenticavel autenticavel){
       if(autenticavel.autentica(senha)){
           System.out.println("Logado com sucesso.");
           return true;
       }
       System.out.println("Senha Inválida.");
       return false;
   }
}
