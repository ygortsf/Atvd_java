package Polimorfismo;

public class Serie extends Filme {
    
    private int temporadas ;
    private int episodioPorTemporada;
    private int episodioAtual;
    private int temporadaAtual;
    


    public Serie(String nome, int temporadas, int episodioPorTemporada) {
        super(nome);
        this.temporadas = temporadas;
        this.episodioPorTemporada = episodioPorTemporada;
        this.temporadaAtual = 1;
        this.episodioAtual = 1;
    }
     

    @Override
    public String toString() {
        return "Serie: "+ getNome() +
        " " + temporadaAtual +
        "x"+ episodioAtual +
         " Audio: "+ getAudio() 
         +" legenda: " + getLegenda();
    }



    private boolean validarEpisodio(int temporada, int episodio){
        if (temporada == 0 || episodio == 0) {
            return false;
        }
        if (temporada > temporadas || episodio > episodioPorTemporada) {
            return false;
        }
        return true;
    }

    public void play(int temporadas, int episodio){
        if(validarEpisodio(temporadas, episodio)){
        this.temporadaAtual = temporadas;
        this.episodioAtual = episodio;
        System.out.println("play: " + toString());
        }
        else{
            System.out.println( "foi triste invalido vius");
        }
    }

    public int getTemporadas(){
        return temporadas;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }


    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }


    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }


    public int getEpisodioAtual() {
        return episodioAtual;
    }


    public void setEpisodioAtual(int episodioAtual) {
        this.episodioAtual = episodioAtual;
    }


    public int getTemporadaAtual() {
        return temporadaAtual;
    }


    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }

    

}
