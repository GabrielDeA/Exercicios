package Unidade4;

import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        System.out.println("A cor é azul?");
        boolean sim = true;
        boolean nao = false;
        boolean R = tec.nextBoolean();
        if (R == true) {
            System.out.println("Sim");
        } else System.out.println("Não");
        tec.close();






    }
}
