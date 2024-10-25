package classes;

import java.util.Scanner;
import interfaces.Combate;

public class Militar extends Personagem implements Combate{

    private int vida;
    private int vidaSan;
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
                receberDano(15);
                System.out.println("De repente, perdemos muitos soldados. Eles não parecem ter vindo até aqui para uma luta demorada. Se vacilarmos, seremos aniquilados...");
                Thread.sleep(3000);

                do {
                    System.out.println("Agora, vamos ativar outro plano. Deseja ativar manobras evasivas e contra-atacar com uma formação de enxame de caças? (s/n)");
                    decisao = scanner.next();
                    scanner.nextLine();
    
                    if (decisao.equalsIgnoreCase("s")) {
                        System.out.println("A frota acionada executa uma série de manobras evasivas, flanqueando os inimigos e disparando rajadas em tudo que se mexesse e não fosse terráqueo. \n");
                        aplicarDano(20);
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
                        aplicarDano(30);
                        aumentarPrestigio(15);
                        Thread.sleep(3000);
                        System.out.println("Se mantivermos nossos ataques, a Terra terá mais mais chances.");
                    } else if (decisao.equalsIgnoreCase("n")) {
                        System.out.println("Nossas frotas, impacientes com a sua espera, ignoraram suas ordens e partiram para cima das naves inimigas, mas elas já estavam perto demais. \n");
                        Thread.sleep(2000);
                        diminuirPrestigio(10);
                        System.out.println("Perdemos muitos soldados devido à dessincronização das naves. Isso poderia ter sido evitado.");
                        receberDano(20);
                    } else {
                        System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
                    }
                } while (!decisao.equalsIgnoreCase("s") && !decisao.equalsIgnoreCase("n"));

                Thread.sleep(3000);
                System.out.println("A batalha de Saturno está em seus atos finais. Perdemos homens, mas também levamos muitos deles.");

                if (vidaSan <= 0) {
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
                    
                } else if (vida <= 0) {
                    System.out.println("A base de Saturno foi sobrecarregada, e os San Ti abriram caminho para invadir outras posições.");
                    diminuirPrestigio(30);
                    System.out.println("Infelizmente, a derrota pode ter consequências devastadoras para a Terra.");
                } else {
                    System.out.println("A batalha termina em um impasse tenso, mas os San Ti estão enfraquecidos e recuam momentaneamente.");
                    aumentarPrestigio(10);
                    System.out.println("Seus esforços garantem um respiro, mas a guerra está longe de acabar.");
                }

                    Thread.sleep(3000);
                    System.out.println("Você respira fundo, sabendo que cada decisão moldou o destino da humanidade. A luta continua, e a próxima batalha pode ser ainda mais intensa.");

            }






        } catch (InterruptedException e) {
             //exceção para tratar o thread.sleep()
            System.out.println("Ocorreu uma interrupção durante o delay, desculpe.");
            e.printStackTrace(); //exibe o rastreamento da pilha do erro
        }
    }
}
