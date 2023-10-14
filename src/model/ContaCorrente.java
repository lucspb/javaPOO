package src.model;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String agencia, String conta, int digito, double saldoInicial) {
        //por baixo dos panos, ele cria uma conta bancaria
        super(agencia, conta, digito, saldoInicial);
        
    }
    
}
