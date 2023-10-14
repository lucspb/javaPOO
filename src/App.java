package src;

import src.model.ContaBancaria;

public class App {
    public static void main(String[] args) {
        System.out.println("Criando um banco digital");
        System.out.println();


        ContaBancaria conta1 = new ContaBancaria("0001", "12345", 1, 0);

        System.out.println("Saldo inicial: " + conta1.getSaldo());

        conta1.depositar(50.0);
        System.out.println("Saldo após depósito");
        System.out.println(conta1.getSaldo());
        System.out.println();
        double saque = conta1.sacar(20.0);
        System.out.println("Saldo após saque");
        System.out.println(conta1.getSaldo());
    }
}
