package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("lagoa azul","Dublado","Portguês");

        filme.play("portugues");
        Serie serie = new Serie("the last of us", 5, 15);
        serie.play(6,15);


    }
}
