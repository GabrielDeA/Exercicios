package Unidade4;

import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        double b, h, l, r;
        System.out.println("Escolha uma opção: \n" +
        "T: calcular a área de um triângulo de base b e altura h \n" +
        "Q: calcular a área de um quadrado de lado l: \n" +
        "R: calcular a área de um retângulo de base b e altura h \n" +
        "C: calcular a área de um círculo de raio r");
        char op = tec.next().charAt(0);
        switch (op) {
            case 'T':
            System.out.println("Digite a base e altura d trianângulo: ");
            b=tec.nextDouble();
            h=tec.nextDouble();
            System.out.println("Área do triângulo: " + b*h/2);
            break;
            case 'Q':
            System.out.println("Digite o lado do quadrado: ");
            l=tec.nextDouble();
            System.out.println("Área do quadrado: " + l*l);
            break;
            case 'R':
            System.out.println("Digite a base e altura do retângulo: ");
            b=tec.nextDouble();
            h=tec.nextDouble();
            System.out.println("Área do retângulo: " + b*h);
            break;
            case 'C':
            System.out.println("Digite o raio do círculo: ");
            r=tec.nextDouble();
            System.out.println("Área do círculo: " + Math.PI * Math.pow(r, 2));
            

      tec.close();  }

        
    }
    
}
