class Funcionario {

    private int mat;
    private String nome;
    private Departamento dept;

    public Funcionario(int mat, String nome, Departamento dept){
        this.mat = mat;
        this.nome = nome;
        this.dept = dept;
    }

    public int getMat(){
        return mat;
    }

    public Departamento getDept(){
        return dept;
    }

    public void setMat(int mat){
        this.mat  = mat;
    }

    public void setDept(Departamento d){
        dept = d;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String toString(){
        return getNome() + " " + getMat() + " "+ getDept().toString();
    }
    
}