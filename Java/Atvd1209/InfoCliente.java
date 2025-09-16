import java.sql.Date;

public abstract class InfoCliente {
    private String info;
    private Date dataCadastro;

    InfoCliente(String info){
        this.info = info;
    }

    public void exibirInfo(){
    }
}
