package classes;
import java.util.Scanner;
//essa classe vai servir como o "videogame" do cientista. Então todos os puzzles até descobrir os alienígenas estarão aqui.
//as respostas darão pistas sobre o jogo
public class Vr {
        private String[] perguntas = {
            "Nível 1: Em um mundo em constante mudança, onde a própria existência é ameaçada, qual o maior valor a ser preservado?",
            "Nível 2: Em um encontro com uma civilização desconhecida, o que define a natureza de um contato: a Compreensão ou o Medo?",
            "Nível 3: O que é invisível, mas pode ser sentido?",
            "Nível 4: \"Em um sistema com leis e regras diferentes, como você definiria o que é certo e o que é errado?",
            "Nível 5: O conhecimento é poder ou responsabilidade??"
        };
        private String[] respostas = {"Vida", "Medo", "Gravidade", "Moral", "Ambos"};
        private String[] descobertas = {
            "Puzzle 1 resolvido: Esse visor parece ser tecnológico demais para os seres humanos, talvez ele seja de outro lugar.",
            "Puzzle 2 resolvido: Essas Perguntas... Estão testando meu conhecimento, ou querendo saber sobre essa galáxia?",
            "Puzzle 3 resolvido: Ainda parece só que estão zombando com minha inteligência. Mas... Será?",
            "Puzzle 4 resolvido: Os sinais indicam uma origem extraterrestre. Algo está vindo para a Terra nesse exato momento.",
            "Puzzle 5 resolvido: 'San-Ti', é o que esse visor está me dizendo. O que são esses 'San-Ti'? E por que estão vindo para cá?"
        };
    
        public void jogarPuzzles() {
            Scanner scanner = new Scanner(System.in);
    //esse contador está sendo usado para iterar as respostas do jogador/usuário. Então ele funciona assim:
    // o "i" significa que o contador está em 0, e ele vai somando um puzzle nele mesmo sempre que esse for respondido corretamente, até chegar na quantidade de puzzles.
            for (int i = 0; i < perguntas.length; i++) {
                System.out.println(perguntas[i]); //ele vai exibir qual o puzzle atual
                String resposta = scanner.nextLine().trim();//trim para apagar possíveis espaços em branco no input
                if (resposta.equalsIgnoreCase(respostas[i])) {
                    System.out.println(descobertas[i]); //se o jogador acertar: ele descobrirá que... Não é só um videogame, etc...
                } else {
                    System.out.println("Resposta incorreta. Tente novamente.");
                    System.out.println("Você digitou: " + resposta);
                    i--; //para tentar o mesmo puzzle novamente até o usuário acertar
                }
            }
            System.out.println("Você resolveu todos os puzzles. Descobriu sobre os San-Ti. Vá em frente!");
            
            
        }
        
} 
