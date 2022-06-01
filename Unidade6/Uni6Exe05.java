package Unidade6;

import java.util.Scanner;

public class Uni6Exe05 {
    private Uni6Exe05() {
        Scanner tec = new Scanner(System.in);
        String rapaz[] = new String[5];
        String moca[] = new String[5];
        System.out.println("Instruções: responda primeiro o rapaz e logo em seguida a moça. \n" +
                "Responda apenas SIM, NAO ou IND para indifferença. \n" +
                "Gosta de música sertaneja?");
        rapaz[0] = tec.nextLine();
        moca[0] = tec.nextLine();
        System.out.println("Gosta de futebol?");
        rapaz[1] = tec.nextLine();
        moca[1] = tec.nextLine();
        System.out.println("Gosta de seriados?");
        rapaz[2] = tec.nextLine();
        moca[2] = tec.nextLine();
        System.out.println("Gosta de redes sociais?");
        rapaz[3] = tec.nextLine();
        moca[3] = tec.nextLine();
        System.out.println("Gosta de Oktoberfest?");
        rapaz[4] = tec.nextLine();
        moca[4] = tec.nextLine();
        tec.close();
        calculo(rapaz, moca);
    }

    private void calculo(String rapaz[], String moca[]) {
        int indice = 0;
        for (int i = 0; i < moca.length; i++) {
            if (rapaz[i] == moca[i]) {
                indice = indice + 3;
            } else if (rapaz[i] == "IND" && moca[i] != "IND") {
                indice++;
            } else if ((rapaz[i] == "SIM" && moca[i] == "NAO") || (rapaz[i] == "NAO" && moca[i] == "SIM")) {
                indice = indice - 2;
            }
        }
        resultados(indice);
    }

    private void resultados(int indice) {
            if (indice==15) {
                System.out.println("Casem!");
            } else if (indice>=10 && indice<=14) {
                System.out.println("Vocês tem muita coisa em comum!");
            } else if (indice>=5 && indice<=9) {
                System.out.println("Talvez não dê certo :(");
            } else if (indice>= 0 && indice<=4) {
                System.out.println("Vale um encontro");
            } else if (indice>= -9 && indice <= -1) {
                System.out.println("Melhor não perder tempo");
            } else if (indice == -10) {
                System.out.println("Vocês se odeiam!");
            }
        }

    public static void main(String[] args) {
        new Uni6Exe05();
    }
}
