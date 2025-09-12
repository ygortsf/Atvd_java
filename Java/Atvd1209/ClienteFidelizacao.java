public class ClienteFidelizacao extends Cliente{
    
    private double bonus;
    private String validade;

    ClienteFidelizacao(String nome, String endereco, double bonus, String validade){
        super(nome, endereco);
        this.bonus = bonus;
        this.validade = validade;
    }
}
