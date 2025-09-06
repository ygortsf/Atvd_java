package Classes;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Celular samsung = new Celular("Samsung", "Android", 256,15.8);
        

        System.out.println("Digite um nome: ");
        String nome = scanner.nextLine();
        samsung.nome = nome;
        System.out.println("Escolha o sistema operacional");
        String sis = scanner.nextLine();
        samsung.sistemaOperacional = sis;
        System.out.println("Escolha memoria: ");
        int mem = scanner.nextInt();
        samsung.memoria = mem;

        System.out.println("Seu celular criado foi um: "+ samsung.nome + " com Sistem operacional: "+ samsung.sistemaOperacional );

            System.out.println(samsung.mostrar());

        

    }
}
