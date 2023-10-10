public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    public String getModelo(){
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public String getCor(){
        return this.cor;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public Carro(){}

    public Carro(String modelo, int ano, String cor){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

}
