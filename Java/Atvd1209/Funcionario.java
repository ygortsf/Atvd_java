public class Funcionario {

    private String nome;
    private double salario;


    Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getnome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void aumentaSalario(){
    }
}