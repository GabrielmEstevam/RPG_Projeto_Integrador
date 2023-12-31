/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projetointegradorgame;

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
public class jogo {

    static int tentativa;
    static int vida;
    static int pontos;

    //Exibe o texto como se fosse um comando de print, só que com ajuste no tempo de cada palavra, letra ou frase
    static void exibirTexto(String texto, TimeUnit unit, long tempo_mensagem) {
        try {
            Digita(texto, unit, tempo_mensagem);
        } catch (InterruptedException e) {
            // Tratar interrupções
        }
    }

    //conjunto do exibirTexto
    static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
        }
    }

    //Função que imprime o menu e recebe a escolha do usuario
    static char menu(char escolhaMenu) {
        Scanner entry = new Scanner(System.in);
        exibirTexto("------------------------------------------------------------\n", TimeUnit.MILLISECONDS, 25);
        exibirTexto("\n                       MENU        \n  ", TimeUnit.MILLISECONDS, 25);
        exibirTexto("1 - Instruções\n  ", TimeUnit.MILLISECONDS, 25);
        exibirTexto("2 - Jogar\n  ", TimeUnit.MILLISECONDS, 25);
        exibirTexto("3 - Créditos\n  ", TimeUnit.MILLISECONDS, 25);
        exibirTexto("4 - Sair\n  ", TimeUnit.MILLISECONDS, 25);
        exibirTexto("Insira uma das opções: ", TimeUnit.MILLISECONDS, 25);
        escolhaMenu = entry.next().charAt(0);
        exibirTexto("------------------------------------------------------------\n", TimeUnit.MILLISECONDS, 25);

        return escolhaMenu;
    }

    //Função para dar a opção do usuario voltar ao menu
    static void voltaMenu(String escolha, String frase) {
        Scanner entry = new Scanner(System.in);
        do {
            System.out.println(frase + "\n\n");
            escolha = entry.next();

            if (escolha.equalsIgnoreCase("0")) {
                exibirTexto("Voltando ao menu...\n\n  ", TimeUnit.MILLISECONDS, 25);
            } else {
                exibirTexto("Operação invalida.\\nTente novamente.\\n\n  ", TimeUnit.MILLISECONDS, 25);
            }
        } while (!escolha.equalsIgnoreCase("0"));
    }

    //Função que dita o que acontece baseado na esolha que o usuario fez no menu
    static void tripasMenu(char mChoice) {
        String insChoice = null;
        switch (mChoice) {

            case '1' -> {
                System.out.println("\n\nAs regras são...\n\n");
                voltaMenu(insChoice, "Insira o numero 0 para voltar ao menu.");
            }

            case '2'-> {
                System.out.println("\n\n\nBem-vindo a MagnoHeinn\n\n\n");
                exibirTexto(" Em uma terra muito muito distante, um jovem chamado Patolino deseja possuir a alcunha mais almejada, O Mago Supremo, mas \r\n"
                		+ "como qualquer coisa que valha a pena, essa não será uma tarefa fácil. \r\n"
                		+ "  O Mago Supremo é aquele que recebe a bênção da fada Rainha Celestia, e após estudar durante anos Patolino deixará de ser um simples jovem \r\n"
                		+ "e para se tornar um jovem sábio, e após se sentir confiante decidiu ir até Celestia. \r\n"
                		+ "  Assim Patolino saiu em sua jornada, uma jornada que por mais simples que fosse, não pode ser considerada fácil, mas esse jovem é tão destemido \r\n"
                		+ "quanto era determinado, sua jornada consistia em atravessar 4 reinos para chegar ao reino das fadas, e assim patolino o fez, \r\n"
                		+ "saindo de Midgard passou pelas terras congeladas Niflheim um lugar onde mal se pode respirar já que seus pulmões podem congelar, com\r\n"
                		+ "sua temperatura praticamente no zero absoluto, logo em sequência Jotunheim terras gélidas não tão geladas quanto \r\n"
                		+ "Niflheim mas definitivamente não menos perigosas, onde teve que se esgueirar dos gigantes que o cercava, sem ser notado ou seria estraçalhado"
                		+ ", sabendo que sairia daquele horrendo buraco de gelo para um lugar mais quente \r\n"
                		+ "Patolino se animou, mas para sua completa decepção o próximo reino era Muspelheim, que não era simplesmente um lugar quente, ele \r\n"
                		+ "era coberto de magma, mas isso não o importava já que todos esses perrengues valeriam a pena, faltava apenas um reino, \r\n"
                		+ "mas que não seria mais simples do que os outros, pelo contrário, fadas são seres da floresta, que vivem lado a lado com elfos, mas não \r\n"
                		+ "existem apenas fadas boas que dão bênçãos e elfos de cabelos dourados e olhos verdes, essas raças tambem possuem algo como \r\n"
                		+ "um lado sombio, e lá estava naquele reino Svartalfheim a morada dos elfos negos e dos leprechaum, uma terra onde quem tentasse\r\n"
                		+ " passar por lá seria amaldiçoado pelos leprechaum ou mortos pelos elfos negros, nada bobo Patolino pegou o caminho longo, dando a volta\r\n"
                		+ " pela borda da floresta sombria, isso não era simples ou facil mas por sorte ou destino ele foi capaz de atravessar aquela \r\n"
                		+ "horripilante floresta. Para finalmente após uma longa, longa jornada se ver em uma linda floresta, um ar limpo, e uma sensação \r\n"
                		+ "de acolhimento, e lá estava Álfheim.\n\n",TimeUnit.MILLISECONDS, 5);
            }
            case '3' -> {
                exibirTexto("\n\nCriado por...\n\n", TimeUnit.MILLISECONDS, 25);
                voltaMenu(insChoice, "Insira o numero 0 para voltar ao menu.");
            }
            case '4' ->{
                exibirTexto("\n\nEncerrando...\n\n", TimeUnit.MILLISECONDS,25);
                System.exit(0);}
            default ->
                exibirTexto("\n\nOpção invalida\n\nInsira uma opção valida...\n\n", TimeUnit.MILLISECONDS,25);
        }
    }

    //Função que faz o print das perguntas e recebe e retorna e a resposta dada pelo usuario
    static String Perg(List<String> per, List<String> res) {
        Scanner entry = new Scanner(System.in);
        String escolhaRes;
        //exibe uma das perguntas que estão no array
        exibirTexto(per.get(0), TimeUnit.MILLISECONDS, 25);
        // faz o print da quantidade minima possivel de respostas
        exibirTexto("\na) ", TimeUnit.MILLISECONDS, 25);
        exibirTexto(res.get(0), TimeUnit.MILLISECONDS, 25);
        exibirTexto("b) ", TimeUnit.MILLISECONDS, 25);
        exibirTexto(res.get(1), TimeUnit.MILLISECONDS, 25);
        exibirTexto("c) ", TimeUnit.MILLISECONDS, 25);
        exibirTexto(res.get(2), TimeUnit.MILLISECONDS, 25);
        //condicional que adiciona mais respostas caso hajam mais
        if (res.size() == 4) {
            exibirTexto("d) ", TimeUnit.MILLISECONDS, 25);
            exibirTexto(res.get(3), TimeUnit.MILLISECONDS, 25);
        } else if (res.size() == 5) {
            exibirTexto("d) ", TimeUnit.MILLISECONDS, 25);
            exibirTexto(res.get(3), TimeUnit.MILLISECONDS, 25);
            exibirTexto("e) ", TimeUnit.MILLISECONDS, 25);
            exibirTexto(res.get(4), TimeUnit.MILLISECONDS, 25);
        }
        exibirTexto("Insira sua resposta: ", TimeUnit.MILLISECONDS, 25);
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
                exibirTexto("Resposta invalida tente novamente.\n\n",TimeUnit.MILLISECONDS,25);
        }
        return controleAcerto;
    }
    //Função complementar da função Res

    static boolean tripasRes(boolean controleAcerto, List<String> res, String resC, int get, int dano) {
        if (res.get(get).equals(resC)) {
            System.out.println("resposta correta");
            controleAcerto = true;
            pontos++;
        } else {
            exibirTexto("Resposta incorreta.\n", TimeUnit.MILLISECONDS, 25);
            subDano(dano);
            exibirTexto("Você perdeu " + dano + " de vida.\nVida: " + vida + "\n", TimeUnit.MILLISECONDS, 25);
            exibirTexto("pontos: " + pontos, TimeUnit.MILLISECONDS, 25);

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
                System.out.println("em qual andar martin está\n");
                int numAleatorio = aleatorio.nextInt(6)+1;    
                while(vida>0){                 
                    System.out.print("\nInsira o andar: ");
                    int chutePlayer = entry.nextInt(); 
                        if ((chutePlayer!=numAleatorio)&&(chutePlayer+1!=numAleatorio)&&(chutePlayer-1!=numAleatorio)){
                            System.out.println("droga ele não está aqui");
                            subDano(dano);
                        } else if((chutePlayer+1==numAleatorio)||(chutePlayer-1==numAleatorio)){
                            System.out.println("Ele está por perto.");
                            subDano(dano);
                        } else {
                            System.out.println("\nte achei\n");
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
                tentativa = 0;
                do {
                    /*Este loop  será usado para a execusão das fases do jogo
                    * caso o usuario não acerte a questão antes de perder toda a vida ele voltara ao menu
                    * e no caso de ele acertar será direcionado a proxima fase(proximo loop while)*/
                    //FASE 1
                    //Reiniciando variavel de controle
                    exibirTexto("~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~\n", TimeUnit.MILLISECONDS, 25);
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
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 25);
                        //Puxando as funções que executam e testam as perguntas
                        escolhaRes = Perg(per, res);
                        controleAcerto = Res(controleAcerto, escolhaRes, res, rC, dano1);

                        //Remoção do conteudo do array, para não ocorrer repetição no shuffle
                        //e para que os arrays sejam reutilizados em outras perfuntas
                        per.clear();
                        res.clear();
                    }
                    controleAcerto = false;
                    exibirTexto("=========================================================================\n", TimeUnit.MILLISECONDS, 25);
                    exibirTexto("~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~\n", TimeUnit.MILLISECONDS, 25);
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
                            res = colocaRes("206\n", "256\n", "512\n", null, null);
                            rC = "206\n";
                        } else if (per.get(0).equals("O numero 77 em decimal resulta em qual resultado na forma Binaria?")) {
                            res = colocaRes("1001011\n", "11000100\n", "1001101\n", null, null);
                            rC = "1001101\n";
                        } else if (per.get(0).equals("Converta o numero 2306 para octal e depois para hexadecimal:")) {
                            res = colocaRes("4512 e 2CA\n", "4402 e FFF6\n", "4402 e 902\n", null, null);
                            rC = "4402 e 902\n";
                        }
                        Collections.shuffle(res);
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 25);
                        escolhaRes = Perg(per, res);
                        controleAcerto = Res(controleAcerto, escolhaRes, res, rC, dano1);
                        per.clear();
                        res.clear();
                    }
                    controleAcerto = false;
                    exibirTexto("=========================================================================\n", TimeUnit.MILLISECONDS, 25);
                    exibirTexto("~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~\n", TimeUnit.MILLISECONDS, 25);
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
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 25);
                        escolhaRes = Perg(per, res);
                        controleAcerto = Res(controleAcerto, escolhaRes, res, rC, dano1);
                        per.clear();
                        res.clear();
                    }
                    controleAcerto = false;
                    exibirTexto("=========================================================================\n", TimeUnit.MILLISECONDS, 25);
                    exibirTexto("~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~\n", TimeUnit.MILLISECONDS, 25);
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
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 25);
                        escolhaRes = Perg(per, res);
                        controleAcerto = Res(controleAcerto, escolhaRes, res, rC, dano1);
                        per.clear();
                        res.clear();
                    }
                    controleAcerto = false;
                    exibirTexto("=========================================================================\n", TimeUnit.MILLISECONDS, 25);
                    exibirTexto("~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~\n", TimeUnit.MILLISECONDS, 25);
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
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 25);
                        escolhaRes = Perg(per, res);
                        controleAcerto = Res(controleAcerto, escolhaRes, res, rC, dano1);
                        per.clear();
                        res.clear();
                    }
                    controleAcerto = false;
                    exibirTexto("=========================================================================\n", TimeUnit.MILLISECONDS, 25);
                    exibirTexto("~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~\n", TimeUnit.MILLISECONDS, 25);
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
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 25);
                        escolhaRes = Perg(per, res);
                        controleAcerto = Res(controleAcerto, escolhaRes, res, rC, dano1);
                        per.clear();
                        res.clear();
                    }
                    controleAcerto = false;
                    exibirTexto("=========================================================================\n", TimeUnit.MILLISECONDS, 25);
                    exibirTexto("~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~~~~//~~~~~~~~~~~//~~~~~~~~~~\n", TimeUnit.MILLISECONDS, 25);
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
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 25);
                        escolhaRes = Perg(per, res);
                        controleAcerto = Res(controleAcerto, escolhaRes, res, rC, dano1);
                        per.clear();
                        res.clear();
                    }controleAcerto = false;
                        exibirTexto("\n=========================================================================\n", TimeUnit.MILLISECONDS, 25);


                    //ULTIMA FASE
                    if (tentativa < 4) {
                        while (vida > 0 && controleAcerto == false) {
                            controleAcerto = ultimaFase(dano2);
                        }
                    }

                    //Condicional final que diz se o usuario finalizou o jogo ou morreu
                    if (vida <= 0) {
                        System.out.println("*___________GAME OVER___________*");
                    } else if (pontos >= 7) {
                        System.out.println("*______________Fim_______________*");
                    }

                } while (vida > 0 && pontos < 7);
            }
        } while (escolhaMenu != 4);
        entry.close();
    }
}