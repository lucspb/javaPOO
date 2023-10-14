package src;

import src.model.ContaCorrente;
import src.model.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        System.out.println("Criando um banco digital");
        System.out.println();

        ContaPoupanca conta1 = new ContaPoupanca("0001", "12345", 1, 0);
        ContaCorrente conta2 = new ContaCorrente("0001", "34251", 2, 50);

        System.out.println("Saldo inicial: " + conta1.getSaldo());
        conta1.depositar(50.0);
        System.out.println("Saldo após depósito: " + conta1.getSaldo());
        System.out.println();
        double saque = conta1.sacar(20.0);
        System.out.println("Saldo após saque: " + conta1.getSaldo());
        System.out.println();
        conta2.transferir(40.0, conta1);
        System.out.println("Saldo da conta 1 após transferencia: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2 após transferencia: " + conta2.getSaldo());
    }
}
