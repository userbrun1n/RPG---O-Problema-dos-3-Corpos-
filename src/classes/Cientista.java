package classes;
import java.util.Scanner;


public class Cientista extends Personagem {
    private Vr visor; //privado porque somente o cientista usa o visor
    private int credibilidade;
    private String resposta;
    private String solucao;
   
    
    Scanner scanner = new Scanner(System.in);
    public Cientista(String nome, int idade) {
        super(nome, idade);
        this.visor = new Vr();
        this.credibilidade = 50; //credibilidade inicial (média, pois se trata de um cientista da área de pesquisa já importante)
    }
    public int getCredibilidade() {
        return credibilidade;
    }

    public void aumentarCredibilidade(int valorXp) {
        credibilidade += valorXp;
        System.out.println("Parabéns! Sua Credibilidade foi aumentada em " + valorXp + " pontos. Credibilidade atual: " + credibilidade);
    }

    public void diminuirCredibilidade(int valorXp) {
        credibilidade -= valorXp;
        System.out.println("Tome cuidado! Sua credibilidade foi diminuída em " + valorXp + " pontos. Credibilidade atual: " + credibilidade);
    }
    
    public void acao() {
        try{
        System.out.println("Ano Solar 2024... " + getNome() + " está pesquisando sobre os suicídios que estão acontecendo.");
        Thread.sleep(2000);
        System.out.println("Aparentemente, todos os cientistas que foram encontrados possuíam um arefato que lembra muito um visor 'VR' de videogame.");
        Thread.sleep(2000);
        System.out.println("'Parece que também recebi um. Nunca vi esse visor aqui em casa antes. O que ele faz? Parece um videogame de realidade aumentada.'");
        do {
            System.out.println("Gostaria de usar o visor mesmo sabendo que é um objeto muito estranho? (s/n)");
            resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                System.out.println("É justo, mas a curiosidade é o combustível dos cientistas, então não há como não querer saber o que há nele.");
            }
        } while (!resposta.equalsIgnoreCase("s"));
        System.out.println("Ligando o visor ao seu cérebro... Conectando...");
        Thread.sleep(2000);
        System.out.println("'Uau, é tudo tão real aqui. Mas que tipo de tecnologia é essa?'");
        Thread.sleep(2000);
        System.out.println("Interface pede para que você jogue os puzzles.");
        System.out.println("JOGUE OS PUZZLES!");
        //esse do... while força o jogador a jogar os puzzles para a história continuar
        do {
            System.out.println("Gostaria de jogar os puzzles do visor? (s/n)");
            resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                System.out.println("Uma pena. Pensávamos que você fosse mais esperto. Mas insistiremos: JOGUE OS PUZZLES!");
            }
        } while (!resposta.equalsIgnoreCase("s"));
        System.out.println("Obrigado por jogar. Não se preocupe com possíveis acentuações.");
        visor.jogarPuzzles();
         
