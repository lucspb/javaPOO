public class App {
    public static void main(String[] args) {
        System.out.println("hello world");

        //instanciando uma classe, construindo um objeto
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Lucas";
        pessoa1.idade = 21;

        System.out.println(pessoa1.idade);
        System.out.println(pessoa1.nome);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Andreza";
        pessoa2.idade = 23;

        System.out.println(pessoa2.idade);
        System.out.println(pessoa2.nome);

        Carro carro1 = new Carro();
        carro1.ano = 2023;
        carro1.modelo = "corolla";
        carro1.cor = "preto";

        System.out.println(carro1.ano);
        System.out.println(carro1.modelo);
        System.out.println(carro1.cor);

    }
}