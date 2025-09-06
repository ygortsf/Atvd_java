package Animal;

public class Cachorro extends Animais {

    private int ossos ;

    public Cachorro(String nome){
        super(nome);
        this.ossos = 3;
    }

    public int getOssos(){
        return ossos;
    }
   
    public void lamber(){
        System.out.println(this.getNome() + " Lambeu");
    }
}