        //aqui o jogador vai decidir o que fazer com essas descobertas
        int decisao;
        do {//obrigando o jogador a escolher uma opção válida, igual das outas vezes
            System.out.println("Você descobriu informações sobre uma civilização alienígena que tem como destino a Terra, os San-Ti. O que quer fazer com essas informações? (1- Divulgar, 2- Omitir)");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, digite 1 para Divulgar ou 2 para Omitir.");
                scanner.next();
            }
            decisao = scanner.nextInt();
            scanner.nextLine(); 
            if (decisao != 1 && decisao != 2) {
                System.out.println("Escolha inválida. Por favor, escolha (1- Divulgar, 2- Omitir).");
            }
        } while (decisao != 1 && decisao != 2);
        
        if (decisao == 1) {
            System.out.println("Você decidiu divulgar as informações. Os governantes serão informados e esperamos que eles não achem que você enlouqueceu.");
            aumentarCredibilidade(10);
            responderPerguntasGovernantes(scanner);
            //aqui as ações do cientista vão ser basicamente de aconselhamento. Ou seja, enquanto os governantes vão montando planos...
            //... cabe ao jogador, interpretando o cientista, aconselhar sobre a possibiidade dessas ações.
        } else {
            System.out.println("Você decidiu omitir as informações.");
            diminuirCredibilidade(50);
            Thread.sleep(2000);
            System.out.println("Se existir um Deus, rezemos para que tenham piedade de nós quando chegarem...");
            //salta para 2774 e encerra o jogo
            Thread.sleep(5000);
            System.out.println("Ano 2774: Eles chegaram... Os San-Ti chegaram...");
            Thread.sleep(4000);
            System.out.println("Não duramos muito. Descobrimos que estão aqui há muito tempo nos observando com seus Sophons... Sabiam tudo de nós. TUDO.");
            Thread.sleep(4000);
            System.out.println("A Terra foi colonizada pelos San-Ti, e uma raça inteira foi dizimada por sua culpa. Que o grito dos inocentes ecoe em sua cabeça por toda a eternidade.");
            System.out.println("FIM DE JOGO!");
            System.exit(0); 
        } } catch (InterruptedException e) {//trata as exceções dos delays colocados
        //exceção para tratar o thread.sleep()
        System.out.println("Ocorreu uma interrupção durante o delay, desculpe.");
        e.printStackTrace(); //exibe o rastreamento da pilha do erro
    }

}
   
