
package Unidade4;

import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Entre com as horas trabalhadas no mês: ");
        int horasMes = tec.nextInt();
        System.out.println("Entre com o valor pago por hora: ");
        double horasValor = tec.nextDouble();

        double salarioTotal = horasMes * horasValor;
        if (horasMes > 160) {
            double salarioExtra = (horasMes - 160) * (horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra;
        }

        System.out.println("O salário total é: " + salarioTotal);

        tec.close();
    }
}
