package Animal;

public class Cachorro extends Animais {

    private int ossos ;
    int idade;

    public Cachorro(String nome, String apelido, int idade){
        super(nome, apelido);
        this.ossos = 3;
        this.idade = idade;
    }

    public int getOssos(){
        return ossos;
    }
   
    public void lamber(){
        System.out.println(this.getNome() + " Lambeu");
    }
}
