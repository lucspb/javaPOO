package src.model;

import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria{
    private String agencia;
    private String conta;
    private int digito;
    private double saldo;
    private Date dataAbertura;

    private double VALOR_MINIMO_DEPOSITO = 10.0;

    public ContaBancaria(String agencia, String conta, int digito, double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();
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
    }

    public Double sacar(double valor){
        if(valor > this.saldo){
            throw new InputMismatchException("O saldo é insuficiente");
        }
        this.saldo -= valor;
        return valor;        
    }

    public void transferir(double valor, ContaBancaria contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
    
}