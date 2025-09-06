package Heranca;

public class ContaBancaria {
    
    private String clientes;
    private int num_conta;
    private double saldo;



    public ContaBancaria(String clientes, int num_conta, double saldo){
        this.clientes = clientes;
        this.saldo = saldo;
        this.num_conta = num_conta;
    }

    public String getClientes(){
        return clientes;
    }

    public int getNumConta(){
        return num_conta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setClientes(String clientes){
        this.clientes = clientes;
    }
    public void setNumConta(int num_conta){
        this.num_conta = num_conta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }


    boolean sacar (double valor){
        if (saldo - valor >= 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
