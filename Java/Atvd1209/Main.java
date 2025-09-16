public class Main {
    public static void main(String[] args) {
        InfoCliente ic = new InfoClienteFisico("123", "fulano@gmail.com");
        Cliente c = new Cliente("ygor", "vitoria", ic);
    }
}
