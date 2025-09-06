package Animal;

public class Animais {
   private String nome;
   private String apelido;


   public Animais(String nome, String apelido){
        this.nome = nome;
        this.apelido = apelido;
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
