package lista2;

import java.util.ArrayList;

public class Animal {

    private long id;
    private String nome;
    private double weight;
    private ArrayList<Animal> habilidades;

    public Animal(String nome, long id, double weight){
        this.id = id;
        this.nome= nome;
        this.weight = weight;
    }

    
public long getId() {
        return id;
    }



    public void setId(long id) {
        this.id = id;
    }

    public void adicionar_habilidade(Animal animal){
        this.habilidades.add(animal);
    }


    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public double getWeight() {
        return weight;
    }



    public void setWeight(double weight) {
        this.weight = weight;
    }



public void sound(){
    System.out.println("o animal esta fazendo som");
}










}

