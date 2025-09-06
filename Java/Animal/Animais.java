package Animal;

public class Animais {
   private String nome;


   public Animais(String nome){
        this.nome = nome;
   }


    public void comer(){
    System.out.println(this.nome +"andou");
    }
    public void beber(){
        System.out.println(this.nome + "bebeu");
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
