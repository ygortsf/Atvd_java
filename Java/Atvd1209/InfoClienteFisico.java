public class InfoClienteFisico extends InfoCliente {
    
    private String cpf;

    InfoClienteFisico(String info, String cpf){
        super(info);
        this.cpf = cpf;
    }


    @Override
    public void exibirInfo(){
    System.out.println();}
}
