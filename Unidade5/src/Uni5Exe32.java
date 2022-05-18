package Unidade5;

import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int vazio = 0;
        int p = 0;
        int n = 0;
        int contador = 1;
        int linha = 1;
        int coluna = 1;
        System.out.println("Em que dia da semana cai o primeiro dia do mês?");
        p = tec.nextInt();
        System.out.println("Quantos dias tem o mês?");
        n = tec.nextInt();
        coluna = p;
        System.out.println("   D      S      T      Q      Q      S      S");
        while (contador <= n) {
            while (linha < 6) {
                while (coluna <= 7) {
                    while (vazio < p) {
                        if (vazio == p - 1) {
                            System.out.printf("   ");
                        } else {
                            System.out.printf("      ");
                        }
                        vazio++;
                    }
                    if (contador <= n) {
                        System.out.printf("   " + contador + "   ");
                        coluna++;
                        contador++;
                    }
                }
                System.out.println("\n");
                linha++;
                coluna = 1;
            }
        }
        tec.close();
    }
}

/*
 * String calendario = "a";
 * while (contador <= n) {
 * while (linha <=5) {
 * while (coluna <= 7) {
 * if (contador <= n) {
 * if (coluna == 7) {
 * calendario = calendario + "   " + contador + "   \n";
 * } else {
 * calendario = calendario + "   " + contador + "   ";
 * coluna++;
 * contador ++;
 * }
 * }
 * }
 * linha++;
 * coluna = 1;
 * contador++;
 * }
 * }
 * System.out.println(calendario);
 */