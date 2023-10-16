package src.model;

import java.util.Date;

import src.utils.DataUtil;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String agencia, String conta, int digito, double saldoInicial) {
        super(agencia, conta, digito, saldoInicial); 
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("********************************");
        System.out.println("******* Extrato Poupança *******");
        System.out.println("********************************");
        System.out.println();

        System.out.println("Gerado em: " + DataUtil.converterData(new Date()));
        System.out.println();

        for(Movimentacao movimentacao : this.movimentacoes){
            System.out.println(movimentacao);
            System.out.println();
        }
        System.out.println("********************************");
        System.out.println("********************************");
        System.out.println("********************************");
        
    }
        
    
}
