package src;

import java.util.ArrayList;
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
        conta1.sacar(10);
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

        //Conta corrente
        conta2.imprimirExtrato();
        System.out.println();
        System.out.println();
        System.out.println();
        //conta poupança
        conta1.imprimirExtrato();

        ArrayList<ContaPoupanca> cp = new ArrayList<ContaPoupanca>();

        ContaPoupanca conta3 = new ContaPoupanca("0001", "34351", 9, 0);
        ContaPoupanca conta4 = new ContaPoupanca("0001", "55555", 3, 50);
        ContaPoupanca conta5 = new ContaPoupanca("0001", "23543", 4, 120);

        cp.add(conta1);
        cp.add(conta3);
        cp.add(conta4);
        cp.add(conta5);

        cp.stream().count();
        
        // limita até o indice 2 do array e retorna o saldo deles
        cp.stream()
        .limit(2)
        .forEach(c -> System.out.println(c.getSaldo()));
        
        System.out.println();
        System.out.println();
        //pula as duas primeiras contas do array e retorna o saldo deles
        cp.stream()
        .skip(2)
        .forEach(c -> System.out.println(c.getSaldo()));

        System.out.println();
        System.out.println();

        // filtro de contas por saldo maior que 100
        cp.stream().
        filter(c -> c.getSaldo() > 100)
        .forEach(c -> System.out.println(c.getSaldo()));

        // retorna apenas as contas
        cp.stream().map(c -> c.getConta());
        cp.stream().map(ContaPoupanca::getConta);
    }
}
