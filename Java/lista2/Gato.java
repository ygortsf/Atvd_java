package lista2;

public class Gato extends Animal {
    
    public Gato(String nome, long id, double weight){
        super(nome, id, weight);

    }

    public void sound(){
        System.out.println("meow");
    }


}
