package Unidade5;

import java.util.Scanner;

public class Uni5exe08 {
    public static void main(String[] aStrings) {
        Scanner tec = new Scanner(System.in);
        int n = tec.nextInt();
        int numero=0;
        int menor=0;
        int somaPositivos=0;
        int QtdPos=0;
        for (int i = 1; i <= n; i++) {
            numero=tec.nextInt();
            if (numero<menor) {
                menor = numero;
            }else if (numero>0) {
            somaPositivos = somaPositivos + numero;
            QtdPos++;
            }
        }
        System.out.println("Menor negativo: " + menor + "\nMédia dos positivos: " + somaPositivos/QtdPos);
        tec.close();
    }
}
