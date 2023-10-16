package src.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria{
    protected String agencia;
    protected String conta;
    protected int digito;
    protected double saldo;
    protected Date dataAbertura;

    protected double VALOR_MINIMO_DEPOSITO = 10.0;

    protected ArrayList<Movimentacao> movimentacoes;

    public ContaBancaria(String agencia, String conta, int digito, double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();

        // instanciar para não acontecer null pointer exception
        this.movimentacoes = new ArrayList<Movimentacao>();

        Movimentacao movimentacao1 = new Movimentacao("Abertura de conta", saldoInicial);
        
        //aqui estou iniciando o extrato bancario
        this.movimentacoes.add(movimentacao1);
    }
    
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public int getDigito() {
        return digito;
    }
    public void setDigito(int digito) {
        this.digito = digito;
    }
    public double getSaldo() {
        return saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }
    
    public void depositar(double valor){
        if(valor < VALOR_MINIMO_DEPOSITO){
            throw new InputMismatchException("O valor minímo de deposito é R$" + VALOR_MINIMO_DEPOSITO);  
        }
        this.saldo += valor;

        Movimentacao movimentacao = new Movimentacao("Deposito", valor);
        this.movimentacoes.add(movimentacao);
    }

    public Double sacar(double valor){
        if(valor > this.saldo){
            throw new InputMismatchException("O saldo é insuficiente");
        }
        this.saldo -= valor;
        Movimentacao movimentacao = new Movimentacao("Saque", valor);
        this.movimentacoes.add(movimentacao);
        
        return valor;        
    }

    public void transferir(double valor, ContaBancaria contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    // metodo abstrato obriga as classes herdeiras de implementarem este metodo
    public abstract void imprimirExtrato();
    
    
}