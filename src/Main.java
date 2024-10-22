//import java.security.Permissions;
import java.util.InputMismatchException;
import classes.Cientista;
import classes.Governante;
import classes.Militar;
import classes.Personagem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
       //antes de começar, o jogador deve conhecer a lore por trás do jogo.
       try{
       System.out.println("Estamos em 2024, e misteriosamente, os cientistas mais famosos do mundo todo estão se suicidando.\n");
        Thread.sleep(4000); //delay de 5s para dar mais tempo ao usuário de ler e parecer que é uma mensagem digitada em tempo real
        System.out.println("Certo dia, as estrelas que haviam no céu simplesmente sumiram por minutos, e quando voltaram, estavam piscando.\n");
        Thread.sleep(4000);
        System.out.println("Alguns cientistas que ainda estão vivos, estão recebendo um artefato misterioso conhecimo como 'visor', cuja tecnologia é avançada demais para o mundo atual.\n");
        Thread.sleep(4000);
        System.out.println("Ao usar esse visor, ele simula uma realidade virtual, fazendo com que esses cientistas resolvam desafios e puzzles.\n");
        Thread.sleep(4000);
        System.out.println("Parece ser somente um joguinho bobo com uma nova tecnologia de videogames por aí, mas é algo literalmente de outro mundo.\n");
        Thread.sleep(4000);
        System.out.println("Esses cientistas estão sendo usados pelos San-Ti, uma civilização alienígena trissolar, que descobriu nosso planeta e está vindo para cá rápido.\n");
        Thread.sleep(4000);
        System.out.println("Estão vindo para poderem habitar um planeta que hão possui instabilidades. No planeta natal deles, é impossível prever seu comportamento orbital, os levando sempre a catátrofes planetárias.\n");
        Thread.sleep(5000);
        System.out.println("Esse fenômeno é conhecido como 'O Problema dos Três Corpos'.\n");
        Thread.sleep(4000);
        System.out.println("Você terá 750 anos para se preparar até eles chegarem, ouviu bem?? Faça suas escolhas muito sabiamente e a Terra agradecerá!\n");
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        //exceção para tratar o thread.sleep()
        System.out.println("Ocorreu uma interrupção durante o delay, desculpe.");
        e.printStackTrace(); //exibe o rastreamento da pilha do erro
    }
        //vamos pedir o nome que o usuário quer e a idade
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        if (idade < 18 || idade > 80) {//colocando uma idade que não seja impossível
            System.err.println("Desculpe, mas você não tem idade para participar ativamente dessa história. Recomeçe.");
            System.exit(idade);
        }
        //escolha do usuário para a sua classe na história
        Personagem personagem = null;
        boolean classeValida = false;

        while (!classeValida) {
            try{
                System.out.println("Escolha seu personagem: 1- Cientista, 2- Governante, 3- Militar\n");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                personagem = new Cientista(nome, idade);
                System.out.println("Personagem definido. Você será um Cientista!");
                classeValida = true;
                break;
            case 2:
                personagem = new Governante(nome, idade);
                System.out.println("Personagem definido. Você será um Governante!");
                classeValida = true;
                break;
            case 3:
                personagem = new Militar(nome, idade);
                System.out.println("Personagem definido. Você será um Militar!");
                classeValida = true;
                break;
            default:
                System.out.println("Escolha inválida!");
                return;
        } } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Por favor, digite um número (1, 2 ou 3).");
            scanner.nextLine(); //vai limpar scanner para evitar loop infinito no jogo
        } finally{
            if (personagem != null) {
                System.out.println();
                personagem.exibirInfo();
                personagem.acao();
            }
        }
    } 

    }
}

