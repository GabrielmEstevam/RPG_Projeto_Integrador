package jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;


public class Main {

    static void getRes(int points, int life, boolean vCont, String f, String res0, String res1, String res2, String resC) {
        vCont = false;
        switch (f) {
            case "a":
            case "A":
                if (res0.equals(resC)) {
                    System.out.println("resposta correta");
                    vCont = true;
                    break;
                } else {
                    System.out.println("resposta incorreta");
                }
                break;
            case "b":
            case "B":
                if (res1.equals(resC)) {
                    System.out.println("resposta correta");
                    vCont = true;
                } else {
                    System.out.println("resposta incorreta");
                }
                break;
            case "c":
            case "C":
                if (res2.equals(resC)) {
                    System.out.println("resposta correta");
                    vCont = true;
                    break;
                } else {
                    System.out.println("resposta incorreta");
                }
                break;
            default:
                System.out.println("Resposta invalida tente novamente.");
        }
    }

    static boolean perg(int points, int life, String f, String per, String per0, String res0, String res1, String res2, String resC) {
        boolean vCont = false;
        do {
            if (per == per0) {
                System.out.println(per);
                System.out.println("a)" + res0
                        + "\nb)" + res1
                        + "\nc)" + res2
                        + "\n\n");
                getRes(points, life, vCont, f, res0, res1, res2, resC);
            }
        } while (vCont == false);
    return vCont;
    }
    

    static void menuGuts(int mChoice, int life, int points) {
        String insChoice = null;
        switch (mChoice) {

            case 1:
                System.out.println("\n\nAs regras são...\n\n");
                yANDn(insChoice, "Deseja continuar lendo as instruções? [Y/N]", "Lendo as Instuções.");
                break;

            case 2:
                System.out.println("\n\n\nBem-vindo a MagnoHeinn\n\n\n");
                System.out.println("Um mundo de Magia da Computação, onde a tecnologia e a magia se fundem em um só.\n"
                        + "Nosso herói, Patolino, é um mago que se dedica a dominar a arte da programação e dos algoritmos.\n"
                        + "Ele é conhecido por ser um dos melhores magos da computação do reino, mas ele não está satisfeito com o seu status atual.\n"
                        + "Ele quer se tornar o maior mago da computação que já existiu, e para isso, ele precisa encontrar o lendário Diploma Dourado.\n\n");
            case 3:
                System.out.println("\n\nCriado por...\n\n");
                yANDn(insChoice, "Deseja continuar lendo os créditos? [Y/N]", "Lendo as instruções.");
                break;
            case 4:
                System.out.println("\n\nEncerrando...\n\n");
                break;
            default:
                System.out.println("\n\nOpção invalida\n\nInsira uma opção valida...\n\n");
        }
    }

    static int menu(int mChoice) {
        Scanner entry = new Scanner(System.in);

        System.out.println("          MENU          ");
        System.out.println("1 - Instruções");
        System.out.println("2 - Jogar");
        System.out.println("3 - Créditos");
        System.out.println("4 - Sair");
        System.out.print("Insira uma das opções: ");
        mChoice = entry.nextInt();
        return mChoice;
    }

    static void yANDn(String choice, String phrase1, String phrase2) {
        Scanner entry = new Scanner(System.in);
        do {
            System.out.println(phrase1 + "\n\n");
            choice = entry.next();

            if (choice.equalsIgnoreCase("N")) {
                System.out.println("Voltando ao menu...\n\n");
            } else if (choice.equalsIgnoreCase("Y")) {
                System.out.println(phrase2 + "\n\n");
            } else {
                System.out.println("operação invalida.\nTente novamente.\n\n");
            }
        } while (choice.equalsIgnoreCase("Y"));
    }

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int mChoice = 0; 
        int mEnt;
        int life, dam1, dam2, dam3, points;
        String f1;
        life = 100;
        dam1 = 10;
        dam2 = 25;
        dam3 = 30;
        points = 0;

        List per = new ArrayList();
        per.add("p1");
        per.add("p2");
        per.add("p3");

        List resP1 = new ArrayList();
        resP1.add("p1r1");//resposta correta
        resP1.add("p1r2");
        resP1.add("p1r3");

        List resP2 = new ArrayList();
        resP2.add("p2r1");
        resP2.add("p2r2");
        resP2.add("p2r3");//respost correta

        List resP3 = new ArrayList();
        resP3.add("p3r1");
        resP3.add("p3r2");
        resP3.add("p3r3");//resposta correta

        do {
            mEnt = menu(mChoice);
            menuGuts(mEnt, life, points);
        } while (mEnt != 4 || life <= 0);
        entry.close();
    }
}
