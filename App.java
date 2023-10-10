public class App {
    public static void main(String[] args) {
        System.out.println("hello world");

        //instanciando uma classe, construindo um objeto
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Lucas");
        pessoa1.setIdade(21);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Andreza");
        pessoa2.setIdade(20);

        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());

        Carro carro1 = new Carro();
        carro1.setAno(2020);
        carro1.setModelo("corolla");
        carro1.setCor("preto");

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAno());
        System.out.println(carro1.getCor());

        Carro carro2 = new Carro("Gol", 2023, "branco");
        
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAno());
        System.out.println(carro2.getCor());
        
    }
}