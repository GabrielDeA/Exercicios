package Unidade5;

import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int nota1 = 0;
        int valor=0;
       //int resto = 0;
        System.out.println("Insira o valor: ");
        valor=tec.nextInt();
        while (valor!=0) {
            if (valor >= 20) {
                nota20 = valor / 20;
                valor = valor%20; 
            } else if (valor<20 && valor >=10) {
                nota10 = valor/10;
                valor = valor%20;
            } else if (valor<10 && valor>=5) {
                nota5 = valor/5;
                valor = valor%5;
            } else if (valor<5 && valor>=2) {
                nota2 = valor/2;
                valor=valor%2;
            } else if (valor<2) {
                nota1 = valor;
                valor = valor-valor;
            }
        }
        System.out.println(nota20 + " notas de 20\n" + nota10 + " notas de 10\n" + nota5 + " notas de 5\n" +
        nota2 + " notas de 2\n" + nota1 + " notas de 1");
        tec.close();
    }
}
