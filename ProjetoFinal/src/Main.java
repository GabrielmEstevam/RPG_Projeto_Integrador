import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;



/**
 *
 * @author joao.pssilvano
 */
public class Main {

    static int vida;
    static int pontos;
    
    // Trazendo a classe de testes para a classe main 
    Teste tes = new Teste();
    


    //Exibe o texto como se fosse um comando de print, só que com ajuste no tempo de cada palavra, letra ou frase
    public static void exibirTexto(String texto, TimeUnit unit, long tempo_mensagem) {
        try {
            Digita(texto, unit, tempo_mensagem);
        } catch (InterruptedException e) {
            // Tratar interrupções
        }
    }

    //conjunto do exibirTexto
    public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
        }
    }

    //Função que imprime o menu e recebe a escolha do usuario
    static char menu(char escolhaMenu) {
        Scanner entry = new Scanner(System.in);
        exibirTexto("\n------------------------------------------------------------\n", TimeUnit.MILLISECONDS, 20);
        exibirTexto("\n               ENIGMA DO CONHECIMENTO              \n  ", TimeUnit.MILLISECONDS, 20);
        exibirTexto("1 - Instruções\n  ", TimeUnit.MILLISECONDS, 20);
        exibirTexto("2 - Jogar\n  ", TimeUnit.MILLISECONDS, 20);
        exibirTexto("3 - Créditos\n  ", TimeUnit.MILLISECONDS, 20);
        exibirTexto("4 - Sair\n  ", TimeUnit.MILLISECONDS, 20);
        exibirTexto("Insira uma das opções: ", TimeUnit.MILLISECONDS, 20);
        escolhaMenu = entry.next().charAt(0);
        exibirTexto("------------------------------------------------------------\n", TimeUnit.MILLISECONDS, 20);

        return escolhaMenu;
    }

    //Função para dar a opção do usuario voltar ao menu
    static void voltaMenu(String escolha, String frase) {
        Scanner entry = new Scanner(System.in);
        do {
            exibirTexto(frase + "\n\n", TimeUnit.MILLISECONDS, 20);
            escolha = entry.next();
            
            // 
            String validar = Teste.validadorVoltaMenu(escolha);


            if (escolha.equalsIgnoreCase("0")) {
                exibirTexto("Voltando ao menu...\n\n  ", TimeUnit.MILLISECONDS, 20);
            } else {
            	exibirTexto(validar, TimeUnit.MILLISECONDS, 20);
           }
        } while (!escolha.equalsIgnoreCase("0"));
    }

    //Função que dita o que acontece baseado na esolha que o usuario fez no menu
    static void tripasMenu(char mChoice) {
         // Trazendo a classe de testes para a classe main 
        Teste tes = new Teste();
        String insChoice = null;
        switch (mChoice) {

            case '1' -> {
                exibirTexto("\nBem-vindo ao Enigma do conhecimento! O objetivo é responder corretamente o maior número de perguntas possível.\n" +
"\n" +
"Você será apresentado a uma pergunta e várias opções de resposta. Leia cuidadosamente a pergunta e as alternativas antes de fazer sua escolha.\n" +
"\n" +
"Para selecionar sua resposta, digite a letra correspondente à alternativa correta. Por exemplo, se a resposta correta for a opção 2, digite [b], e pressione Enter.\n" +
"\n" +
"Cada resposta correta fará com que você alcance um andar mais abaixo na dungeon, e o seu objetivo é chegar ao ultimo andar.\n" +
"\n" +
"Se você responder corretamente, o jogo avançará para a próxima pergunta. Se você responder incorretamente, perdera vida podendo chegar a morte.\n" +
"\n" +
"O jogo continuará até que todas as perguntas tenham sido respondidas ou até que você erre uma pergunta que resulte na sua morte.\n" +
"\n" +
"Divirta-se e desafie seus conhecimentos! Esteja preparado para enfrentar uma variedade de perguntas em diferentes áreas.\n\n", TimeUnit.MILLISECONDS, 20);
                voltaMenu(insChoice, "Insira o numero 0 para voltar ao menu.");
            }

            case '2'-> {
                exibirTexto("\n\n\nBem-vindo a MagnoHeinn\n\n\n", TimeUnit.MILLISECONDS, 20);
                exibirTexto(" Em uma terra muito muito distante, um jovem chamado Patolino deseja possuir a alcunha mais almejada, O Mago Supremo, mas \r\n"
                		+ "como qualquer coisa que valha a pena, essa não será uma tarefa fácil. \r\n"
                		+ "  O Mago Supremo é aquele que recebe a bênção da fada Rainha Celestia, e após estudar durante anos Patolino deixará de ser um simples jovem \r\n"
                		+ "e para se tornar um jovem sábio, e após se sentir confiante decidiu ir até Celestia. \r\n"
                		+ "  Assim Patolino saiu em sua jornada, uma jornada que por mais simples que fosse, não pode ser considerada fácil, mas esse jovem é tão destemido \r\n"
                		+ "quanto era determinado, sua jornada consistia em atravessar 4 reinos para chegar ao reino das fadas, e assim patolino o fez, \r\n"
                		+ "saindo de Midgard passou pelas terras congeladas Niflheim um lugar onde mal se pode respirar já que seus pulmões podem congelar, com\r\n"
                		+ "sua temperatura praticamente no zero absoluto, logo em sequência Jotunheim terras gélidas não tão geladas quanto \r\n"
                		+ "Niflheim mas definitivamente não menos perigosas, onde teve que se esgueirar dos gigantes que o cercava, sem ser notado ou seria estraçalhado\r\n"
                		+ ", sabendo que sairia daquele horrendo buraco de gelo para um lugar mais quente \r\n"
                		+ "Patolino se animou, mas para sua completa decepção o próximo reino era Muspelheim, que não era simplesmente um lugar quente, ele \r\n"
                		+ "era coberto de magma, mas isso não o importava já que todos esses perrengues valeriam a pena, faltava apenas um reino, \r\n"
                		+ "mas que não seria mais simples do que os outros, pelo contrário, fadas são seres da floresta, que vivem lado a lado com elfos, mas não \r\n"
                		+ "existem apenas fadas boas que dão bênçãos e elfos de cabelos dourados e olhos verdes, essas raças tambem possuem algo como \r\n"
                		+ "um lado sombio, e lá estava naquele reino Svartalfheim a morada dos elfos negos e dos leprechaum, uma terra onde quem tentasse\r\n"
                		+ " passar por lá seria amaldiçoado pelos leprechaum ou mortos pelos elfos negros, nada bobo Patolino pegou o caminho longo, dando a volta\r\n"
                		+ " pela borda da floresta sombria, isso não era simples ou facil mas por sorte ou destino ele foi capaz de atravessar aquela \r\n"
                		+ "horripilante floresta. Para finalmente após uma longa, longa jornada se ver em uma linda floresta, um ar limpo, e uma sensação \r\n"
                		+ "de acolhimento, e lá estava Álfheim.\r\n"
                                           +"Patolino: Ah, Celestia! Finalmente encontrei você! Venho aqui hoje para fazer um pedido muito especial.\r\n" 
                                           +"Celestia: Ah, Patolino, que bom vê-lo! O que posso fazer por você hoje?\r\n"
                                           +"Patolino: Eu quero me tornar o Mago Supremo, Celestia! Estou cansado de ser apenas um pato azarado.\r\n"
                                           + "Quero mostrar ao mundo que tenho habilidades incríveis!\r\n " 
                                           +"Celestia: Ah, Patolino, sua determinação é admirável. Se você realmente deseja se tornar o Mago Supremo, há uma tarefa que você deve cumprir.\r\n"
                                           +"Patolino: Dungeon dos Desafios? Parece perigoso, mas estou pronto para enfrentar qualquer coisa!\n"  
                                           +"Celestia: Ótimo, Patolino! A Dungeon dos Desafios é um lugar repleto de armadilhas e enigmas.\r\n" 
                                           +"Somente um verdadeiro sábio poderá enfrentá-los e encontrar o Diploma Dourado.\r\n" 
                                           +"Patolino: Então, você acredita que eu sou capaz de lidar com esses desafios?\r\n" 
                                           +"Celestia: Tenho plena confiança em você, Patolino. Sei que dentro de você há uma força que ainda não foi completamente explorada.\r\n" 
                                           +"A Dungeon dos Desafios será uma oportunidade para você descobrir seu verdadeiro potencial.\r\n" 
                                           +"Patolino: Muito obrigado, Celestia! Farei o possível para trazer o Diploma Dourado e provar meu valor para me tornar o Mago Supremo!\n",TimeUnit.MILLISECONDS, 20);
            }
            case '3' -> {
                exibirTexto("\n\nCriado por:\n"
                        + "João Pedro\n"
                        + "José Rodrigo\n"
                        + "Gabriel \n"
                        + "Diogo\n"
                        + "Em colaboração com:\n"
                        + "Eduardo Takeo\n\n", TimeUnit.MILLISECONDS, 20);
                voltaMenu(insChoice, "Insira o numero 0 para voltar ao menu.");
            }
            case '4' ->{
                exibirTexto("\n\nEncerrando...\n\n", TimeUnit.MILLISECONDS,20);
                System.exit(0);}
            default ->
                exibirTexto(Teste.validadorMenu(mChoice), TimeUnit.MILLISECONDS,20);
        }
        
    }
   

    //Função que faz o print das perguntas e recebe e retorna e a resposta dada pelo usuario
    static String Perg(List<String> per, List<String> res) {
        Scanner entry = new Scanner(System.in);
        String escolhaRes;
        //exibe uma das perguntas que estão no array
        exibirTexto(per.get(0), TimeUnit.MILLISECONDS, 20);
        // faz o print da quantidade minima possivel de respostas
        exibirTexto("\na) ", TimeUnit.MILLISECONDS, 20);
        exibirTexto(res.get(0), TimeUnit.MILLISECONDS, 20);
        exibirTexto("b) ", TimeUnit.MILLISECONDS, 20);
        exibirTexto(res.get(1), TimeUnit.MILLISECONDS, 20);
        exibirTexto("c) ", TimeUnit.MILLISECONDS, 20);
        exibirTexto(res.get(2), TimeUnit.MILLISECONDS, 20);
        //condicional que adiciona mais respostas caso hajam mais
        if (res.size() == 4) {
            exibirTexto("d) ", TimeUnit.MILLISECONDS, 20);
            exibirTexto(res.get(3), TimeUnit.MILLISECONDS, 20);
        } else if (res.size() == 5) {
            exibirTexto("d) ", TimeUnit.MILLISECONDS, 20);
            exibirTexto(res.get(3), TimeUnit.MILLISECONDS, 20);
            exibirTexto("e) ", TimeUnit.MILLISECONDS, 20);
            exibirTexto(res.get(4), TimeUnit.MILLISECONDS, 20);
        }
        exibirTexto("Insira sua resposta: ", TimeUnit.MILLISECONDS, 20);
        escolhaRes = entry.next();
        return escolhaRes;
    }

    //Função para adicinar as respostas a um arrayList
    static List<String> colocaRes(String alter1, String alter2, String alter3, String alter4, String alter5) {
        List<String> res = new ArrayList();
        //adiciona a quatidade minima de respostas possivel
        res.add(alter1);
        res.add(alter2);
        res.add(alter3);
        //condiconal para adicionar mais repostas caso necessario
        if (alter4 != null && alter5 == null) {
            res.add(alter4);
        } else if (alter4 != null && alter5 != null) {
            res.add(alter4);
            res.add(alter5);
        }

        return res;
    }

    //Função que controla o que acontecera baseado na resposta que o usuario deu para a pergunta
    static boolean Res(boolean controleAcerto, String escolhaRes, List<String> res, String resC, int dano) {

        switch (escolhaRes) {
            case "a", "A" -> {
                controleAcerto = tripasRes(controleAcerto, res, resC, 0, dano);
                break;
            }
            case "b", "B" -> {
                controleAcerto = tripasRes(controleAcerto, res, resC, 1, dano);
                break;
            }
            case "c", "C" -> {
                controleAcerto = tripasRes(controleAcerto, res, resC, 2, dano);
                break;
            }
            case "d", "D" -> {
                controleAcerto = tripasRes(controleAcerto, res, resC, 3, dano);
                break;
            }
            case "e", "E" -> {
                controleAcerto = tripasRes(controleAcerto, res, resC, 4, dano);
                break;
            }
            default ->
                exibirTexto("Resposta invalida tente novamente.\n\n",TimeUnit.MILLISECONDS,20);
        }
        return controleAcerto;
    }
    //Função complementar da função Res

    static boolean tripasRes(boolean controleAcerto, List<String> res, String resC, int get, int dano) {
        if (res.get(get).equals(resC)) {
            exibirTexto("resposta correta", TimeUnit.MILLISECONDS, 20);
            controleAcerto = true;
            pontos++;
        } else {
            exibirTexto("Resposta incorreta.\n", TimeUnit.MILLISECONDS, 20);
            subDano(dano);
            exibirTexto("Você perdeu " + dano + " de vida.\nVida: " + vida + "\n", TimeUnit.MILLISECONDS, 20);

        }
        return controleAcerto;
    }

