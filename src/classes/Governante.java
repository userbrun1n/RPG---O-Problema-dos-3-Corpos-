package classes;
import java.util.Scanner;

import interfaces.Lideranca;

public class Governante extends Personagem implements Lideranca{
    private int credibilidade;
    private int seguranca;
    private int recursos;
    String decisao;

    Scanner scanner = new Scanner(System.in);

    public Governante(String nome, int idade) {
        super(nome, idade);
        this.credibilidade = 50; //credibilidade inicial (média, pois se trata de um governante já eleito)
        this.seguranca = 50;
        this.recursos = 60;
    }

    public int getCredibilidade() {
        return credibilidade;
    }

    public void aumentarCredibilidade(int valorXp) {
        credibilidade += valorXp;
        System.out.println("Parabéns! Sua Credibilidade foi aumentada em " + valorXp + " pontos. Credibilidade atual: " + credibilidade + "\n");
    }

    public void diminuirCredibilidade(int valorXp) {
        credibilidade -= valorXp;
        System.out.println("Tome cuidado! Sua credibilidade foi diminuída em " + valorXp + " pontos. Credibilidade atual: " + credibilidade + "\n");
    }

    public int getRecursos() {
        return recursos;
    }

    public void aumentarRecursos(int valorXp) {
        recursos += valorXp;
        System.out.println("Parabéns! Você aumentou seus recursos em " + valorXp + " pontos. Valor dos recursos atuais: " + recursos + "\n");
    }

    public void diminuirRecursos(int valorXp) {
        recursos -= valorXp;
        System.out.println("Tome cuidado, você perdeu alguns recursos! Eles foram diminuídos em " + valorXp + " pontos. Valor dos recursos atuais: " + recursos + "\n");
    }

    public int getSeguranca() {
        return seguranca;
    }

    public void aumentarSeguranca(int valorXp) {
        seguranca += valorXp;
        System.out.println("Parabéns! Você aumentou a segurança do seu país em " + valorXp + " pontos. Valor da segurança atual: " + seguranca + "\n");
    }

    public void diminuirSeguranca(int valorXp) {
        seguranca -= valorXp;
        System.out.println("Tome cuidado! Você diminuiu a segurança do seu país em " + valorXp + " pontos. Valor da segurança atual: " + seguranca + "\n");
    }

