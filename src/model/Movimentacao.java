package src.model;

import java.util.Date;

import src.utils.DataUtil;

public class Movimentacao {
    private String descricao;
    private Date data;
    private double valor;

    public Movimentacao(String descricao, double valor) {
        this.descricao = descricao;
        this.data = new Date();
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString(){
        String dataFormatada = DataUtil.converterData(this.getData());
        return this.getDescricao() + " \n" + dataFormatada + " - R$ " + this.valor;

    }
}
