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
//aqui vão ser propostas situações em relação a outros países, e cabe ao jogador escolher certo para no futuro a humanidade ter alguma chance. Quanto maior forem o síndices de credibilidade, segurança e recursos, a humanidade tem mais chance de vencer.
        try{
        do {
            Thread.sleep(3000);
            System.out.println("Passado alguns meses, as teorias do pesquisador foram confirmadas: há uma raça alienígena rumo ao planeta Terra, com previsão de chegada em 2774.");
            Thread.sleep(2000);
            System.out.println("Os representantes de quase todos os países estão se reunindo na ONU para discutir sobre planos de contenção.");
            Thread.sleep(1000);
            System.out.println("Cabe a você, como governante de uma das potências mundiais, fornecer estratégias, formar alianças e monitorar fundos para que a humanidade possa vencer no futuro.");
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
        Thread.sleep(4000);
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
        Thread.sleep(4000);
        do {
            System.out.println("Os EUA propõem um tratado secreto para garantir suprimentos de energia apenas para os países aliados da OTAN. Você aceita assinar esse tratado? (s/n)");
            decisao = scanner.next();
            scanner.nextLine(); 
            if (decisao.equalsIgnoreCase("n")) {
                System.out.println("Você se manteve firme em relação à decisão de não compactuar com a exclusão de outros países nessa 'Guerra Fria de 750 anos', mas isso trouxe menos suprimentos de energia.\n");
                aumentarCredibilidade(10);
                diminuirRecursos(10);
                diminuirSeguranca(10);
            } else if (decisao.equalsIgnoreCase("s")) {
                System.out.println("Você conseguiu uma boa reserva de energia para as crises que estão vindo, mas pense que as nações fora da OTAN estão vendo essa manobra como traição.\n");
                diminuirCredibilidade(10);
                aumentarRecursos(10);
                aumentarSeguranca(10);
            } else {
                System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
            }
        } while (!decisao.equalsIgnoreCase("s") && !decisao.equalsIgnoreCase("n"));
        Thread.sleep(4000);
        do {
            System.out.println("Com a tensão mundial, nações do Oriente Médio estão causando conflitos no norte da África, em busca de expansão territorial. Gostaria de intervir? (s/n)");
            decisao = scanner.next();
            scanner.nextLine(); 
            if (decisao.equalsIgnoreCase("n")) {
                System.out.println("A não intervenção deixa seu governo imparcial, o que é visto com bons olhos por parte do mundo, mas os países atacados não gostam dessa imparcialidade.\n");
                aumentarCredibilidade(10);
                aumentarSeguranca(10);
            } else if (decisao.equalsIgnoreCase("s")) {
                System.out.println("Essa intervenção custou alguns recursos que poderiam ser úteis lá na frente, e os países do oriente médio agora pensam em sua nação como inimiga. \n");
                diminuirCredibilidade(10);
                diminuirRecursos(10);
                diminuirSeguranca(10);
            } else {
                System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
            }
        } while (!decisao.equalsIgnoreCase("s") && !decisao.equalsIgnoreCase("n"));
        Thread.sleep(4000);
        do {
            System.out.println("Um grupo de empresários propõe a privatização de tecnologias de defesa avançadas. Você apoia essa ideia para aumentar os lucros do país? (s/n)");
            decisao = scanner.next();
            scanner.nextLine(); 
            if (decisao.equalsIgnoreCase("n")) {
                System.out.println("Manter essas tecnologias na mão do governo impede que elas se virem contra nós, mas impede que obtenhamos lucro rápido.\n");
                aumentarCredibilidade(10);
                aumentarSeguranca(10);
                diminuirRecursos(10);
            } else if (decisao.equalsIgnoreCase("s")) {
                System.out.println("Essas privatizações trouxeram um rápido lucro que poderá ser investido em outros planos de defesa, mas agora não temos mais controle sobre as tecnologias que serão usadas nesses planos. \n");
                aumentarRecursos(10);
                diminuirSeguranca(10);
            } else {
                System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
            }
        } while (!decisao.equalsIgnoreCase("s") && !decisao.equalsIgnoreCase("n"));
        Thread.sleep(4000);
        do {
            System.out.println("Agências de inteligência sugerem monitorar secretamente as comunicações dos seus aliados para garantir que eles não planejem algo contra o seu governo. Não podemos aprovar essa espionagem sem a sua autorização. Você concorda? (s/n)");
            decisao = scanner.next();
            scanner.nextLine(); 
            if (decisao.equalsIgnoreCase("n")) {
                System.out.println("Você se manteve fiel à própria confiança nos países aliados, mas abriu mão de uma informação vital. \n");
                aumentarCredibilidade(10);
                aumentarSeguranca(10);
            } else if (decisao.equalsIgnoreCase("s")) {
                System.out.println("Essa operação foi descoberta por países aliados antes mesmo de ser colocada em prática. Parece que temos um espião entre nós, e algumas nações romperam conosco. \n");
                diminuirCredibilidade(20);
                diminuirRecursos(20);
                diminuirSeguranca(20);
                System.out.println("Devido à essa crise de informação e espionagem, você deve se retratar publicamente e prometer demitir os envolvidos nessa conspiração. \n");
                Thread.sleep(2000);
                System.out.println("Se negar, talvez nunca recuperemos nossos recursos e nossa nação não terá chance nos próximos anos contra os alienígenas. \n");
                Thread.sleep(2000);
                System.out.println("A coletiva de imprensa já está à sua espera. Você irá se desculpar? (s/n)\n");
                decisao = scanner.next();
                scanner.nextLine(); 
                if (decisao.equalsIgnoreCase("n")) {
                diminuirCredibilidade(30);
                System.out.println("Você decidiu não se desculpar, e com toda a pressão colocada sobre seu cargo, seu governo acabou sofrendo um golpe de estado, apoiado pelas nações que tentamos espionar. \n");
                Thread.sleep(2000);
                System.out.println("Preso por traição aos aliados, crimes de espionagem e conspiração, todos os seus poderes foram revogados. \n");
                Thread.sleep(2000);
                System.out.println("Você não saberá como a humanidade lidou com os San-Ti. Ao fim de sua vida, eles ainda estavam muito longe. \n");
                Thread.sleep(2000);
                System.out.println("FIM DE JOGO!");
                System.exit(0);
                
                } else if (decisao.equalsIgnoreCase("s")) {
                System.out.println("Essa intervenção custou alguns recursos que poderiam ser úteis lá na frente, e os países do oriente médio agora pensam em sua nação como inimiga. \n");
                diminuirCredibilidade(10);
                diminuirRecursos(10);
                diminuirSeguranca(10);
                } else {
                System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
                }
                
            } else {
                System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n'.");
            }
        } while (!decisao.equalsIgnoreCase("s") && !decisao.equalsIgnoreCase("n"));

        //agora, as escolhas que o jogador fez até aqui vão definir como a história termina
        if (credibilidade >= 50 && seguranca >= 60 && recursos >= 60) {

            System.out.println("Você é um líder excepcional. A garantia de recursos para criação de armas e planos de defesa pode nos guiar para a vitória nos próximos anos.");
            Thread.sleep(2000);
            System.out.println("Agora, seu mandato está chegando ao fim, mas você deve deixar um legado de segurança e avanço tecnológico para quem for te suceder.");
            Thread.sleep(2000);
            System.out.println("Algumas escolhas ainda devem ser feitas, e elas definirão se conseguiremos neutralizar os San-Ti ou não.");
            Thread.sleep(2000);
            System.out.println("Alguns pesquisadores trouxeram planos de contenção, e cabe a você decidir qual é o mais assertivo.");
            Thread.sleep(2000);
            System.out.println("Vamos iniciar a reunião...");
            Thread.sleep(3500);

            int decisao;

            System.out.println("Plano 1: A Academia Chinesa de Ciências propõe a construção de um escudo solar, feito por milhões de satélites com espelhos gigantes que esconderiam a superfície da Terra de qualquer aparelho de sinal óptico ou de rádio.");
            Thread.sleep(4000);
            System.out.println("Esse escudo refletiria de volta a luz solar e deixaria a Terra 'invisível' para eles. \n");
            Thread.sleep(2000);
            System.out.println("Ponto forte: Seria como uma 'capa da invisibilidade' a nível global, protegendo o planeta de ataques de lasers e sondas localizadoras. E essa tecnologia poderia ser utilizada posteriormente pela humanidade para criar a Esfera de Dyson em nosso Sol, subindo na escala de Kardashev para civilizações mais avançadas.");
            Thread.sleep(3000);
            System.out.println("Ponto fraco: É uma ideia extremamente cara e demorada. Além disso, impedindo parte da apssagem da luz solar, o impacto ambiental seria muito elevado, se não arrumarmos solução para isso, podendo afetar o clima da Terra para sempre.\n");
            Thread.sleep(5000);
            System.out.println("\n");

            System.out.println("Plano 2: Pesquisadores da Universidade da Califórnia, se baseando na física de propulsão avançada, estão propondo a construção de uma frota de sondas ofensivas.");
            Thread.sleep(2000);
            System.out.println("Essas sondas seriam construídas em frotas autônomas com a tecnologia de propulsão a laser e velas solares. A IA saria conta de rastrear os San-Ti e identificar qualquer vulnerabilidade em suas naves.");
            Thread.sleep(3500);
            System.out.println("O ataque dessas sondas são ondas eletromagnéticas que inibem o funcionamento da naves dos alienígenas, os fazendo vagar pelo espaço congelados para sempre, como naves fantasmas.\n");
            Thread.sleep(2000);
            System.out.println("Ponto forte: É um plano de ataque e neutralização rápido e possívelmente muito eficaz, impedindo uma guerra entre nós e eles.");
            Thread.sleep(3000);
            System.out.println("Ponto fraco: Não conhecemos a tecnologia deles, e não podemos prever se esse ataque dará certo. Levaria ao menos um século para essas sondas ficarem prontas.");
            Thread.sleep(5000);
            System.out.println("\n");


            System.out.println("Plano 3: Os representantes da Universidade Tóquio propõem a contrução de escudos de campo de distorção temporal, explorando as teorias da relatividade e física quântica. ");
            Thread.sleep(4000);
            System.out.println("O plano consiste em criar um campo de distorção temporal, que envolveria a Terra em uma dilatação do tempo, onde os eventos fora dela seriam infinitamente mais lentos.");
            Thread.sleep(3000);
            System.out.println("Assim, qualquer indício ou da chegada ou de ataques extraterrestres seriam diluídos em milênios. O mundo todo 'pararia no tempo' em relação ao resto de todo o universo. \n");
            Thread.sleep(2000);
            System.out.println("Ponto forte: A humanidade poderia se desenvolver para sempre, enquanto qaulquer evento de fora para nós pareça congelado no tempo. Essa tecnologia poderia ser desligada a qualquer momento, quando estivermos prontos para uma investida.");
            Thread.sleep(3000);
            System.out.println("Ponto fraco: É uma ideia completamente experimental, em teorias científicas ainda não comprovadas. Além disso, o impacto negativo na humanidade por estar vivendo basicamente em uma 'realidade alternativa' é imensurável.\n");
            Thread.sleep(5000);
            System.out.println("\n");

            System.out.println("Plano 4: O centro tecnológico e científico mais avançado do mundo, o cluster 'Tóquio-Yokohama' propõe a criação de um gigantesco colisor de partículas que é caapz de gerar buracos de minhoca estáveis.");
            Thread.sleep(3000);
            System.out.println("Esses buracos de minhoca serviriam como túneis para qualquer ponto dobrável do universo, permitindo que a humanidade fuja para qualquer ponto que desejar no espaço.");
            Thread.sleep(3500);
            System.out.println("Esse colisor seria construído no subsolo e contaria com os princípios da física quântica. \n");
            Thread.sleep(2000);
            System.out.println("Ponto forte: Esse plano permite à humanidade uma escapatória sempre que desejar, além de possibiliar o transporte de armamentos e naves para um ponto estratégico.");
            Thread.sleep(3000);
            System.out.println("Ponto fraco: É uma física ainda não comprovada, podendo demorar centenas de anos para isso acontecer. Essa teoria conta com diversos paradoxos multiversais que podem tornar o plano inviàvel e perigoso.");
            Thread.sleep(6000);

            do {//obrigando o jogador a escolher uma opção válida, igual das outas vezes
                System.out.println("Com esses 4 planos em mente, em qual deles você deseja dar prosseguimento? (1- Plano 1, 2- Plano 2, 3- Plano 3, 4- Plano 4)");
                while (!scanner.hasNextInt()) {
                    System.out.println("Entrada inválida. Por favor, escolha um plano válido.");
                    scanner.next();
                }
                decisao = scanner.nextInt();
                scanner.nextLine(); 
                if (decisao != 1 && decisao != 2 && decisao != 3 && decisao != 4) {
                    System.out.println("Escolha inválida. Por favor, digite 1, 2, 3 ou 4 para escolher os planos.");
                }
            } while (decisao != 1 && decisao != 2 && decisao != 3 && decisao != 4);
            
            if (decisao == 1) {
                System.out.println("Você optou pelo Plano 1: Contrução do Escudo Solar...");
                Thread.sleep(2000);
                System.out.println("Os preparativos para construção foram iniciados assim que o mundo foi notificado do plano de contenção...");
                Thread.sleep(3000);
                System.out.println("Utilizando materiais com nanotecnologia, foram criados enormes espelhos ultrafinos e leves, acoplados a mihões de satélites que foram lançados na atmosfera ao longo de 50 anos.");
                Thread.sleep(4000);
                System.out.println("Os telescópios mais distantes da Terra já não conseguiam mais identificá-la, comprovando a eficácia do plano.");
                Thread.sleep(3000);
                System.out.println("Porém, a vida na Terra ficou mais complicada nos próximos 300 anos. A fauna e flona foram drásticamente alteradas devido à pouca luz solar que atingia a Terra. Os cientistas criaram um sistema de luz solar artificial, mas ela é cara demais para fornecer energia ao povo como um todo.");
                Thread.sleep(5000);
                System.out.println("Os dias e noites também, passados 500 anos, viraram artificiais. A grande redoma espelhada estva completamente montada.");
                Thread.sleep(3000);
                System.out.println("Quando os San-Ti chegaram, suas naves sobrevoaram a órbita da Terra durante um tempo, e lá ficaram por 2 anos.");
                Thread.sleep(3000);
                System.out.println("Esse período ficou conhecido como 'A Era do Desespero'.");
                Thread.sleep(3000);
                System.out.println("Porém, um certo dia, as naves simplesmente começaram a voltar de onde tinham vindo, sem evidências da possibilidade de realmente teremn sido enganados.");
                Thread.sleep(3000);
                System.out.println("Nunca mais voltaram.");
                Thread.sleep(4000);
                System.out.println("Após esse evento, os painéis foram retirados da atmosfera da Terra e enviados para o Sol. Durante todos esses anos, mais painéis foram criados para pegar toda a superfície solar.");
                Thread.sleep(4000);
                System.out.println("1500 anos após 2024, a humanidade extraía toda a energia disponível de sua estrela, se tornando uma civilização do tipo II.");
                Thread.sleep(3000);
                System.out.println("Parabéns! A escolha pelo plano dos escudos solares permitiu não só que a humanidade fosse salva, mas que evoluísse de maneira quase imensurável.");
                Thread.sleep(4000);
                System.out.println("Todos aqueles que nasceram após sua decisão devem muito à você, os humanos reconhecem seu valor na história para sempre.");
                Thread.sleep(4000);
                System.out.println("FIM DE JOGO!");
                System.exit(0);
                
            } else if (decisao == 2) {
                
                System.out.println("Você optou pelo Plano 1: Contrução do Escudo Solar...");
                Thread.sleep(2000);
                System.out.println("Os preparativos para construção foram iniciados assim que o mundo foi notificado do plano de contenção...");
                Thread.sleep(3000);
                System.out.println("Utilizando materiais com nanotecnologia, foram criados enormes espelhos ultrafinos e leves, acoplados a mihões de satélites que foram lançados na atmosfera ao longo de 50 anos.");
                Thread.sleep(4000);
                System.out.println("Os telescópios mais distantes da Terra já não conseguiam mais identificá-la, comprovando a eficácia do plano.");
                Thread.sleep(3000);
                System.out.println("Porém, a vida na Terra ficou mais complicada nos próximos 300 anos. A fauna e flona foram drásticamente alteradas devido à pouca luz solar que atingia a Terra. Os cientistas criaram um sistema de luz solar artificial, mas ela é cara demais para fornecer energia ao povo como um todo.");
                Thread.sleep(5000);
                System.out.println("Os dias e noites também, passados 500 anos, viraram artificiais. A grande redoma espelhada estva completamente montada.");
                Thread.sleep(3000);
                System.out.println("Quando os San-Ti chegaram, suas naves sobrevoaram a órbita da Terra durante um tempo, e lá ficaram por 2 anos.");
                Thread.sleep(3000);
                System.out.println("Esse período ficou conhecido como 'A Era do Desespero'.");
                Thread.sleep(3000);
                System.out.println("Porém, um certo dia, as naves simplesmente começaram a voltar de onde tinham vindo, sem evidências da possibilidade de realmente teremn sido enganados.");
                Thread.sleep(3000);
                System.out.println("Nunca mais voltaram.");
                Thread.sleep(4000);
                System.out.println("Após esse evento, os painéis foram retirados da atmosfera da Terra e enviados para o Sol. Durante todos esses anos, mais painéis foram criados para pegar toda a superfície solar.");
                Thread.sleep(4000);
                System.out.println("1500 anos após 2024, a humanidade extraía toda a energia disponível de sua estrela, se tornando uma civilização do tipo II.");
                Thread.sleep(3000);
                System.out.println("Parabéns! A escolha pelo plano dos escudos solares permitiu não só que a humanidade fosse salva, mas que evoluísse de maneira quase imensurável.");
                Thread.sleep(4000);
                System.out.println("Todos aqueles que nasceram após sua decisão devem muito à você, os humanos reconhecem seu valor na história para sempre.");
                Thread.sleep(4000);
                System.out.println("FIM DE JOGO!");
                System.exit(0);

            } else if (decisao == 3) {
                
                System.out.println("Você optou pelo Plano 1: Contrução do Escudo Solar...");
                Thread.sleep(2000);
                System.out.println("Os preparativos para construção foram iniciados assim que o mundo foi notificado do plano de contenção...");
                Thread.sleep(3000);
                System.out.println("Utilizando materiais com nanotecnologia, foram criados enormes espelhos ultrafinos e leves, acoplados a mihões de satélites que foram lançados na atmosfera ao longo de 50 anos.");
                Thread.sleep(4000);
                System.out.println("Os telescópios mais distantes da Terra já não conseguiam mais identificá-la, comprovando a eficácia do plano.");
                Thread.sleep(3000);
                System.out.println("Porém, a vida na Terra ficou mais complicada nos próximos 300 anos. A fauna e flona foram drásticamente alteradas devido à pouca luz solar que atingia a Terra. Os cientistas criaram um sistema de luz solar artificial, mas ela é cara demais para fornecer energia ao povo como um todo.");
                Thread.sleep(5000);
                System.out.println("Os dias e noites também, passados 500 anos, viraram artificiais. A grande redoma espelhada estva completamente montada.");
                Thread.sleep(3000);
                System.out.println("Quando os San-Ti chegaram, suas naves sobrevoaram a órbita da Terra durante um tempo, e lá ficaram por 2 anos.");
                Thread.sleep(3000);
                System.out.println("Esse período ficou conhecido como 'A Era do Desespero'.");
                Thread.sleep(3000);
                System.out.println("Porém, um certo dia, as naves simplesmente começaram a voltar de onde tinham vindo, sem evidências da possibilidade de realmente teremn sido enganados.");
                Thread.sleep(3000);
                System.out.println("Nunca mais voltaram.");
                Thread.sleep(4000);
                System.out.println("Após esse evento, os painéis foram retirados da atmosfera da Terra e enviados para o Sol. Durante todos esses anos, mais painéis foram criados para pegar toda a superfície solar.");
                Thread.sleep(4000);
                System.out.println("1500 anos após 2024, a humanidade extraía toda a energia disponível de sua estrela, se tornando uma civilização do tipo II.");
                Thread.sleep(3000);
                System.out.println("Parabéns! A escolha pelo plano dos escudos solares permitiu não só que a humanidade fosse salva, mas que evoluísse de maneira quase imensurável.");
                Thread.sleep(4000);
                System.out.println("Todos aqueles que nasceram após sua decisão devem muito à você, os humanos reconhecem seu valor na história para sempre.");
                Thread.sleep(4000);
                System.out.println("FIM DE JOGO!");
                System.exit(0);

            } else if (decisao == 4) {
                
                System.out.println("Você optou pelo Plano 1: Contrução do Escudo Solar...");
                Thread.sleep(2000);
                System.out.println("Os preparativos para construção foram iniciados assim que o mundo foi notificado do plano de contenção...");
                Thread.sleep(3000);
                System.out.println("Utilizando materiais com nanotecnologia, foram criados enormes espelhos ultrafinos e leves, acoplados a mihões de satélites que foram lançados na atmosfera ao longo de 50 anos.");
                Thread.sleep(4000);
                System.out.println("Os telescópios mais distantes da Terra já não conseguiam mais identificá-la, comprovando a eficácia do plano.");
                Thread.sleep(3000);
                System.out.println("Porém, a vida na Terra ficou mais complicada nos próximos 300 anos. A fauna e flona foram drásticamente alteradas devido à pouca luz solar que atingia a Terra. Os cientistas criaram um sistema de luz solar artificial, mas ela é cara demais para fornecer energia ao povo como um todo.");
                Thread.sleep(5000);
                System.out.println("Os dias e noites também, passados 500 anos, viraram artificiais. A grande redoma espelhada estva completamente montada.");
                Thread.sleep(3000);
                System.out.println("Quando os San-Ti chegaram, suas naves sobrevoaram a órbita da Terra durante um tempo, e lá ficaram por 2 anos.");
                Thread.sleep(3000);
                System.out.println("Esse período ficou conhecido como 'A Era do Desespero'.");
                Thread.sleep(3000);
                System.out.println("Porém, um certo dia, as naves simplesmente começaram a voltar de onde tinham vindo, sem evidências da possibilidade de realmente teremn sido enganados.");
                Thread.sleep(3000);
                System.out.println("Nunca mais voltaram.");
                Thread.sleep(4000);
                System.out.println("Após esse evento, os painéis foram retirados da atmosfera da Terra e enviados para o Sol. Durante todos esses anos, mais painéis foram criados para pegar toda a superfície solar.");
                Thread.sleep(4000);
                System.out.println("1500 anos após 2024, a humanidade extraía toda a energia disponível de sua estrela, se tornando uma civilização do tipo II.");
                Thread.sleep(3000);
                System.out.println("Parabéns! A escolha pelo plano dos escudos solares permitiu não só que a humanidade fosse salva, mas que evoluísse de maneira quase imensurável.");
                Thread.sleep(4000);
                System.out.println("Todos aqueles que nasceram após sua decisão devem muito à você, os humanos reconhecem seu valor na história para sempre.");
                Thread.sleep(4000);
                System.out.println("FIM DE JOGO!");
                System.exit(0);

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
            }


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


