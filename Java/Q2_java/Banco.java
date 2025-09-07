package Q2_java;

public class Banco {
    
   private Cliente clientes [] ;
   


    public void cadastrarCliente(){
        clientes = new Cliente[2];
        clientes[0] = new Cliente("caio", "134569060-10", 2609, 200);
        clientes[1] = new Cliente("Ada love", "98765431", 12345);
    }


     public Cliente getCliente(int indice) {
        if (indice >= 0 && indice < clientes.length) {
            return clientes[indice];
        } else {
            System.out.println("Índice inválido.");
            return null;
        }
    }

    public void mostrarCliente(){
        for(int i = 0 ; i < clientes.length ; i++){
            System.out.print("\n"+clientes[i].toString() + " ");
        }
    }

     public String operacoes() {


        for (Cliente c : clientes) {
            c.saque(100); 
            c.depositar(50);
        }

        for (Cliente c : clientes) {
            if (c.getSaldo() < 0) {
                c.setSaldo(0);
            }
        }

        clientes[1].setName("Ada Lovelace");

        clientes[0].setCpf("12345689");


        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            resultado.append(clientes[i].toString());
            resultado.append("\n-------------------\n");
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Banco b1 = new Banco();
        b1.cadastrarCliente();
        Cliente c1 = b1.getCliente(0);
        System.out.println(c1);
        System.out.println(b1.operacoes());
    }


}
