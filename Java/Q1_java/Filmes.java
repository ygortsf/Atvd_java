package Q1_java;

public class Filmes {
    private String titulo;
    private String genero;
    private int ano_lancamento;

    public Filmes(String titulo, String genero, int ano_lancamento){
        this.ano_lancamento = ano_lancamento;
        this.genero = genero ;
        this.titulo = titulo;
    }

     public Filmes(String titulo, String genero){
        this.genero = genero ;
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getGenero(){
        return genero;
    }


    public int getAnoLancamento(){
        return ano_lancamento;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setAnoLancamento(int ano_lancamento){
        this.ano_lancamento = ano_lancamento;
    }


    public String toString(){
        return titulo + " Gênero:" + genero + " ano de lançamento:" + ano_lancamento;
    }

}
