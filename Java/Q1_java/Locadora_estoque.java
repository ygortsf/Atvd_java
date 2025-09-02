package Q1_java;

public class Locadora_estoque {
    public static void main(String[] args) {
        Filmes f1 = new Filmes("Missão Impossível : Acerto de contas","Ação", 2025);
        Filmes f2 = new Filmes("Harry Potter", "Ficção");
       Locadora loc = new Locadora("opa");
       loc.adicionar_filmes(f1);
       loc.listarFilmes();

        
    }
}
