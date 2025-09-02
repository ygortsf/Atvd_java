package Q1_java;

import java.util.ArrayList;

public class Locadora {
    
    private String nome;

    private ArrayList<Filmes> filmes ;

    public Locadora(String nome){
        this.filmes = new ArrayList<>();
        this.nome = nome;
    }


    public void adicionar_filmes( Filmes filmes){
        this.filmes.add(filmes);
    }

    public void listarFilmes( ){
        for(int i = 0 ; i< filmes.size(); i ++){
            System.out.println(filmes.get(i));
        }
    }
}
