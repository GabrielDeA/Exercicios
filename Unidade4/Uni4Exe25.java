package Unidade4;

import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int op;
        double a, b;
        System.out.println("Insira os números: ");
        a = tec.nextDouble();
        b = tec.nextDouble();

        System.out.println("Escolha uma opção: \n" +
                "1 - Soma de dois números. \n" +
                "2 - Diferença entre dois números.\n" +
                "3 - Produto entre dois números.\n" +
                "4 - Divisão entre dois números (o denominador não pode ser zero).");
        op = tec.nextInt();
        switch (op) {
            case 1: 
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            if (b==0) {
                System.out.println("Valor inválido");
            } else {
                System.out.println(a/b);
            }
            break;
            default: System.out.println("Opção inválida");

        tec.close();
    }

    }

}
