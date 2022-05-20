package Unidade5;

import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double VNega = 0;
        int dist = 0;
        int qtdNega = 0;
        int qtdInf = 0;
        int qtd150mais = 0;
        double Vpedagio = 0;
        System.out.println("Insira o valor que Astolfo se nega a pagar: ");
        VNega = tec.nextInt();
        while (Vpedagio >= 0) {
            System.out.println("Valor do pedágio:");
            Vpedagio = tec.nextDouble();
            if (Vpedagio >= 0) {
                System.out.println("Distância: ");
                dist = tec.nextInt();
                if (Vpedagio >= VNega) {
                    qtdNega++;
                }
                if (Vpedagio < VNega && dist > 150) {
                    qtd150mais++;
                }
                qtdInf++;
            }
        }
        System.out.println(qtdNega + " trechos com valor a cima do qual ele nega-se a pagar\n" +
                qtdInf + " trechos informados\n" +
                qtd150mais + " trechos acima de 150km com valor aceito por ele");
        tec.close();
    }
}
