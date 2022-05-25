package Unidade6;

import java.util.Scanner;

public class Uni6Exe02 {

    private Uni6Exe02() {
        Scanner tec = new Scanner(System.in);
        int numeros[] = new int[12];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = tec.nextInt();
        }
        tec.close();
        media(numeros);
    }

    private void media(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        int media = soma / 12;
        leitura(numeros, media);
    }

    private void leitura(int[] numeros, int media) {
         System.out.println("Números acima da média:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                System.out.println(numeros[i]);
            }
        }

    }

    public static void main(String[] args) {
        new Uni6Exe02();
    }
}
