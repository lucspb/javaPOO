package src.model;

import java.util.Date;

import src.utils.DataUtil;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String agencia, String conta, int digito, double saldoInicial) {
        //por baixo dos panos, ele cria uma conta bancaria
        super(agencia, conta, digito, saldoInicial);
        
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("********************************");
        System.out.println("******* Extrato Bancário *******");
        System.out.println("********************************");
        System.out.println();

        System.out.println("Gerado em: " + DataUtil.converterData(new Date()));
        System.out.println();

        for(Movimentacao movimentacao : this.movimentacoes){
            System.out.println(movimentacao);
            System.out.println();
        }
        System.out.println();
        System.out.println("********************************");
        System.out.println("********************************");
        System.out.println("********************************");
        
    }
    
}
