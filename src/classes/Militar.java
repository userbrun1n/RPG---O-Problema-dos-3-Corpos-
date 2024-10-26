package classes;

import java.util.Scanner;
import interfaces.Combate;

public class Militar extends Personagem implements Combate{//aqui temos a aplicação de HERANÇA e INTERFACE
    //Herança, pq o militar herda as características da classe PERSONAGEM.
    //Interface, pq o "contrato" da interface 'Combate' é impelemntado dentro da classe.

    private int vida; //Os atributos presentes aqui e em todas as outras classes são aplicados através do ENCAPSULAMENTO,
    private int vidaSan;//Onde os atributos só podem ser acessados dentro da mesma classe.
    private int prestigio;
    private int dano;
    String decisao;

    Scanner scanner = new Scanner(System.in);

    public Militar(String nome, int idade) {
        super(nome, idade);
        this.vida = 100;
        this.vidaSan = 100; 
        this.dano = 20;
        this.prestigio = 50;
    }

    public int getVida() {
        return vida;
    }

    public int getVidaSan() {
        return vidaSan;
    }

    public int getDano() {
        return dano;
    }

    public int getPrestigio() {
        return prestigio;
    }

    public void receberDano(int dano) {
        vida -= dano;
        System.out.println("Tome cuidado! Por causa desse ataque, a vida do seu pelotão foi reduzida para: " + vida + " pontos.\n");
    }

    public void aplicarDano(int dano) {
        vidaSan -= dano;
        System.out.println("Vida do exército alienígena foi reduzida para: " + vidaSan + " pontos.\n");
    }

    public void aumentarPrestigio(int valor) {
        prestigio += valor;
        System.out.println("Pela eficácia do plano, seu prestígio foi aumentado em " + valor + " pontos. Prestígio atual: " + prestigio + "\n");
    }

    public void diminuirPrestigio(int valor) {
        prestigio -= valor;
        System.out.println("Seu plano falhou. Seu prestígio foi reduzido em " + valor + " pontos. Prestígio atual: " + prestigio + "\n");
    }

