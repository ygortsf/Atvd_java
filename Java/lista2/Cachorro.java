package lista2;

public class Cachorro extends Animal {
    
    
    
    public Cachorro(String nome, long id, double weight){
        super(nome, id, weight);
    }

    public void sound(){
        System.out.println(this.getNome() + ": au ua");
    }

}
