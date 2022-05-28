package Unidade6;

import java.util.Scanner;

public class Uni6Exe03 {

    private Uni6Exe03() {
        Scanner tec = new Scanner(System.in);
        Double valores[] = new Double[12];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = tec.nextDouble();
        }
        tec.close();
        ajuste(valores);
    }

    private void ajuste(Double[] valores) {
        for (int i = 0; i < valores.length; i++) {
            if (i % 2 != 0) {
                valores[i] = valores[i] * 1.05;
            } else {
                valores[i] = valores[i] * 1.02;
            }
        }
        escrever(valores);
    }

    private void escrever(Double[] valores) {
        for (int j = 0; j < valores.length; j++) {
            System.out.println(valores[j]);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe03();
    }
}
