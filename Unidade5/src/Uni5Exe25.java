package Unidade5;

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int D = 0;
        int E = 0;
        char ponto = 'a';
        boolean fim = false;
        while (fim == false) {
            if ((D < 21 || E < 21)) {
                System.out.println("Ponto de: ");
                ponto = tec.next().charAt(0);
                if (ponto == 'D' || ponto == 'd') {
                    D++;
                }
                if (ponto == 'E' || ponto == 'e') {
                    E++;
                    if ((D == 21 && D - E >= 2) || (E == 21 && E - D >= 2)) {
                        fim = true;
                    }
                }
            } else if (D >= 21 || E >= 21) {
               // while (D - E < 2 || E - D < 2) {
                while (fim==false) {
                    System.out.println("Ponto de: ");
                    ponto = tec.next().charAt(0);
                    if (ponto == 'D' || ponto == 'd') {
                        D++;
                    }
                    if (ponto == 'E' || ponto == 'e') {
                        E++;
                    }
                    if (D - E >= 2 || E - D >= 2) {
                        fim = true;
                    } System.out.println("PONTUAÇÃO\n" + "E: " + E + "\nD: " + D);
                }}

                System.out.println("PONTUAÇÃO\n" + "E: " + E + "\nD: " + D);
            } 
            if (D > E) {
                System.out.println("O vencedor é o da direita");
            } else if (E > D) {
                System.out.println("O vencedor é o da esquerda");
            }
            tec.close();
        
    }
}