    public void acao() {
        try {
            System.out.println("Quando a humanidade descobriu ser destino de uma raça alienígena, muitos planos de contenção foram criados.");
            Thread.sleep(2000);
            System.out.println("Porém, após uma centena de anos, a humanidade decidiu apostar em uma construção de um super reator de partículas");
            Thread.sleep(3000);
            System.out.println("A construção desse reator levou séculos, mesmo com cientistas do mundo todo trabalhando em conjunto.");
            Thread.sleep(3000);
            System.out.println("Mas, o plano teve êxito. A humanidade agora pode criar micro buracos de minhoca para qualquer canto do universo.");
            Thread.sleep(3000);
            System.out.println("Bases e naves estratégicas foram posicionadas em torno do Sistema Solar, esperando a chegada do povo trissolar...");
            Thread.sleep(4000);
            System.out.println("Estamos em 2774. Os San-Ti chegaram à Terra.");
            Thread.sleep(2000);
            System.out.println(getNome() + " está treinando para os combates que virão.");
            Thread.sleep(3000);
            System.out.println("Você está encarregado de liderar um pelotão em uma das bases. Você pode escolher de onde quer atacar:");

            int escolha;

            Thread.sleep(3000);
            do {
                System.out.println("A base de Vênus (1) tem como objetivo bombardear naves inimigas pela retaguarda.");
                Thread.sleep(3000);
                System.out.println("A base de Saturno (2) tem como objetivo manter a guerra entre naves inimigas ao redor do planeta com um ataque surpresa.");
                Thread.sleep(3000);
                System.out.println("A base de Marte (3) tem como objetivo dar cobertura à Terra em um conflito de abordagem das naves alienígenas.");
                Thread.sleep(3000);
                System.out.println("A base da Terra (4) tem como objetivo manter a guerra no chão, evacuando os civis para áreas seguras e combatendo de frente os San-Ti.");
                Thread.sleep(3000);
                System.out.println("Em qual base deseja oferecer seu coração? (1, 2, 3, 4)");
                Thread.sleep(3000);

                while (!scanner.hasNextInt()) {
                    System.out.println("Entrada inválida. Por favor, escolha uma das bases disponíveis");
                    scanner.next();
                }
                escolha = scanner.nextInt();
                scanner.nextLine(); 
                if (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4) {
                    System.out.println("Escolha inválida. Por favor, escolha uma das bases disponíveis (1, 2, 3, 4).");
                }
            } while (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4);
            
            if (escolha == 1) {
                System.out.println("Você e seu pelotão serão transferidos para Vênus em 3, 2, 1...");
                Thread.sleep(3000);
                System.out.println("Seu esquadrão se posiciona na linha estratégica do ataque, utilizando a atmosfera ácida e densa para esconder suas forças.");
                Thread.sleep(3000);
                System.out.println("Para aguentar a atmosfera do planeta, campos de força foram criados para abrigar os soldados e armamentos. As naves inimigas passaram e estão na zona de iniciação.\n");
                Thread.sleep(3000);

                do {
                    System.out.println("Deseja iniciar um ataque agora para aproveitar o elemento surpresa? (s/n)");
                    decisao = scanner.next();
                    scanner.nextLine();

                    if (decisao.equalsIgnoreCase("s")) {
                        System.out.println("Os canhões de energia miram na retaguarda das naves inimigas e dispara. Embora não se sabe qual o material dessas naves, o laser disparado é capaz de criar crateras em superfícies planetárias.\n");
                        aplicarDano(40);
                        aumentarPrestigio(15);
                        Thread.sleep(5000);
                        System.out.println("Algumas das dezenas de naves se viram e estão vindo em nossa direção. Eles começam a lançar sondas de reconhecimento, mas estamos escondidos na superfície.");
                        Thread.sleep(3000);

                        do {
                            System.out.println("Vamos atacar agora, destruindo essas frotas e dando tempo para a guerra que está chegando à Terra. (s/n)");
                            decisao = scanner.next();
                            scanner.nextLine(); 
                            if (decisao.equalsIgnoreCase("n")) {
                                System.out.println("Eles vieram até a superfície do planeta, mas suas sondas não os encontraram. Se viraram e voltaram rumo à Terra.");
                                Thread.sleep(2000);
                                System.out.println("Não fomos pegos, mas também não abatemos nenhuma frota. O exército na Terra agora ficará sobrecarregado.\n");
                                Thread.sleep(2000);
                                System.out.println("Se não iríamos atacar as naves pela retaguarda, então por quê viemos até aqui? Foi um desperdício de homens, e agora não podemos voltar à Terra imediatamente.\n");
                                diminuirPrestigio(50);
                                Thread.sleep(2000);
                                System.out.println("De Vênus, vimos as naves bombardearem a Terra. Não pudemos fazer nada.");
                                Thread.sleep(2000);
                                System.out.println("O gerador ainda não carregou o suficiente para que voltássemos, mas talvez não mudaria nada.");
                                Thread.sleep(2000);
                                System.out.println("Os exércitos que lutavam na Terra foram derrotados. A humanidade perdeu.");
                                Thread.sleep(4000);
                                System.out.println("Estamos fadados a morrer aqui nesse planeta, engasgados com o erro de não termos agido antes.");
                                Thread.sleep(2000);
                                System.out.println("FIM DE JOGO!");
                                System.exit(0);
                            } else if (decisao.equalsIgnoreCase("s")) {
                                System.out.println("Copiado. Vamos mirar os lasers nas naves próximas...");
                                Thread.sleep(2000);
                                System.out.println("Acertamos!. Elas estão explodindo em cadeia. Ganhamos tempo para a Terra. Nossa missão aqui está completa!");
                                Thread.sleep(1000);
                                aumentarPrestigio(20);
                                aplicarDano(30);
                                Thread.sleep(3000);
                                System.out.println("A Terra deu conta das naves que restaram.");
                                aplicarDano(30);
                                Thread.sleep(3000);
                                System.out.println("Embora não consigamos ir para o planeta agora, daqui vimos os ataques às naves alienígenas.");
                                Thread.sleep(3000);
                                System.out.println("Todas foram destruídas. A humanidade venceu sua primeira batalha intergalática.");
                                Thread.sleep(2000);
                                System.out.println("FIM DE JOGO!");
                                System.exit(0);
                            } else {
                                System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
                            }
                        } while (!decisao.equalsIgnoreCase("s") && !decisao.equalsIgnoreCase("n"));
                    }
                } while (!decisao.equalsIgnoreCase("s") && !decisao.equalsIgnoreCase("n"));
            } else if (escolha == 2) {
                
                System.out.println("Você e seu pelotão serão transferidos para Saturno em 3, 2, 1...");
                Thread.sleep(4000);
                System.out.println("O plano da base de Saturno é uma batalha espacial, baseada em Guerra nas Estrelas, com frotas encurralando naves e acionando ataques em caso de represália..");
                Thread.sleep(3000);
                System.out.println("Percebemos que algumas naves perceberam nosso movimento, e caças foram enviados para reconhecer a ativade em nossa base.");
                Thread.sleep(3000);
                System.out.println("Nossos radares indicam que a frota inimiga é numerosa. Devemos nos preparar para  manter parte da batalha aqui.");
                Thread.sleep(4000);
                System.out.println("Seu esquadrão agora está a postos em seus caças.");
                Thread.sleep(3000);

                do {
                    System.out.println("As naves San Ti estão se aproximando em formação fechada. Deseja iniciar um ataque preventivo de longo alcance? (s/n) \n");
                    String decisao = scanner.next();
                    scanner.nextLine();
    
                if (decisao.equalsIgnoreCase("s")) {
                    System.out.println("O ataque com canhões de plasma foi iniciado, causando danos significativos nas fileiras inimigas e quebrando a formação. Vencemos a primeira batalha!");
                    aplicarDano(15);
                    Thread.sleep(2000);
                    aumentarPrestigio(5);
                    System.out.println("As naves inimigas se dispersam, mas algumas ainda se mantêm em curso. Temos que nos preocupar com inimigos contornando nosso terrirório.");
                } else if (decisao.equalsIgnoreCase("n")) {
                    System.out.println("Copiado, vamos aguardar uma oportunidade melhor para atacar. \n");
                    diminuirPrestigio(5);
                    Thread.sleep(5000);
                    System.out.println("Nnehuma janela de ataque se abriu. Infelizmente, nossa hesitação permitiu que as naves inimigas se aproximassem demais. Agora o embate será muito mais difícil. \n");
                } else {
                    System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
                }
                } while (!decisao.equalsIgnoreCase("s") && !decisao.equalsIgnoreCase("n"));

                Thread.sleep(3000);

                System.out.println("Os inimigos ajustam sua rota e aceleram em direção à nossa frota, abrindo fogo com lasers. \n");
                Thread.sleep(2000);
                receberDano(40);
                System.out.println("De repente, perdemos muitos soldados. Eles não parecem ter vindo até aqui para uma luta demorada. Se vacilarmos, seremos aniquilados...");
                Thread.sleep(3000);

                do {
                    System.out.println("Agora, vamos ativar outro plano. Deseja ativar manobras evasivas e contra-atacar com uma formação de enxame de caças? (s/n)");
                    decisao = scanner.next();
                    scanner.nextLine();
    
                    if (decisao.equalsIgnoreCase("s")) {
                        System.out.println("A frota acionada executa uma série de manobras evasivas, flanqueando os inimigos e disparando rajadas em tudo que se mexesse e não fosse terráqueo. \n");
                        aplicarDano(40);
                        aumentarPrestigio(10);
                        Thread.sleep(2000);
                        System.out.println("Nosso ataque causou a perda de muitos deles, e isso motivou os soldados da frota a continuarem lutando. A formação de caças inimigos, embora eficaz, agora está ruída. É nossa chance de acabar com eles.");
                    } else if (decisao.equalsIgnoreCase("n")) {
                        System.out.println("Então teremos que manter nossa posição e atrair as naves inimigas para mais perto ainda, aproveitando a cobertura dos anéis do planeta, que vão atrapalhar a manobra deles. \n");
                        Thread.sleep(2000);
                        diminuirPrestigio(5);
                        System.out.println("As naves inimigas se aproximam, mas agora precisamos agir rápido se quisermos dar uma chance à Terra.");
                    } else {
                        System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
                    }
                } while (!decisao.equalsIgnoreCase("s") && !decisao.equalsIgnoreCase("n"));

                Thread.sleep(3000);
                System.out.println("As naves inimigas continuam avançando.");
                Thread.sleep(2000);

                do {
                    System.out.println("Há uma brecha para uma ofensiva. O inimigo está com dificuldades de se manter em órbita. Deseja lançar um ataque frontal? (s/n)");
                    decisao = scanner.next();
                    scanner.nextLine();
    
                    if (decisao.equalsIgnoreCase("s")) {
                        System.out.println("Nosso ataque foi brutal. Como temos vantagem no terrirório, a ofensiva destrói as defesas e chances de ataque dos inimigos. A guerra de Saturno está prestes a acabar! \n");
                        aplicarDano(40);
                        aumentarPrestigio(15);
                        Thread.sleep(3000);
                        System.out.println("Se mantivermos nossos ataques, a Terra terá mais mais chances.");
                    } else if (decisao.equalsIgnoreCase("n")) {
                        System.out.println("Nossas frotas, impacientes com a sua espera, ignoraram suas ordens e partiram para cima das naves inimigas, mas elas já estavam perto demais. \n");
                        Thread.sleep(2000);
                        diminuirPrestigio(10);
                        System.out.println("Perdemos muitos soldados devido à dessincronização das naves. Isso poderia ter sido evitado.");
                        receberDano(50);
                    } else {
                        System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
                    }
                } while (!decisao.equalsIgnoreCase("s") && !decisao.equalsIgnoreCase("n"));

                Thread.sleep(3000);
                System.out.println("A batalha de Saturno está em seus atos finais. Perdemos homens, mas também levamos muitos deles.");

                if (vidaSan <= 10) {
                    System.out.println("Conseguimos atrair e neutralizar as frotas alienígenas. Por causa dos nossos esforços, sua estratégia e o sacrifício de muitos homens, a Terra terá uma chance!");
                    aumentarPrestigio(30);
                    System.out.println("Os caças abatidos na Guerra de Saturno fizeram falta para o combate que está acontecendo na Terra.");
                    Thread.sleep(5000);
                    System.out.println("Lá ainda somos muito mais fortes.");
                    Thread.sleep(3000);
                    System.out.println("A base de Vênus também teve êxito em sua missão. Os San-Ti perderam em todas as frentes.");
                    Thread.sleep(3000);
                    System.out.println("Conseguimos destruir a vida San-Ti em poucas horas. Nossas estratégias e estudo ao longo do tempo fizeram efeito.");
                    Thread.sleep(3000);
                    System.out.println("A humanidade vence sua primeira batalha intergalática!");
                    Thread.sleep(3000);
                    System.out.println("FIM DE JOGO!");
                    System.exit(0);

                } else if (vida <= 10) {
                    System.out.println("A base de Saturno foi sobrecarregada, e suas escolhas contribuíram para a derrota da nossa frota. \n");
                    diminuirPrestigio(30);
                    Thread.sleep(3000);
                    System.out.println("Falhamos em nossa missão. As naves inimigas destruíram nossa base planetária.");
                    Thread.sleep(3000);
                    System.out.println("Não suportamos seu ataque, e falhamos com a humanidade. Morremos sem completar nossa missão.");
                    Thread.sleep(3000);
                    System.out.println("Retomando a formação, os caças inimigos chegaram à órbita da Terra horas depois da batalha de Saturno.");
                    Thread.sleep(3000);
                    System.out.println("Infelizmente, as defesas terrestres não suportaram os ataques fortificados.");
                    Thread.sleep(3000);
                    System.out.println("Em pouco tempo, canhões de plasma atingiram a Terra, e mataram todos nela.");
                    Thread.sleep(3000);
                    System.out.println("A humanidade perdeu. De nada adiantou os séculos de preparo, e os milênios de existência.");
                    Thread.sleep(3000);
                    System.out.println("FIM DE JOGO!");
                    System.exit(0);
                
                } 

            } else if (escolha == 3) {

                System.out.println("Você e seu pelotão serão transferidos para Marte em 3, 2, 1...");
                Thread.sleep(4000);
                System.out.println("Sua missão: Servir de apoio 'aéreo' para a Terra durante o conflito com os San-Ti.");
                Thread.sleep(3000);
                System.out.println("Enquanto sua frota espera, criaremos estratégias de combate...");
                Thread.sleep(6000);
            
                System.out.println("Espera. Eles apareceram do nada. Uma hora não estavam lá, e agora estão. Precisamos agir rápido.");
                Thread.sleep(3000);
            
                do {
                    System.out.println("Deseja iniciar um ataque preventivo contra a primeira onda de naves alienígenas? (s/n)");
                    decisao = scanner.next();
                    scanner.nextLine();
            
                    if (decisao.equalsIgnoreCase("s")) {
                        System.out.println("O disparo dos canhões de plasma criou uma chuva vermelha de lasers em direção às naves inimigas, atingindo várias delas e as desintegrando... \n");
                        aplicarDano(30);
                        aumentarPrestigio(10);
                        Thread.sleep(3000);
                        System.out.println("Nosso ataque surtiu o efeito esperado, mas parece que se dividiram, e uma frota inimiga está se aproximando.");
                        Thread.sleep(3000);
                        System.out.println("É possível criarmos uma distração e ataque, dividindo ainda mais as frotas San-Ti e ganhando tempo para a Terra. Mas, teremos que sacrificar nossas vidas para isso.");
                        Thread.sleep(4000);
                        System.out.println("O plano de distração e ataque consiste em deixar que se aproximem o mais perto possível de nós, ganhando tempo, e emitindo uma rajada à laser forte o suficiente para derrubar essas naves na superfície.");
                        Thread.sleep(4000);
                        System.out.println("Isso causaria uma gigantesca explosão em pelo menos um terço do planeta, e nós estaríamos bem no meio disso.");
                        Thread.sleep(3000);
                        System.out.println("Nosso sacrifício romperia a formação inimiga e os desfalcaria para a batalha que acontece na Terra.");
                        Thread.sleep(4000);
            
                        System.out.println("Deseja acionar o plano de distração e ataque? (s/n)");
                        decisao = scanner.nextLine();
            
                        if (decisao.equalsIgnoreCase("s")) {
                            System.out.println("Acionamos o plano. As naves atingidas não demoraram para cair no solo. \n");
                            Thread.sleep(3000);
                            aplicarDano(50);
                            System.out.println("OS destroços nos atingiram em cheio. Mas levamos muitos conosco.");
                            Thread.sleep(3000);
                            System.out.println("As naves que estão na Terra agora se encontram em desvantagem, e os soldados estão ganhando.");
                            Thread.sleep(3000);
                            System.out.println("Não pudermos ver, mas em pouco tempo, as frotas inimigas foram derrotadas, surpreendidas pelo ataque vindo de Vênus e pelos esquadrões em Saturno.");
                            Thread.sleep(3000);
                            System.out.println("A Terra triunfou perante à ameaça extraterrestre, graças aos nossos esforços.");
                            Thread.sleep(3000);
                            System.out.println("Vencemos a primeira batalha intergalática da humanidade!");
                            Thread.sleep(3000);
                            System.exit(0);
                           
                        } else if (decisao.equalsIgnoreCase("n")) {
                            System.out.println("Copiado, o plano de distração e ataque não será acionado. Vamos manter o combate sob controle.");
                            Thread.sleep(3000);
                            System.out.println("Ativando a segunda leva de disparos... \n");
                            aplicarDano(30);
                            Thread.sleep(4000);
                            System.out.println("Ataque realizado com sucesso! Não podemos acabar com todos eles, mas estamos vencendo!");
                            Thread.sleep(3);
                            System.out.println("Responderam com bombardeios na superífice marciana. Infelizmente tivemos algumas baixas.\n");
                            receberDano(30);
                            Thread.sleep(4000);
                            System.out.println("Vamos terminar com isso!");
                            Thread.sleep(4000);
                            System.out.println("Lançando o 3° disparo...");
                            Thread.sleep(5000);
                            System.out.println("Acertamos! As frotas que atraímos foram abatidas. Demos um fôlego à Terra.");
                            Thread.sleep(4000);
                            System.out.println("Por lá a batalha está sendo vencida também.");
                            Thread.sleep(3000);
                            System.out.println("Os ataques surpresa de Vênus e dos esquadrões de caças de Saturno devastou a maioria das frotas San-Ti.");
                            Thread.sleep(4000);
                            System.out.println("Não demorou muito para que a última nave tenha sido destruída!");
                            Thread.sleep(4000);
                            System.out.println("Gritos de guerra e comemoração foram lançados no vácuo por todo o sistema solar.");
                            Thread.sleep(4000);
                            System.out.println("A humanidade vence a sua primeira batalha intergalática!");
                            System.out.println("FIM DE JOGO!");
                            System.exit(0);

                        }
                    } else if (decisao.equalsIgnoreCase("n")) {
                        System.out.println("Copiado. Aguardemos...");
                        Thread.sleep(5000);
                        System.out.println("Precisamos agir, as naves inimigas estão bombardeando a Terra. \n");
                        diminuirPrestigio(50);
                        Thread.sleep(4000);
                        int decisao;
                                do {//obrigando o jogador a escolher uma opção válida, igual das outas vezes
                                System.out.println("Entre disparar imensos canhões de laser nas naves ou causar barulho suficiente para atrair algumas delas até Marte, qual será a melhor opção? (1- Plano 1, 2- Plano 2)");
                                while (!scanner.hasNextInt()) {
                                    System.out.println("Entrada inválida. Por favor, digite 1 para o Plano 1 ou 2 para o Plano 2.");
                                    scanner.next();
                                }
                                decisao = scanner.nextInt();
                                scanner.nextLine(); 
                                if (decisao != 1 && decisao != 2) {
                                    System.out.println("Escolha inválida. Por favor, escolha (1- Plano 1, 2- Plano 2).");
                                }
                            } while (decisao != 1 && decisao != 2);

                            if (decisao == 1) {
                                System.out.println("Boa escolha! Vamos disparar os canhões em 3, 2, 1...");
                                Thread.sleep(4000);
                                System.out.println("Acertamos a primeira levada com sucesso! \n");
                                aplicarDano(30);
                                Thread.sleep(3000);
                                System.out.println("Algumas naves inimigas se viraram em nossa direção. Vamos destruí-las.");
                                Thread.sleep(3000);
                                System.out.println("Carregando os motores, preparando para atirar.");
                                Thread.sleep(3000);
                                System.out.println("Disparando em 3, 2, 1...");
                                Thread.sleep(4000);
                                System.out.println("O ataque falhou. Mas o que pode ter acontecido?");
                                Thread.sleep(3000);
                                System.out.println("Tarde demais para qualquer coisa agora. Falhamos.");
                                Thread.sleep(4000);
                                System.out.println("'De repente, os caças da base de Saturno rasgam os céus, disparando na frota inimiga' \n");
                                aplicarDano(30);
                                Thread.sleep(3000);
                                System.out.println("'Talvez perceberam que nosso ataque havia falhado.");
                                Thread.sleep(3000);
                                System.out.println("Nosso esquadrão foi salvo, e agora as frotas terráques seguem rumo à Terra para terminar com essa guerra!");
                                Thread.sleep(4000);
                                System.out.println("Em nosso planeta, nossos suportes foram fundamentais para aniquilar os San-Ti.");
                                Thread.sleep(4000);
                                System.out.println("Não tiveram chance contra a nossa estratégia. A humanidade vence a sua primeira batalha intergalática!");
                                Thread.sleep(2000);
                                System.out.println("FIM DE JOGO!");
                                System.exit(0);
                             
                            } else if (decisao == 2) {
                                System.out.println("Copiado. Vamos atraí-los disparando pequenas rajadas e os fazendo cair em uma emboscada.");
                                Thread.sleep(3000);
                                System.out.println("Algumas naves se viraram para a nossa posição, a formação inimiga está se desfazendo. É hora de atacar!");
                                Thread.sleep(3000);
                                System.out.println("Disparamos, mas não houve efito nenhum. Parece que inibiram nossos sinais infravermelhos.");
                                Thread.sleep(3000);
                                System.out.println("As naves estão cada vez mais perto. Se atacarem, não poderemos fazer nada.");
                                Thread.sleep(4000);
                                System.out.println("Eles lançaram um objeto estranho na órbita do planeta.");
                                Thread.sleep(4000);
                                System.out.println("É uma bomba antimatéria. Estamos condenados por aqui.");
                                Thread.sleep(4000);
                                System.out.println("A bomba passou a girar em torno de seu próprio eixo, aumentando seu tamanho a cada segundo.");
                                Thread.sleep(4000);
                                System.out.println("É possível ver uma luz forte no horizonte vermelho. Uma segunda bomba.");
                                Thread.sleep(4000);
                                System.out.println("Em 20 minutos, Marte ja não existia mais.");
                                Thread.sleep(4000);
                                System.out.println("Onde havia um planeta, agora há pó, e a lamentação de inúmeros soldados, que perderam suas vidas sem nunca saber se sua raça foi ou não vitoriosa.");
                                System.out.println("FIM DE JOGO!");
                                System.exit(0); 
                            }

                    } else {
                        System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
                    }
                } while (!decisao.equalsIgnoreCase("s") && !decisao.equalsIgnoreCase("n"));

            } else if (escolha == 4) {

                System.out.println("Você e seu pelotão devem atuar na linha de defesa da Terra. Manteremos a luta aqui, enquanto o céu é estrelado por rajadas de lasers.");
                Thread.sleep(4000);
                System.out.println("Sua missão: liderar a resistência terráquea contra a frota inimiga. Planejamos durante séculos para chegar aqui.");
                Thread.sleep(4000);
                System.out.println("Estamos postos, assim como em Marte, Vênus e Saturno. O medo não poderá ser maior que a determinação de manter nossa existência.");
                Thread.sleep(6000);
                System.out.println("Eles chegaram. O horizonte azul é tomado por um enxame de naves gigantescas. Como se Mercúrio estivesse no lugar da Lua.");
                Thread.sleep(4000);
                
                do {
                    System.out.println("Nossos radares indicam que uma primeira onda está prestes a cruzar a atmosfera.");
                    Thread.sleep(3000);
                    System.out.println("Deseja iniciar um ataque antes que eles cheguem mais perto? (s/n)");
                    String decisao = scanner.next();
                    scanner.nextLine();
            
                    if (decisao.equalsIgnoreCase("s")) {
                        System.out.println("Enquanto o alarme ensurdecedor de evacuação toca, uma imensa linha vermelha parte das bases terrestres para atingir as naves no céu. \n");
                        aplicarDano(30);
                        aumentarPrestigio(15);
                        Thread.sleep(4000);
                        System.out.println("Enquanto atacávamos, daqui pudemos ver a base de Vênus realizar a mesma manobra. \n");
                        aplicarDano(20);
                        Thread.sleep(3000);
        
                        System.out.println("Enquanto as naves inimigas estão atordoadas, precisavos evacuar os civis o mais e tirá-los da superfície.");
                        Thread.sleep(3000);
                        System.out.println("Vamos redirecionar algumas tropas para evacuar os civis, mesmo que isso enfraqueça a linha de frente? (s/n)");
                        decisao = scanner.nextLine();
            
                        if (decisao.equalsIgnoreCase("s")) {
                            System.out.println("Os soldados deixam suas posições e iniciam a evacuação.");
                            aumentarPrestigio(20);
                            Thread.sleep(3000);
                            System.out.println("Esse processo demorou mais do que o esperado, e perdemos alguns homens na frente de batalha. \n");
                            receberDano(20);
                            Thread.sleep(4000);
                        } else if (decisao.equalsIgnoreCase("n")) {
                            System.out.println("Vamos manter o foco na defesa primeiro então. Mas alguns civis serão mortos sem aparo. \n");
                            diminuirPrestigio(10);
                            Thread.sleep(4000);
                            System.out.println("Mesmo com a concentração máxima na linha de frente, estamos sofrendo. \n");
                            receberDano(20);
                            Thread.sleep(4000);
                        }
            
                    } else if (decisao.equalsIgnoreCase("n")) {
                        System.out.println("Vamos esperar o ataque, mantendo os recursos para uma possível segunda onda. \n");
                        diminuirPrestigio(5);
                        Thread.sleep(4000);
                        System.out.println("O primeiro ataque das naves San-Ti atinge a Terra, causando danos severos em várias regiões. Civis e soldados são gravemente feridos. \n");
                        receberDano(40);
                        Thread.sleep(4000);
            
                        System.out.println("Com os recursos ainda intactos, você agora tem a chance de responder com força total. Deseja organizar um contra-ataque imediato? (s/n)");
                        decisao = scanner.nextLine();
            
                        if (decisao.equalsIgnoreCase("s")) {
                            System.out.println("Organizando um contra-ataque total. Canhões de plasma disparam incessantemente enquanto as naves terrestres voam para interceptar as frotas inimigas. Precisamos pular à frente. \n");
                            aplicarDano(30);
                            aumentarPrestigio(10);
                            Thread.sleep(4000);
                            System.out.println("Abatemos algumas naves, estamos equilibrando esssa guerra!");
                            Thread.sleep(3000);
                            System.out.println("O cheiro de fumaça e o som de explosões envolvem o campo de batalha enquanto a luta continua. Enquanto isso, mesmo sem nossa ajuda, os civis conseguiram se abrigar.");
                            Thread.sleep(4000);
                        } else if (decisao.equalsIgnoreCase("n")) {
                            System.out.println("Sem o contra-ataque, os San-Ti ganham cada vez mais território aéreo e terrestre. Nossas tropas começam a recuar diante do avanço alienígena. \n");
                            diminuirPrestigio(20);
                            receberDano(30);
                            Thread.sleep(4000);
                            System.out.println("Precisamos vencer, mas parece que não há mais meios para isso.'");
                            Thread.sleep(4000);
                        }
                    } else {
                        System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
                    }
            
                } while (!decisao.equalsIgnoreCase("s") && !decisao.equalsIgnoreCase("n"));
            
                Thread.sleep(3000);
                System.out.println("A batalha está chegando ao fim...");
                Thread.sleep(4000);

                if (vidaSan <= 40 && vida >= 40) {
                    System.out.println("Mesmo com todos os contratempos, conseguimos vecner as frotas daqui. Em Vênus e Satruno a humanidade também triunfou!");
                    Thread.sleep(4000);
                    System.out.println("Vencemos, mas pagamos um alto preço. Em todos os lugares vemos prédios em ruínas, crateras onde antes havia parques, mas o planeta ainda será o nosso lar.");
                    Thread.sleep(4000);
                    System.out.println("O que resta da humanidade agora se junta para reconstruir, levando consigo a lembrança dos que se sacrificaram.");
                    Thread.sleep(4000);
                    System.out.println("Devemos sempre nos lembrar desse episódio, e de como fizemos o impossível para cumprir a nossa natureza: a sobreviência.");
                    Thread.sleep(4000);
                    System.out.println("A humanidade venceu sua primeira batalha intergalática.");
                    Thread.sleep(4000);

                } else if (vida <= 40 && vidaSan >= 40) {
                    System.out.println("Perdemos o contato com as bases de Vênus e de Saturno.");
                    Thread.sleep(4000);
                    System.out.println("Daqui foi possível ver Marte ser derrotada. Parece que sabiam de todas as nossas estratégias. Mas como?");
                    Thread.sleep(4000);
                    System.out.println("Todas as frotas se concentram na Terra, mas não temos chances...");
                    Thread.sleep(5000);
                    System.out.println("Os poucos sobreviventes assistem, impotentes, enquanto os alienígenas tomam controle do planeta.");
                    Thread.sleep(4000);
                    System.out.println("Os humanos que sobraram, agora são escravizados e assassinados. Perdemos milênios de evoulção, para perdemos como se não fôssemos nada.");
                    Thread.sleep(4000);
                } 
                System.out.println("FIM DE JOGO!");
                System.exit(0);

            }
        } catch (InterruptedException e) {
             //exceção para tratar o thread.sleep()
            System.out.println("Ocorreu uma interrupção durante o delay, desculpe.");
            e.printStackTrace(); //exibe o rastreamento da pilha do erro
        }
    }
}
