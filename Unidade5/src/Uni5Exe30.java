package Unidade5;

import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int N = 0;
        int K = 0;
        int M = 0;
        int sEntraram = 0;
        int sFora = 0;
        String aSeremColocados = "";
        String Colocados = "";
        String Fora = "";
        System.out.println("Capacidade da mochila: ");
        M = tec.nextInt();
        System.out.println("Número N");
        N = tec.nextInt();
        System.out.println("Decremento: ");
        K = tec.nextInt();

        while (N > 0) {
            if (N <= M) {
                M = M - N;
                sEntraram += N;
                Colocados = Colocados + ", " + N;
            } else {
                Fora += ", " + N;
                sFora += N;
            }
            aSeremColocados = aSeremColocados + ", " + N;
            N -= K;
        }
        System.out.println("Elementos a serem colocados na mochila: " + aSeremColocados +
                "\nElementos que entraram na mochila: " + Colocados +
                "\nElementos que ficaram fora da mochila: " + Fora +
                "\nSoma dos que entraram: " + sEntraram +
                "\nSoma dos que ficaram de fora: " + sFora);

        tec.close();
    }
}
