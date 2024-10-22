package classes;
//essa classe vai ser usada como classe mâe para os personagens cientista;
//governante e militar.
public abstract class Personagem {
    private String nome;
    private int idade;

    //contrutor da classe Personagem, recebendo os parâmetros nome e idade
    public Personagem(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
//método abstrato das subclasses (será a mesma para as 3)
    public abstract void acao();

//exibir as informações do personagem na tela
    public void exibirInfo() {
        System.out.println("Muito bem! Olá, " + nome + "\nVocê terá: " + idade + " anos no início da história. Vamos começar?");
        

    }
}
