public class App {
   
public static void interagirComAnimal(Animal animal[]){


    for (int i = 0; i<animal.length; i++) {
        animal[i].fazerSom();
    }

    
}


    public static void main(String[] args) {

        Animal animal [] = new Animal[4];
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        animal [0]= new Cachorro();
        animal [1]= new Gato();
        animal [2] = new Cachorro();
        animal [3] = new Gato();
        int a = 2;
        int b= 1;
      interagirComAnimal(animal);
    }
}