private void responderPerguntasGovernantes(Scanner scanner) {
    
    try{
    System.out.println("Agora que você decidiu divulgar suas descobertas, os governantes das potências mundiais estão se reunindo na ONU...");
    Thread.sleep(2000);
    System.out.println("Eles vão criar possíveis planos de contenção que têm como objetivo descobrir a localização dos San-Ti no espaço e neutralizá-los o mais rápido possível, mesmo com a previsão de chegada deles sendo somente em 2774.");
    Thread.sleep(4000);
    System.out.println("Caberá a você fornecer recomendações sobre a viabilidade dos planos.");
    Thread.sleep(2000);
    System.out.println("Mas esteja ciente da consequências das suas respostas...");
    Thread.sleep(2000);
    System.out.println("Se caso responder errado, suas ações podem atrasar os planos de contenção, atrapalhando os planos da humanidade contra os Sant-Ti.");
    Thread.sleep(2000);
    System.out.println("Criaram um primeiro plano de de segurança humanitária. Vão te perguntar sobre as possibilidades de sucesso dele agora.");
    Thread.sleep(4000);
    //essas perguntas funcionam como uma espécie de supervisão da ciência para garantir que os recursos não serão gastos de maneira imprudente, o que tentará assegurar um futuro para a humanidade.
    System.out.println("Os governantes estão te fazendo perguntas científicas para formular estratégias.");

    do {
        System.out.println("Pergunta: É possível criar um dispositivo que viaje à velocidade da luz? (s/n)");
        solucao = scanner.next();
        scanner.nextLine();
        if (solucao.equalsIgnoreCase("n")) {
            System.out.println("Resposta correta! A viagem à velocidade da luz não é possível com a tecnologia atual.");
            aumentarCredibilidade(10);
        } else if (solucao.equalsIgnoreCase("s")) {
            System.out.println("Como um cientista pode nao saber que viagens à velocidade da luz não são possíveis com a tecnologia atual?");
            diminuirCredibilidade(10);
            System.out.println("Governantes: 'Isso pode nos custar muito tempo. Vamos reavaliar nossas opções'.");
        } else {
            System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
        }
    } while (!solucao.equalsIgnoreCase("s") && !solucao.equalsIgnoreCase("n"));

    
    do {
        System.out.println("É possível, com nossas tecnologias atuais, enviar uma 'sonda' resposta com uma velocidade muito grande, utilizando bombas atômicas como impulso no espaço? (s/n)");
        solucao = scanner.next();
        scanner.nextLine(); 
        if (solucao.equalsIgnoreCase("s")) {
            System.out.println("Então usaremos essas bombas atômicas como impulso.");
            aumentarCredibilidade(10);
        } else if (solucao.equalsIgnoreCase("n")) {
            System.out.println("Parece que alguém aqui não sabe o que realmente pode ser feito. Sim, é possível usar bombas atômicas como impulso.");
            diminuirCredibilidade(10);
        } else {
            System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
        }
    } while (!solucao.equalsIgnoreCase("s") && !solucao.equalsIgnoreCase("n"));

    do {
        System.out.println("Conseguiremos colonizar Marte antes de 2774 para poder ter duas frentes de batalha caso seja necessário? (s/n)");
        solucao = scanner.next();
        scanner.nextLine(); // Limpa o buffer do scanner
        if (solucao.equalsIgnoreCase("n")) {
            System.out.println("Não conseguiremos colonizar Marte a tempo. Seria preciso Terraformar ela primeiro.");
            aumentarCredibilidade(10);
        } else if (solucao.equalsIgnoreCase("s")) {
            System.out.println("Você deveria saber muito bem que não conseguiremos colonizar Marte a tempo antes de terraformá-la.");
            diminuirCredibilidade(10);
        } else {
            System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
        }
    } while (!solucao.equalsIgnoreCase("s") && !solucao.equalsIgnoreCase("n"));

    do {
        System.out.println("A melhor maneira de nos prepararmos para a chegada deles é esperando pacificamente, sem planos de resposta a um possível ataque? (s/n)");
        solucao = scanner.next();
        scanner.nextLine(); // Limpa o buffer do scanner
        if (solucao.equalsIgnoreCase("n")) {
            System.out.println("Com certeza precisamos ter planos de resposta. Temos que levar a teoria da Floresta Negra em consideração");
            aumentarCredibilidade(10);
        } else if (solucao.equalsIgnoreCase("s")) {
            System.out.println("Mas é óbvio que precisamos ter planos de resposta.");
            diminuirCredibilidade(10);
        } else {
            System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
        }
    } while (!solucao.equalsIgnoreCase("s") && !solucao.equalsIgnoreCase("n"));

    do {
        System.out.println("Você acredita que as leis da física são aplicáveis a todo o universo? (s/n)");
        solucao = scanner.next();
        scanner.nextLine(); // Limpa o buffer do scanner
        if (solucao.equalsIgnoreCase("s")) {
            System.out.println("Até que se prove o contrário, as leis da física são aplicáveis a todo o universo.");
            // Esta pergunta não altera a credibilidade
        } else if (solucao.equalsIgnoreCase("n")) {
            System.out.println("As leis da física são aplicáveis a todo o universo, ao menos até onde a humanidade conhece.");
            // Esta pergunta não altera a credibilidade
        } else {
            System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
        }
    } while (!solucao.equalsIgnoreCase("s") && !solucao.equalsIgnoreCase("n"));

    //essa peergunta é consequência da pergunta anterior
    do {
        System.out.println("Então se enviarmos qualquer sonda ou ogiva que os intercepte, as propriedades físicas serão diferentes para eles? Se forem diferentes, talvez seja um plano inútil. (s/n)");
        solucao = scanner.next();
        scanner.nextLine(); // Limpa o buffer do scanner
        if (solucao.equalsIgnoreCase("n")) {
            System.out.println("É improvável mesmo que sejam diferentes");
            aumentarCredibilidade(10);
        } else if (solucao.equalsIgnoreCase("s")) {
            System.out.println("É improvável que sejam diferentes. Mas se forem, estaremos em uma situação complicada.");
            diminuirCredibilidade(10);
        } else {
            System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
        }
    } while (!solucao.equalsIgnoreCase("s") && !solucao.equalsIgnoreCase("n"));

    //aqui tem um ponto em que, dependendo da credibilidade do jogador, cada escolha pode dar em um final diferente.
    if (credibilidade >= 80) {
        do {
            System.out.println("Você é indispensável para a humanidade. Gostaria de se submeter à criogenia para estar vivo quando eles chegarem? (s/n)");
            solucao = scanner.next();
            scanner.nextLine();

            if (solucao.equalsIgnoreCase("s")) {
                System.out.println("Você aceitou se submeter à criogenia. Bom descanso... Pulando para o ano 2774...");
                Thread.sleep(2000);
                System.out.println("'Você acordou, que bom! Hoje é dia 18 de novembro, e eles chegaram. Chegaram hoje!'");
                Thread.sleep(2000);
                System.out.println("'Bom, você deve saber que, suas escolhas nos ajudaram muito e conseguimos interceptar muitas naves deles ao decorrer de todos esses anos. Então estão em menor número hoje.'");
                Thread.sleep(3000);
                System.out.println("'Vamos atacar, mas temos duas opções: armar um campo de proteção na atmosfera que explode qualquer objeto estranho que tente entrar na Terra (1) ou emitir ondas de radiação que mirem as naves e atingem os San-Ti (2).'");
                Thread.sleep(2000);
                do {
                    System.out.println("Qual opção você escolhe? (1 ou 2)");
                    solucao = scanner.next();
                    scanner.nextLine(); 
                    if (solucao.equalsIgnoreCase("1")) {
                        System.out.println("Os San-Ti não tiveram chance.");
                        Thread.sleep(1000);
                        System.out.println("Suas naves explodiram assim que tocaram com a nossa atmosfera.");
                        Thread.sleep(1000);
                        System.out.println("As naves que restaram, foram embora do nosso Sistema Solar.");
                        Thread.sleep(1000);
                        System.out.println("A humanidade vence a sua primeira batalha intergalática, e você foi fundamental.");
                        Thread.sleep(2000);
                        System.out.println("Parabéns, você é um dos maiores humanos, e talvez um dos maiores seres que já foi abençoado com a dávida da vida!");
                        System.out.println("FIM DE JOGO!");
                        System.exit(0);
                    } else if (solucao.equalsIgnoreCase("2")) {
                        System.out.println("Você escolheu emitir radiação por todo o globo? Tudo bem que os efeitos não serão tão instensos para nós como será para eles.");
                        Thread.sleep(1000);
                        System.out.println("Mas, mesmo assim... Alguns humanos foram prejudicados por essa radiação.");
                        Thread.sleep(1500);
                        System.out.println("Tudo bem. Vencemos. Isso é o que mais importa.");
                        Thread.sleep(2000);
                        System.out.println("Essa radiação matou muitos deles, e os que sobreviveram conseguiram fugir para fora do nosso Sistema Solar, mas provavelmente também morrerão pelos sintomas dessa radiação.");
                        System.out.println("A humanidade vence a sua primeira batalha intergalática, e você foi fundamental.");
                        Thread.sleep(2000);
                        System.out.println("Parabéns, você é um dos maiores humanos que já existiu!");
                        System.out.println("FIM DE JOGO!");
                        System.exit(0);
                       
                    } else {
                        System.out.println("Resposta inválida. Por favor, escolha uma das opções válidas (1 ou 2).");
                    }
                } while (!solucao.equalsIgnoreCase("s") && !solucao.equalsIgnoreCase("n"));


            } else if (solucao.equalsIgnoreCase("n")) {
                System.out.println("Governantes: Agradecemos sua contribuição. Esperamos que nossos planos deem certo.");
                Thread.sleep(2000);
                System.out.println("'Você escolheu a não criogenia, e com isso não estará lá quando os San-Ti chegarem...'");
                Thread.sleep(2000);
                System.out.println("'Mas tubo bem. Você foi de fundamental ajuda para os planos de contenção da raça humana, e agora terá um descanso merecido. Tenha uma longa e boa...'");
                Thread.sleep(4000);
                System.out.println("'18 de novembro de 2774: Eles chegaram à Terra!'");
                Thread.sleep(2000);
                System.out.println("'Mas, estávamos muito à frente deles. Nossa tecnologia evoluiu muito enquanto eles dormiam, vagando pelo espaço.'");
                Thread.sleep(2000);
                System.out.println("'Nessa luta, a Terra armou uma grande redoma eletromagnética em volta da terra que explodia qualquer corpo estranho ao tocá-la. As poucas naves que restaram se viraram e foram embora de nosso Sistema Solar.'");
                Thread.sleep(2000);
                System.out.println("A humanidade vence a sua primeira batalha intergalática, e você foi fundamental.");
                Thread.sleep(2000);
                System.out.println("Parabéns, você é um dos maiores humanos que já existiu!");
                System.out.println("FIM DE JOGO!");
                System.exit(0);

            } else {
                System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
            }
        } while (!solucao.equalsIgnoreCase("s") && !solucao.equalsIgnoreCase("n"));
    } else if (credibilidade < 40) {
        System.out.println("Governantes: Agradecemos sua ajuda, mas não podemos confiar em seu julgamento.");
            Thread.sleep(2000);
            System.out.println("Se existir um Deus, rezemos para que tenham piedade de nós quando chegarem...");
            //salta para 2774 e encerra o jogo
            Thread.sleep(5000);
            System.out.println("Ano 2774: Eles chegaram... Os San-Ti chegaram...");
            Thread.sleep(4000);
            System.out.println("Não duramos muito. Descobrimos que estão aqui há muito tempo nos observando com seus Sophons... Sabiam tudo de nós. TUDO.");
            Thread.sleep(4000);
            System.out.println("A Terra foi colonizada pelos San-Ti, e uma raça inteira foi dizimada por sua culpa. Que o grito dos inocentes ecoe em sua cabeça por toda a eternidade.");
            System.out.println("FIM DE JOGO!");
            System.exit(0); 
    } else {
        System.out.println("Governantes: Agradecemos sua contribuição. Esperamos que nossos planos deem certo.");
        Thread.sleep(2000);
        System.out.println("'2774, ano da chegada dos San-Ti à Terra.'");
            Thread.sleep(2000);
            System.out.println("Nós não avançamos tanto em nossa tecnologia como estávamos esperando...");
            Thread.sleep(2000);
            System.out.println("Mas não quer dizer que iremos nos render!");
            Thread.sleep(2000);
            System.out.println("Descobrimos que estão aqui há muito tempo nos observando com seus Sophons... Sabiam tudo de nós. TUDO.");
            Thread.sleep(2000);
            System.out.println("As lutas foram muito duras contra eles. Eram muitos...");
            Thread.sleep(2000);
            System.out.println("Perdemos grandes territórios e um terço da humanidade foi perdida nessa guerra, que durou 3 longos anos...");
            Thread.sleep(2000);
            System.out.println("Sobrevivemos por nosso instinto de sobreviver. A Terra conseguiu expulsar os extraterrestres daqui, após muitos sacrifícios.");
            Thread.sleep(2000);
            System.out.println("Toda essa guerra poderia ter sido evitada, se tivéssemos evoluído o bastante com nossa ciência e tecnologia.");
            Thread.sleep(2000);
            System.out.println("A humanidade vence a sua primeira batalha intergalática, mas acho que ela não estará preparada para outra tão cedo...");
            Thread.sleep(1000);
            System.out.println("FIM DE JOGO!");
            System.exit(0); 
    }
}  catch (InterruptedException e) {
    //exceção para tratar o thread.sleep()
    System.out.println("Ocorreu uma interrupção durante o delay, desculpe.");
    e.printStackTrace(); //exibe o rastreamento da pilha do erro
    }
    scanner.close();
 }
}
        
    


    