package Unidade5;

import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] aStrings) {
        Scanner tec = new Scanner(System.in);
        double Salturas = 0;
        for (int i = 0; i < 20; i++) {
            double altura = tec.nextDouble();
            Salturas = Salturas + altura;
            System.out.println("altura = " + altura + "\n Soma = " + Salturas);
        }
        System.out.println("Média = " + Salturas/20.00);
        tec.close();
    }
}
