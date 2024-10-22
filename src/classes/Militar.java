package classes;

public class Militar extends Personagem{
    public Militar(String nome, int idade) {
        super(nome, idade);
    }
    public void acao() {
        System.out.println(getNome() + " está treinando para os possíveis combates que virão.");
    }
}