//Função que contabiliza o dano na vida
    static void subDano(int dano) {
        vida -= dano;
    }

    static boolean ultimaFase(int dano) {
        boolean controleAcerto=false;
        Scanner entry = new Scanner(System.in);
        Random aleatorio = new Random();
                exibirTexto("Para qual andar Marciano correu?\n",TimeUnit.MILLISECONDS, 20);
                int numAleatorio = aleatorio.nextInt(6)+1;    
                while(vida>0){                 
                    exibirTexto("\nInsira o andar: ",TimeUnit.MILLISECONDS, 20);
                    int chutePlayer = entry.nextInt(); 
                        if ((chutePlayer!=numAleatorio)&&(chutePlayer+1!=numAleatorio)&&(chutePlayer-1!=numAleatorio)){
                            exibirTexto("Droga ele não está aqui",TimeUnit.MILLISECONDS, 20);
                            subDano(dano);
                        } else if((chutePlayer+1==numAleatorio)||(chutePlayer-1==numAleatorio)){
                            exibirTexto("Ele está por perto.",TimeUnit.MILLISECONDS, 20);
                            subDano(dano);
                        } else {
                            exibirTexto("Patolino: (olhando em volta) Onde será que o Marvin se meteu? Ele conseguiu escapar novamente!\n" +
                                    "\n" +
                                    "Marvin: (voz sussurrante) Patolino, você não é páreo para minha astúcia! Desista enquanto pode!\n" +
                                    "\n" +
                                    "Patolino: (determinado) Eu nunca desisto, Marvin! Eu vou te encontrar, não importa onde você se esconda!\n" +
                                    "\n" +
                                    "(Após vasculhar cuidadosamente o ambiente, Patolino avista Marvin escondido atrás de um monolito.)\n" +
                                    "\n" +
                                    "Patolino: (apontando) Aha! Te peguei, Marvin! Agora é a minha vez de brincar!\n" +
                                    "\n" +
                                    "Marvin: (surpreso) O que?! Como você me encontrou?\n" +
                                    "\n" +
                                    "Patolino: (com um sorriso vitorioso) Eu conheço seus truques, Marvin. Agora, entregue o Diploma Dourado!\n" +
                                    "\n" +
                                    "Marvin: (relutante, entrega o Diploma Dourado) Muito bem, Patolino.\n"+
                                    "Mas não pense que isso significa que você me venceu!\n" +
                                    "\n" +
                                    "Patolino: (triunfante) Oh, mas isso significa exatamente isso, Marvin! O Diploma Dourado está de volta em mãos seguras.\n"
                                    + "Agora, é a minha vez de seguir em frente e me tornar o Mago Supremo!",TimeUnit.MILLISECONDS,20);
                            pontos++;
                            controleAcerto=true;
                            break;
                        }
                    }
        return controleAcerto;
    }

    //classe principal do codigo
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        //Variavel que recebe a resposta para as perguntas
        String escolhaRes = null;
        //Variavel que recebe a escolha do menu que o usuario fez
        char escolhaMenu = 0;
        //Variaveis que contem os danos que os inimigos causam nos personagens
        int dano1 = 15;
        int dano2 = 30;
        //Variavel de controle da fase(controla se o usuario acertou ou errou a pergunta)
        boolean controleAcerto = false;
        //Variavel que recebe a resposta correta da pergunta em questão
        String rC;
        /*Criação de  arrays.
        *lv = dificuldade
        *per = pergunta
        *res = resposta*/
        List<String> per = new ArrayList();
        List<String> res = new ArrayList();

        //Loop que impede o jogo de fechar a menos que o usuario escolha a opção sair do menu
        do {
            //Função que mostra as opções do menu, e pede para escolher uma das opções
               escolhaMenu = menu(escolhaMenu);
           
            //Função que direciona o que será mostrado depois da escolha do menu
            tripasMenu(escolhaMenu);

            if (escolhaMenu == '2') {
                //reinicia a variavel de controle, para caso o usuario vá jogar novamente.
                controleAcerto = false;
                //reinicia a variavel de controle, para caso o usuario vá jogar novamente.
                pontos = 0;
                //reinicia a variavel de controle, para caso o usuario vá jogar novamente.
                vida = 100;
                //reinicia a variavel de controle, para caso o usuario vá jogar novamente.
                do {
                    /*Este loop  será usado para a execusão das fases do jogo
                    * caso o usuario não acerte a questão antes de perder toda a vida ele voltara ao menu
                    * e no caso de ele acertar será direcionado a proxima fase(proximo loop while)*/
                    //FASE 1
                    //Reiniciando variavel de controle
                    exibirTexto("~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~\n", TimeUnit.MILLISECONDS, 20);
                    controleAcerto = false;
                    while (controleAcerto == false && vida > 0) {
                       exibirTexto("A Entrada da Dungeon\n" +
                               "(Patolino está diante da imponente entrada da Dungeon dos Desafios. Ele olha para trás e vê Celestia acenando com encorajamento.)\n" +
                               "\n" +
                               "Patolino: (Determinado) Não importa o quão perigoso seja, vou enfrentar essa dungeon e encontrar o Diploma Dourado!\n" +
                               "\n" +
                               "Celestia: (Sorrindo) Tenho confiança em você, Patolino. Boa sorte!\n"+
                               "\n" +
                               "Patolino de frente com a majestosa Dungeon dos desafios, percebe que ela está selada(fechada),\n"+
                               "e ao olhar para glifos na parede vê que tera que resolver um enigma para abri-la.\n"+
                               "\n"+
                               "Uma voz rouca sai em meio ao vazio e diz:\n\n" , TimeUnit.MILLISECONDS, 20);

                        escolhaRes = null;
                        rC = null;
                        per.add("Sou invisível, mas todos podem sentir minha presença.\n" +
                                       "Posso ser usado para o bem ou para o mal, dependendo de como sou empregado.\n" +
                                       "Posso mover montanhas e criar maravilhas.\n" +
                                        "Sem mim, a vida seria frágil e limitada.\n" +
                                         "\n" +
                                         "O que sou eu?\n");

                            res = colocaRes("Amor\n", "Tempo\n", "Poder\n", "Energia\n", null);
                            rC = "Poder\n";
                        Collections.shuffle(res);
                        escolhaRes = Perg(per, res);
                        controleAcerto = Res(controleAcerto, escolhaRes, res, rC, 0);
                        per.clear();
                        res.clear();
                        exibirTexto("~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~\n", TimeUnit.MILLISECONDS, 20);
                    }
                    exibirTexto("A Entrada da Dungeon\n" +
                               "(A entrada da dungeon se abre, ao olhar para trás novamente Patolino vê Celestia com um sorriso de orgulho no rosto, e segue em frente.)\n" +
                               "\n" +
                               "Patolino vaga por um tempo, antes de se deparar com uma pedra negra, grende e impotente, que mesmo com todo seu conhecimento\n" +
                               "ele não consegue indentificar do que é feito, ao olha para o centro deste monolito ele vê algo se formando.\n"+
                               "\n" +
                               "01010100 01100101 01101110 01110100 01100101 00100000 01110011\n"+
                               "01100101 00100000 01110000 01110101 01100100 01100101 01110010\n"+
                                "01000001 01110000 01100101 01101110 01100001 01110011 00100000\n"+
                                "01110011 11100010 10111000 10101011 01101001 01101111 01110011\n"+
                                "00100000 01110000 01100001 01110011 01110011 01100001 01110010\n"+
                               "01100001 01101101\n"+
                                "\n" +
                               "Patolino: (Sorrindo) um desafio a altura não esperava nada menos.\n" +
                                "\n" +
                                "E então Patolino como alguem digno da alcunha de sabio decifra o codigo sem demora.\n"+
                                "Vendo então que se tratava de perguntas.", TimeUnit.MILLISECONDS, 20);
                    controleAcerto = false;
                    while (controleAcerto == false && vida > 0) {

                        //Reiniciando variavel de controle
                        escolhaRes = null;

                        //Reiniciando variavel de controle
                        rC = null;

                        //Declaração de conteudo do array de perguntas, 3 perguntas são adicionadas.
                        per.add("Qual a geraçao de computadores que estamos atualmente?");
                        per.add("Quem é considerado o Pai da Computaçao?");
                        per.add("Onde foi inventado o sistema de numeraçao decimal?");

                        //Embaralha as perguntas 
                        Collections.shuffle(per);
                        Collections.shuffle(per);

                        //condicional que coloca a resposta de acordo com a pergunta que foi escolhido
                        if (per.get(0).equals("Qual a geraçao de computadores que estamos atualmente?")) {
                            //Chama a função que adiciona a resposta ao array de resposta
                            res = colocaRes("Quinta Geração\n", "Sexta Gereção\n", "Setima Geração\n", null, null);
                            rC = "Sexta Gereção\n";
                        } else if (per.get(0).equals("Onde foi inventado o sistema de numeraçao decimal?")) {
                            //Chama a função que adiciona a resposta ao array de resposta
                            res = colocaRes("Italia(Roma)\n", "Egito\n", "India\n", null, null);
                            rC = "Italia(Roma)\n";
                        } else if (per.get(0).equals("Quem é considerado o Pai da Computaçao?")) {
                            //Chama a função que adiciona a resposta ao array de resposta
                            res = colocaRes("Patolino o mago supremo\n", "Charles Babbage\n", "Allan Turing\n", null, null);
                            rC = "Allan Turing\n";
                        }

                        //Embaralhamento das respostas.
                        Collections.shuffle(res);
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 20);
                        //Puxando as funções que executam e testam as perguntas
                        escolhaRes = Perg(per, res);
                        controleAcerto = Res(controleAcerto, escolhaRes, res, rC, dano1);

                        //Remoção do conteudo do array, para não ocorrer repetição no shuffle
                        //e para que os arrays sejam reutilizados em outras perfuntas
                        per.clear();
                        res.clear();
                    }
                    controleAcerto = false;
                    exibirTexto("=========================================================================\n", TimeUnit.MILLISECONDS, 20);
                    exibirTexto("Após enfrentar o primeiro desafio da Dungeon dos Enigmas,\n"
                            + "Patolino sentia uma mistura de alívio e empolgação.\n"
                            + "Seus olhos brilhavam ao desvendar os intricados enigmas que bloqueavam seu caminho.\n"
                            + " Agora, ele estava mais confiante do que nunca.\n" 
                            +"A vitória lhe deu um impulso de energia,\n"
                            +"alimentando sua determinação para superar os obstáculos restantes.\n"
                            +"Patolino olha para o lado e vê uma passagem se abrindo,\n"
                            +"chegando na frente da passagem vê uma escada, e começa\n"
                            +" a descela, chegando ao proximo andar da dungeon."
                            +"lá ele vê uma cena igual ao andar anterior, um lugar vazio com"
                            +"um monolito, após decifrar o codigo novamente ele viu a pergunta:", TimeUnit.MILLISECONDS, 20);
                    exibirTexto("~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~\n", TimeUnit.MILLISECONDS, 20);
                    //FASE 2
                    while (controleAcerto == false && vida > 0) {
                        escolhaRes = null;
                        rC = null;
                        per.add("O numero 11001110 no sistema binario representa qual algarismo em decimal?");
                        per.add("O numero 77 em decimal resulta em qual resultado na forma Binaria?");
                        per.add("Converta o numero 2306 para octal e depois para hexadecimal:");
                        Collections.shuffle(per);
                        Collections.shuffle(per);
                        if (per.get(0).equals("O numero 11001110 no sistema binario representa qual algarismo em decimal?")) {
                            res = colocaRes("206\n", "156\n", "512\n", null, null);
                            rC = "206\n";
                        } else if (per.get(0).equals("O numero 77 em decimal resulta em qual resultado na forma Binaria?")) {
                            res = colocaRes("1001011\n", "11000100\n", "1001101\n", null, null);
                            rC = "1001101\n";
                        } else if (per.get(0).equals("Converta o numero 2306 para octal e depois para hexadecimal:")) {
                            res = colocaRes("4512 e 2CA\n", "4402 e FFF6\n", "4402 e 902\n", null, null);
                            rC = "4402 e 902\n";
                        }
                        Collections.shuffle(res);
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 20);
                        escolhaRes = Perg(per, res);
                        controleAcerto = Res(controleAcerto, escolhaRes, res, rC, dano1);
                        per.clear();
                        res.clear();
                    }
                    controleAcerto = false;
                    exibirTexto("=========================================================================\n", TimeUnit.MILLISECONDS, 20);
                     exibirTexto("Após enfrentar outro desafio da Dungeon dos Enigmas,\n"
                            +"Patolino vê novamente outra passagem se abrindo,\n"
                            +"chegando na frente da passagem vê uma escada, e começa\n"
                            +" a descela, chegando ao proximo andar da dungeon.\n"
                            +"lá ele vê uma cena igual ao andar anterior, um lugar vazio com\n"
                            +"um monolito, após decifrar o codigo novamente ele viu a pergunta:\n", TimeUnit.MILLISECONDS, 20);
                    exibirTexto("~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~\n", TimeUnit.MILLISECONDS, 20);
                    //FASE 3
                    while (controleAcerto == false && vida > 0) {
                        escolhaRes = null;
                        rC = null;
                        per.add("Qual o resultado da operação booleana (AND) entre as variáveis x e y?");
                        per.add("Qual o resultado da operação booleana (OR) entre as variáveis winner e looser?");
                        per.add("Qual a negação da expressão booleana (x AND y)?");
                        Collections.shuffle(per);
                        Collections.shuffle(per);
                        if (per.get(0).equals("Qual o resultado da operação booleana (AND) entre as variáveis x e y?")) {
                            res = colocaRes("x && y\n", "x || y\n", "!x\n", null, null);
                            rC = "x && y\n";
                        } else if (per.get(0).equals("Qual o resultado da operação booleana (OR) entre as variáveis winner e looser?")) {
                            res = colocaRes("winner && looser.\n", "!winner\n", "winner || looser\n", null, null);
                            rC = "winner || looser\n";
                        } else if (per.get(0).equals("Qual a negação da expressão booleana (x AND y)?")) {
                            res = colocaRes("!(x && y)\n", "!(x || y)\n", "!(x)\n", null, null);
                            rC = "!(x && y)\n";
                        }
                        Collections.shuffle(res);
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 20);
                        escolhaRes = Perg(per, res);
                        controleAcerto = Res(controleAcerto, escolhaRes, res, rC, dano1);
                        per.clear();
                        res.clear();
                    }
                    controleAcerto = false;
                    exibirTexto("=========================================================================\n", TimeUnit.MILLISECONDS, 20);
                    exibirTexto("Após enfrentar outro desafio da Dungeon dos Enigmas,\n"
                            +"Patolino vê novamente outra passagem se abrindo,\n"
                            +"chegando na frente da passagem vê uma escada, e começa\n"
                            +" a descela, chegando ao proximo andar da dungeon.\n"
                            +"lá ele vê uma cena igual ao andar anterior, um lugar vazio com\n"
                            +"um monolito, após decifrar o codigo novamente ele viu a pergunta:\n", TimeUnit.MILLISECONDS, 20);
                    exibirTexto("~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~\n", TimeUnit.MILLISECONDS, 20);
                    //FASE 4
                    while (controleAcerto == false && vida > 0) {
                        escolhaRes = null;
                        rC = null;
                        per.add("Qual tipo de informação é representada pelos dados mantidos pelos hospitais e organizações de assistência à saúde?");
                        per.add("Qual é o resultado da função E (AND) quando duas chaves estão fechadas e uma está aberta, e a lâmpada só acende se todas as chaves estiverem fechadas?");
                        per.add("Qual é o resultado da função NOT aplicada à variável binária A quando A é igual a 0?");
                        Collections.shuffle(per);
                        Collections.shuffle(per);
                        if (per.get(0).equals("Qual tipo de informação é representada pelos dados mantidos pelos hospitais e organizações de assistência à saúde?")) {
                            res = colocaRes("Dados de desempenho financeiro\n", "Dados de recursos humanos\n",
                                    "Dados de inventário\n", "Dados médicos dos pacientes \n", null);
                            rC = "Dados médicos dos pacientes \n";
                        } else if (per.get(0).equals("Qual é o resultado da função E (AND) quando duas chaves estão fechadas e uma está aberta, "
                                + "e a lâmpada só acende se todas as chaves estiverem fechadas?")) {
                            res = colocaRes("A lâmpada queima\n", "A lâmpada acende\n",
                                    "A lâmpada fica piscando\n", "A lâmpada permanece apagada\n", null);
                            rC = "A lâmpada permanece apagada\n";
                        } else if (per.get(0).equals("Qual é o resultado da função NOT aplicada à variável binária A quando A é igual a 0?")) {
                            res = colocaRes("0\n", "A\n", "1\n", "Não é possível determinar o resultado apenas com essa informação\n", null);
                            rC = "1\n";
                        }
                        Collections.shuffle(res);
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 20);
                        escolhaRes = Perg(per, res);
                        controleAcerto = Res(controleAcerto, escolhaRes, res, rC, dano1);
                        per.clear();
                        res.clear();
                    }
                    controleAcerto = false;
                    exibirTexto("=========================================================================\n", TimeUnit.MILLISECONDS, 20);
                    exibirTexto("Após enfrentar outro desafio da Dungeon dos Enigmas,\n"
                            +"Patolino vê novamente outra passagem se abrindo,\n"
                            +"chegando na frente da passagem vê uma escada, e começa\n"
                            +" a descela, chegando ao proximo andar da dungeon.\n"
                            +"lá ele vê uma cena igual ao andar anterior, um lugar vazio com\n"
                            +"um monolito, após decifrar o codigo novamente ele viu a pergunta:\n", TimeUnit.MILLISECONDS, 20);
                    exibirTexto("~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~\n", TimeUnit.MILLISECONDS, 20);
                    //FASE 5
                    while (controleAcerto == false && vida > 0) {
                        escolhaRes = null;
                        rC = null;
                        per.add("Indique a informacao correta sobre as gerações de computadores");
                        per.add("Qual foi o primeiro computador da historia?");
                        per.add("O que compoe o Sistema de Informação?");
                        Collections.shuffle(per);
                        Collections.shuffle(per);
                        if (per.get(0).equals("Indique a informacao correta sobre as gerações de computadores")) {
                            res = colocaRes("Microprocessador primeira geração\n", "Transistor quarta geração\n",
                                    "Leitura fotoeletrica terceira geração\n", "Diagramaçao segunda geração\n", "Bill Gates/Microsoft quinta geração\n");
                            rC = "Bill Gates/Microsoft quinta geração\n";
                        } else if (per.get(0).equals("O que compoe o Sistema de Informação?")) {
                            res = colocaRes("Software, Hardware, Pacote office, Licensa do Windows\n", "Software, Hardware, Banco de dados, Redes, Curto circuitos\n",
                                    "Software, Malware, Optimusprimeware\n", "Software, Reprodutor, Biblioteca, Lixeira\n",
                                    "Software, Hardware, Procedimentos, Redes, Pessoas, Banco de dados\n");
                            rC = "Software, Hardware, Procedimentos, Redes, Pessoas, Banco de dados\n";
                        } else if (per.get(0).equals("Qual foi o primeiro computador da historia?")) {
                            res = colocaRes("Eniac\n", "Mark I\n",
                                    "Colossus \n", "Edvac\n", "IBM 7090\n");
                            rC = "Eniac\n";
                        }
                        Collections.shuffle(res);
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 20);
                        escolhaRes = Perg(per, res);
                        controleAcerto = Res(controleAcerto, escolhaRes, res, rC, dano1);
                        per.clear();
                        res.clear();
                    }
                    controleAcerto = false;
                    exibirTexto("=========================================================================\n", TimeUnit.MILLISECONDS, 20);
                    exibirTexto("Após enfrentar outro desafio da Dungeon dos Enigmas,\n"
                            +"Patolino vê novamente outra passagem se abrindo,\n"
                            +"chegando na frente da passagem vê uma escada, e começa\n"
                            +" a descela, chegando ao proximo andar da dungeon.\n"
                            +"lá ele vê uma cena igual ao andar anterior, um lugar vazio com\n"
                            +"um monolito, após decifrar o codigo novamente ele viu a pergunta:\n", TimeUnit.MILLISECONDS, 20);
                    exibirTexto("~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~\n", TimeUnit.MILLISECONDS, 20);
                    //FASE 6
                    while (controleAcerto == false && vida > 0) {
                        escolhaRes = null;
                        rC = null;
                        per.add("Determine o número que representa (111001111010) no sistema decimal:");
                        per.add("Determine o número que representa  (347) no sistema binário:");
                        per.add("Determine o número que representa (101011100) no sistema Hexadecimal: ");
                        Collections.shuffle(per);
                        Collections.shuffle(per);
                        if (per.get(0).equals("Determine o número que representa (111001111010) no sistema decimal:")) {
                            res = colocaRes("3722\n", "3200\n",
                                    "3711\n", "3706\n", "3705\n");
                            rC = "3706\n";
                        } else if (per.get(0).equals("Determine o número que representa  (347) no sistema binário:")) {
                            res = colocaRes("100011000\n", "011010111\n",
                                    "000110110\n", "110110101\n", "011100111\n");
                            rC = "011100111\n";
                        } else if (per.get(0).equals("Determine o número que representa (101011100) no sistema Hexadecimal: ")) {
                            res = colocaRes("16C\n", "14D\n",
                                    "FF\n", "15C\n", "CA\n");
                            rC = "15C\n";
                        }
                        Collections.shuffle(res);
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 20);
                        escolhaRes = Perg(per, res);
                        controleAcerto = Res(controleAcerto, escolhaRes, res, rC, dano1);
                        per.clear();
                        res.clear();
                    }
                    controleAcerto = false;
                    exibirTexto("=========================================================================\n", TimeUnit.MILLISECONDS, 20);
                    exibirTexto("Após enfrentar outro desafio da Dungeon dos Enigmas,\n"
                            +"Patolino vê novamente outra passagem se abrindo,\n"
                            +"chegando na frente da passagem vê uma escada, e começa\n"
                            +" a descela, chegando ao proximo andar da dungeon.\n"
                            +"lá ele vê uma cena igual ao andar anterior, um lugar vazio com\n"
                            +"um monolito, após decifrar o codigo novamente ele viu a pergunta:\n", TimeUnit.MILLISECONDS, 20);
                    exibirTexto("~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~\n", TimeUnit.MILLISECONDS, 20);
                    //FASE 7
                    while (controleAcerto == false && vida > 0) {
                        escolhaRes = null;
                        rC = null;
                        per.add("Qual é o resultado da função OU (OR) quando duas chaves estão fechadas e uma está aberta, "
                                + "e a lâmpada acende se pelo menos uma chave estiver fechada?");
                        per.add("Qual é o resultado da expressão booleana (a && b) !OR (c && d) ?");
                        per.add("\"Qual é o símbolo utilizado para a operação lógica AND?\"");
                        Collections.shuffle(per);
                        Collections.shuffle(per);
                        if (per.get(0).equals("Qual é o resultado da função OU (OR) quando duas chaves estão fechadas e uma está aberta, "
                                + "e a lâmpada acende se pelo menos uma chave estiver fechada?")) {
                            res = colocaRes("A lâmpada permanece apagada\n", "A lâmpada acende\n",
                                    "A lâmpada fica piscando\n", "A lâmpada queima\n", "Não é possível determinar sem saber o estado atual da lâmpada\n");
                            rC = "A lâmpada acende\n";
                        } else if (per.get(0).equals("Qual é o resultado da expressão booleana (a && b) !OR (c && d) ?")) {
                            res = colocaRes("Verdadeiro\n", "Falso\n", "Depende dos valores de p, a, t , o\n",
                                    "Não é possível determinar\n", "Nenhum dos anteriores\n");
                            rC = "\n";
                        } else if (per.get(0).equals("\"Qual é o símbolo utilizado para a operação lógica AND?\"")) {
                            res = colocaRes("&&\n", "||\n",
                                    "!\n", "&\n", "|||\n");
                            rC = "&&\n";
                        }
                        Collections.shuffle(res);
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 20);
                        escolhaRes = Perg(per, res);
                        controleAcerto = Res(controleAcerto, escolhaRes, res, rC, dano1);
                        per.clear();
                        res.clear();
                    }controleAcerto = false;
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 20);

                        exibirTexto("Após enfrentar outro desafio da Dungeon dos Enigmas,\n"
                            +"Patolino vê novamente outra passagem se abrindo,\n"
                            +"chegando na frente da passagem vê uma escada, e começa\n"
                            +" a descela, chegando ao proximo andar da dungeon.\n"
                            +"Ao chegar neste andar algo está diferente, em meio a escuridão,\n"
                            + "uma luz, dourada e cintilante, se mexendo?\n"
                            + "\n"  
                            +"Patolino: O diploma doura... Pera por que ele está se movendo?¿\n" , TimeUnit.MILLISECONDS, 20);
                        exibirTexto("~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~\n", TimeUnit.MILLISECONDS, 20);
                        exibirTexto("Patolino: (confuso) Ei! Pare aí! Esse Diploma Dourado é meu!\n" 
                                +"\n" 
                                +"Unknow: (sorrindo maliciosamente) Patolino, meu caro, você está um passo atrás.\n"
                                + "Eu já o encontrei e logo serei o Mago Supremo!\n" 
                                +"\n" 
                                +"Patolino:(consfuso) Marciano? o que voc...\n"
                                +"Patolino: (determinado) Você acha que será fácil assim, Marciano!\n"
                                + "Eu não vou deixar você fugir com o que é meu por direito.\n"
                                + "Prepare-se para ser alcançado!\n" 
                                +"\n" 
                                +"Marvin: (zombando) Ah, que engraçadinho! Você acha que pode me deter?\n"
                                + "Sou um mestre em fugas intergalácticas!\n" 
                                +"\n" 
                                +"Patolino: (ativando sua astúcia) Eu posso não ter sua tecnologia espacial,\n"
                                + "Marciano, mas tenho uma mente afiada e uma determinação inabalável.\n "
                                + "Vou te perseguir até o fim da galáxia, se for preciso!\n" 
                                +"\n" 
                                +"Marvin: (rindo sarcasticamente) Vamos ver do que você é capaz, Patolino!\n"
                                +" Será divertido ver você tentando me acompanhar.\n", TimeUnit.MILLISECONDS, 20);
                    //ULTIMA FASE
                    while (vida > 0 && controleAcerto == false) {
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 20);
                        controleAcerto = ultimaFase(dano2);
                        }
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 20);
                        exibirTexto("~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~\n", TimeUnit.MILLISECONDS, 20);
                       
                        
                    //Condicional final que diz se o usuario finalizou o jogo ou morreu
                    if (vida <= 0) {
                        exibirTexto("*___________GAME OVER___________*",TimeUnit.MILLISECONDS, 20);
                    } else if (pontos >= 9) { 
                        exibirTexto("Patolino: (chegando à presença de Celestia,\n "
                                + " com orgulho) Celestia, aqui está o tão desejado Diploma Dourado! \n"
                                + "Eu o conquistei, enfrentando desafios incríveis e superando todas as adversidades.\n" +
                                "\n" +
                                "Celestia: (sorrindo, impressionada) Patolino, você provou ser um verdadeiro mago! \n"
                                + "Estou orgulhosa de sua coragem e determinação para alcançar o poder supremo. \n"
                                + "Agora, entregue-me o Diploma Dourado para que eu possa testemunhar sua ascensão como o Mago Supremo.\n" +
                                "\n" +
                                "(Patolino entrega solenemente o Diploma Dourado para Celestia, \n"
                                + "sentindo uma mistura de emoções, desde alegria até nervosismo.)\n" +
                                "\n" +
                                "Patolino: (com voz trêmula) Este é um momento que eu esperei durante toda a minha jornada. \n"
                                + "Celestia, prometo usar o poder que o Diploma Dourado me confere com responsabilidade e sabedoria. \n"
                                + "Farei de tudo para proteger e guiar aqueles que precisam.\n" +
                                "\n" +
                                "Celestia: (colocando a mão no ombro de Patolino, com ternura) Patolino, confio em suas habilidades e no seu compromisso em fazer o bem.\n"
                                + " Com o Diploma Dourado em suas mãos, você se torna o Mago Supremo, capaz de trazer equilíbrio e justiça ao mundo mágico.\n" +
                                "\n" +
                                "Patolino: (determinado) Não vou decepcioná-la, Celestia. Usarei meu poder para defender os oprimidos, \n"
                                + "promover a paz e ajudar a criar um futuro melhor para todos.\n" +
                                "\n" +
                                "Celestia: (sorrindo orgulhosamente) Tenho certeza de que você fará exatamente isso, Patolino. \n"
                                + "Parabéns por essa conquista extraordinária. \n"
                                + "Agora, o mundo mágico tem um novo guardião, o Mago Supremo Patolino!\n" +
                                "\n" +
                                "(Patolino sente uma onda de gratidão e responsabilidade enquanto abraça sua nova posição como Mago Supremo. \n"
                                + "Com Celestia ao seu lado, ele sabe que terá o apoio necessário para cumprir seu destino e proteger o reino mágico.)\n", TimeUnit.MILLISECONDS, 20);
                        exibirTexto("\n\n*______________Fim_______________\n\n*",TimeUnit.MILLISECONDS, 20);
                    }

                } while (vida > 0 && pontos < 9);
            }
        } while (escolhaMenu != 4);
        entry.close();
    }
}

