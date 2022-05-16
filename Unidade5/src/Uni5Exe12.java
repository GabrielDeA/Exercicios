package Unidade5;

import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int qtdLinhas = tec.nextInt();
        int numFloyd;
        numFloyd = 1;
        for (int linha = 1; linha <= qtdLinhas; linha++) {
          for (int coluna = 1; coluna <= linha; coluna++) {
            if (numFloyd < 10) {
              System.out.print(numFloyd + " ");
            } else {
              if (numFloyd < 100) {
                System.out.print(numFloyd + " ");
              } else {
                System.out.print(numFloyd + " ");
              }
            }
            numFloyd++;
          }
          System.out.println();
        }
        tec.close();
    }
}
