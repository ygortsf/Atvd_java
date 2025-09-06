package Animal;

public class App {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Thor");
     
        System.out.println(dog.getNome());
        dog.lamber();
        System.out.println(dog.getOssos());
    }
}