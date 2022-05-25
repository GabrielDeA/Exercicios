package Unidade6;

import java.util.Scanner;

public class Uni6Exe01 {

    private Uni6Exe01() {
        Scanner tec = new Scanner(System.in);
        int numeros[] = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = tec.nextInt();
        }
        tec.close();
        escrever(numeros);

    }

    private void escrever(int[] numeros) {
        for (int i = 9; i >=0; i--) {
            System.out.println(numeros[i]);
            
        }
    }

    public static void main(String[] args) {
        new Uni6Exe01();
    }
}
