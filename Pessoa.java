public class Pessoa {
    private String nome;
    private int idade;


/**
 * public: indicar que qualquer um pode acessar 
 * private: somente a classe consegue acessar
 * protected: indica a classe e seus filhos conseguem acessar
 * default: somente a classe, seus filhos e classes da mesma package podem acessar
 */

 /**
  * getters e setters
  */

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

  public int getIdade(){
    return this.idade;
  }
  
  public void setIdade(int idade){
    this.idade = idade;
  }
}

