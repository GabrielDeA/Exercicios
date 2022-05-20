package Unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat("0.00");
        Scanner tec = new Scanner(System.in);
        int n = 0;
        double salario = 0;
        char resposta = 's';
        String nome = "";
        double valor = 0;
        while (resposta == 's') {
            System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
            resposta = tec.next().charAt(0);
            if (resposta == 's') {
                System.out.println("Digite o nome do vendedor: ");
            nome = tec.next();
                System.out.println("Difite a quantidade de produtos vendidos: ");
            n = tec.nextInt();
                System.out.println("Digite o valor total das vendas do vendedor: ");
            valor = tec.nextDouble();
            salario = valor * 0.3;
            System.out.println(nome + "\nTotal de vendas: R$" + valor + "\nSalário: R$" + df2.format(salario));
            } else if (resposta !='n') {
                System.out.println("ERRO \ndigite apenas s ou n");
            }
        }
        tec.close();
    }
}