    public void acao() {
        try{
        System.out.println(getNome() + " acabou de tomar posse de governo de uma potência mundial européia...");
        Thread.sleep(2000);
        System.out.println("Porém, o que pareceria ser um governo comum, se mostraria uma verdadeira prova de liderança.");
        Thread.sleep(4000);
        System.out.println("A onda de suicídios de cientistas está sendo um grande mistério. Até que um pesquisador renomado pede uma reunião com os representantes do seu governo.");
        Thread.sleep(3000);
        System.out.println("Nessa reunião, o pesquisador explica que, usando um visor que se assemelha a um videogame, ele descobriu que existe uma raça alienígena conhecida como 'San-Ti', e que, em 750 anos, chegará à Terra.");
        Thread.sleep(2000);
        System.out.println("Ele diz também que a causa desses suicídios é justamente essa descoberta, que fez com que muitos cientistas perdessem seu propósito e tirassem a própria vida.");
        Thread.sleep(2000);

        do {
            System.out.println("Você acredita nas afirmações desse pesquisador? (s/n)");
            decisao = scanner.next();
            scanner.nextLine(); 
            if (decisao.equalsIgnoreCase("s")) {
                System.out.println("Que bom, porque nossos observatórios mostram que realmente existem corpos desconhecidos viajando a uma velocidade alta demais para tão pouco tamanho. \n");
                aumentarCredibilidade(10);
                aumentarSeguranca(10);
                tomarDecisoes();
            } else if (decisao.equalsIgnoreCase("n")) {
                System.out.println("Você decidiu dizer a todos que essas declarações são mentira.");
                diminuirCredibilidade(50);
                System.out.println("Pode ser loucura, mas nossos observatórios mostram que realmente existem corpos desconhecidos viajando a uma velocidade alta demais para tão pouco tamanho. Desacreditar sem procurar entender pode atrasar nossos possíveis planos de defesa.");
                Thread.sleep(4000);
                System.out.println("Em meio a uma sociedade que agora está em pânico com as descobertas, você preferiu não acreditar nelas.");
                Thread.sleep(2000);
                System.out.println("As fake news agora têm você como alvo, fruto da paranoia que se instaurou ao redor do planeta.");
                Thread.sleep(2000);
                System.out.println("Elas dizem que você é um deles e que está acobertando a chegada dos alienígenas por algum motivo.");
                Thread.sleep(2000);
                System.out.println("Você é deposto do cargo e preso, sem comunicação alguma com o mundo exterior. Para sempre.");
                Thread.sleep(2000);
                System.out.println("Nunca saberá o que aconteceu nos anos que seguiram. Se a humanidade venceu, ou se foi derrotada. Sua vida terminou assim apenas por uma crise de pânico que você poderia ter evitada.");
                Thread.sleep(3000);
                System.out.println("FIM DE JOGO!");
                System.exit(0);
                
            } else {
                System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
            }
        } while (!decisao.equalsIgnoreCase("s") && !decisao.equalsIgnoreCase("n"));
        
    } catch (InterruptedException e) {//trata as exceções dos delays colocados
        //exceção para tratar o thread.sleep()
        System.out.println("Ocorreu uma interrupção durante o delay, desculpe.");
        e.printStackTrace(); //exibe o rastreamento da pilha do erro
    }
}

public void tomarDecisoes() {
        
        try{
        do {
            Thread.sleep(3000);
            System.out.println("Passado alguns meses, as teorias do pesquisador foram confirmadas: há uma raça alienígena rumo ao planeta Terra, com previsão de chegada em 2774.");
            Thread.sleep(2000);
            System.out.println("Os representantes de quase todos os países estão se reunindo na ONU para discutir sobre planos de contenção.");
            Thread.sleep(1000);
            System.out.println(" Cabe a você, como governante de uma das potências mundiais, fornecer estratégias, formar alianças e monitorar fundos para que a humanidade possa vencer no futuro.");
            Thread.sleep(2000);
            System.out.println("Estão discutindo possíveis planos na ONU...");
            Thread.sleep(2000);

            System.out.println("Pensando em recursos naturais, você gostaria de apoiar o plano da União Européia em relação à extração desses recuros de países subdesenvolvidos para criação de armas? (s/n)");
            decisao = scanner.next();
            scanner.nextLine(); 
            if (decisao.equalsIgnoreCase("n")) {
                System.out.println("Esses recuros podem vir a ser importantes, mas parece que esse plano possui outras intenções... \n");
                aumentarCredibilidade(10);
                diminuirRecursos(10);
            } else if (decisao.equalsIgnoreCase("s")) {
                System.out.println("Pense que será um processo de neocolonialismo e que não será visto com bons olhos por países dos outros continentes. \n");
                diminuirCredibilidade(10);
                aumentarRecursos(10);
                diminuirSeguranca(10);
            } else {
                System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
            }
        } while (!decisao.equalsIgnoreCase("s") && !decisao.equalsIgnoreCase("n"));

        do {
            System.out.println("Países do ocidente quererem formar uma aliança econômica e militar e não compartilhar recursos com as nações orientais. Você quer se juntar à essa organização? (s/n)");
            decisao = scanner.next();
            scanner.nextLine(); 
            if (decisao.equalsIgnoreCase("n")) {
                System.out.println("Você tem razão. Embora essa aliança assegure as nações nela inseridas, excluir os outros países pode vir a agravar ainda mais a situação. \n");
                aumentarCredibilidade(10);
                diminuirRecursos(10);
                aumentarSeguranca(10);
            } else if (decisao.equalsIgnoreCase("s")) {
                System.out.println("Você adquiriu muitos recursos que serão divididos entre os países do acordo. Mas talvez as nações que ficaram de fora se sintam ameaçadas. \n");
                diminuirCredibilidade(10);
                aumentarRecursos(10);
                diminuirSeguranca(10);
            } else {
                System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
            }
        } while (!decisao.equalsIgnoreCase("s") && !decisao.equalsIgnoreCase("n"));
        
        do {
            System.out.println("Pensando em recursos naturais, você gostaria de apoiar o plano da União Européia em relação à extração desses recuros de países subdesenvolvidos para criação de armas? (s/n)");
            decisao = scanner.next();
            scanner.nextLine(); 
            if (decisao.equalsIgnoreCase("n")) {
                System.out.println("Esses recuros podem vir a ser importantes, mas parece que esse plano possui outras intenções...");
                aumentarCredibilidade(10);
            } else if (decisao.equalsIgnoreCase("s")) {
                System.out.println("Pense que será um processo de neocolonialismo e que não será visto com bons olhos por países dos outros continentes.");
                diminuirCredibilidade(10);
            } else {
                System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
            }
        } while (!decisao.equalsIgnoreCase("s") && !decisao.equalsIgnoreCase("n"));
        do {
            System.out.println("Pensando em recursos naturais, você gostaria de apoiar o plano da União Européia em relação à extração desses recuros de países subdesenvolvidos para criação de armas? (s/n)");
            decisao = scanner.next();
            scanner.nextLine(); 
            if (decisao.equalsIgnoreCase("n")) {
                System.out.println("Esses recuros podem vir a ser importantes, mas parece que esse plano possui outras intenções...");
                aumentarCredibilidade(10);
            } else if (decisao.equalsIgnoreCase("s")) {
                System.out.println("Pense que será um processo de neocolonialismo e que não será visto com bons olhos por países dos outros continentes.");
                diminuirCredibilidade(10);
            } else {
                System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
            }
        } while (!decisao.equalsIgnoreCase("s") && !decisao.equalsIgnoreCase("n"));

        // Outras decisões podem ser implementadas aqui...

        // Após todas as decisões
        if (credibilidade > 80) {
            System.out.println("Você é um líder excepcional. A humanidade confia em você para liderar a defesa contra os San-Ti.");
            // Implementar lógica para liderança bem-sucedida
        } else if (credibilidade < 40) {
            System.out.println("Sua liderança está sendo questionada. Precisamos de um plano melhor para proteger a Terra.");
            // Implementar lógica para liderança falha
        } else {
            System.out.println("Sua liderança é aceitável. Vamos continuar trabalhando para fortalecer nossas defesas.");
            // Implementar lógica para liderança aceitável
        }
    

}  catch (InterruptedException e) {//trata as exceções dos delays colocados
    //exceção para tratar o thread.sleep()
    System.out.println("Ocorreu uma interrupção durante o delay, desculpe.");
    e.printStackTrace(); //exibe o rastreamento da pilha do erro
}
}
}






