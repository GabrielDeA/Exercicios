package Unidade5;

import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double PC = 0;
        double PV = 0;
        String relatorioLucro1 = "\n Mercadorias com lucro de até 10%:  ";
        String relatorioLucro2 = "\n Mercadorias com lucro de 10 a 20%: ";
        String relatorioLucro3 = "\n Mercadorias com lucro maior que 20%:";
        String nome = "a";
        double lucro = 0.00;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Insira o nome da mercadoria " + i + ": ");
            nome = tec.nextLine();
            System.out.println("Insira respectivamente os preços de compra e de venda: ");
            PC = tec.nextInt();
            PV = tec.nextInt();
            lucro = (PV - PC) / PC * 100;
            if (lucro < 10) {
                relatorioLucro1 = relatorioLucro1 + " " +nome;
            } else if ( lucro >= 10 && lucro <=20) {
                relatorioLucro2 = relatorioLucro2 + " " + nome;
            } else if ( lucro>20) {
                relatorioLucro3 = relatorioLucro3 + " " + nome;
            }
            System.out.println(nome);
        }
        System.out.println(relatorioLucro1 + "\n" + relatorioLucro2 + "\n" + relatorioLucro3);
    }
}
