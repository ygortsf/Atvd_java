public class Aplicacao {
    public static void main(String[] args) {
        Departamento d = new Departamento(3, "Ygor");
        Funcionario f = new Funcionario(123, "Jason", d);
        System.out.println(f.toSting()); 
    }
}