public class Departamento{
    int cod;
    String nome;


    public Departamento(int cod, String nome){
        this.nome = nome;
        this.cod = cod;
    }


    public String getName(){
        return nome;
    }

    public int getCod(){
        return cod;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCod(int cod){
        this.cod = cod;
    }

    public String toString(){
        return getCod()+ " "+getName().toString();
    }

}