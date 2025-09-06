package Classes;

public class Celular {
    
    String nome;
    String sistemaOperacional;
    int memoria ;
    double tamanhoTela;

    public Celular(String nome,String sistemaOperacional, int memoria, double tamanhoTela) {
        System.out.println("um celular será criado");
        this.nome = nome;
        this.sistemaOperacional = sistemaOperacional;
        this.memoria = memoria;
        this.tamanhoTela = tamanhoTela;
    }

    public void ligar(){
        System.out.println(this.nome + " está ligado!");
    }

    public String mostrar(){
        return "modelo do celular: "+ this.nome + " Memoria de:" + this.memoria;
    }
}
