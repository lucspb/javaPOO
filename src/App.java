package src;

import java.util.Scanner;

import src.model.ContaCorrente;
import src.model.ContaPoupanca;
import src.model.Movimentacao;
import src.utils.DataUtil;

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
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do saque");
        double valorSaque = scan.nextDouble();
        conta1.sacar(valorSaque);
        System.out.println("Saldo após saque: " + conta1.getSaldo());
        System.out.println();
        conta2.transferir(40.0, conta1);    
        System.out.println("Saldo da conta 1 após transferencia: " + conta1.getSaldo());
        System.out.println();
        System.out.println("Saldo da conta 2 após transferencia: " + conta2.getSaldo());
        System.out.println();
        System.out.println("Data de abertura da conta 2: " + conta2.getDataAbertura());

        var dataFormatada = DataUtil.converterData(conta1.getDataAbertura());
        System.out.println("Data atual: " + dataFormatada);

        var horaFormatada = DataUtil.converterHora(conta2.getDataAbertura());
        System.out.println("Hora atual: " + horaFormatada);

        Movimentacao movimentacao = new Movimentacao("saque", valorSaque);
        System.out.println(movimentacao);

        System.out.println(movimentacao.toString());
    }
}
