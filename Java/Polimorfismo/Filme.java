package Polimorfismo;

public class Filme extends Video{
    
    

    private String audio;
    private String legenda;

    public Filme(String nome){
        super(nome);
        this.audio ="portugues";
        this.legenda = "nenhuma";
    }

    public Filme(String nome, String audio, String legenda){
        super(nome);
        this.audio = audio;
        this.legenda = legenda;
    }

    public String toString(){
        return "Filme: "+ getNome() + " Audio: "+ getAudio() +" legenda: " + getLegenda();
    }


    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    @Override
    public void play() {
        System.out.println("play: " + toString());
    }

    public void play(String audio){
        this.audio = audio;
        
        if( audio == "portugues"){
            this.legenda = "nenhuma";
        }
        else{
            this.legenda = "português";
        }
        System.out.println(toString());
    }


    public void play(String audio, String legenda){
        this.audio = audio;
        this.legenda = legenda;
        System.out.println("Filme: "+ getNome() + " Audio: "+ audio +" legenda: " + legenda);
    }

  

}
