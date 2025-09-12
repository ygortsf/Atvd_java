public class InfoClienteJuridico extends InfoCliente{
    private String cnpj;

    InfoClienteJuridico(String info, String cnpj){
        super(info);
        this.cnpj = cnpj;
    }
}
