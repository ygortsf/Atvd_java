package Q2_java;

public class Cliente {
    
    String name, cpf;
    int saldo, numConta;

    public Cliente(String name, String cpf, int numConta, int saldo){
        this.name = name;
        this.cpf = cpf;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public Cliente(String name, String cpf, int numConta){
        this.name = name;
        this.cpf = cpf;
        this.numConta = numConta;
    }


    public String getName(){
        return name;
    }

    public String getCpf(){
        return cpf;
    }
    public int getSaldo(){
        return saldo;
    }
    public int getNumConta(){
        return numConta;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public int extrato(){
        return this.saldo;
    }

    public void saque(int valor){
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente, você é pobre");
        }
        
    }

    public void depositar(int valor){
        if (valor > 0) {
            this.saldo += valor;
        }
        else{
            System.out.println("valor inválido");
        }
    }

    public String toString(){
        return "Cliente: " + name + "\n" + cpf + "\n" + numConta + "\n" + saldo;
    }


}
