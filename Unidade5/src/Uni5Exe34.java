package Unidade5;

import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcao = 0;
        int Ndiarias = 0;
        double total = 0;
        int nEncerradas =0;
        String nome = "";
        
        do {
            System.out.println("(1) encerrar a conta de um hóspede \n(2) verificar número de contas encerradas \n(3) sair ");
            opcao = tec.nextInt();
            switch (opcao) {
                case 1:
                System.out.println("Escreva o nome do hóspede e número de diárias: ");
                nome = tec.next();
                Ndiarias = tec.nextInt();
                if (Ndiarias<15) {
                    total = Ndiarias * 57.50;
                } else if (Ndiarias == 15) {
                    total = Ndiarias * 56.50;
                } else if (Ndiarias >15) {
                    total = Ndiarias * 55;
                }
                System.out.println(nome + "\n" + Ndiarias + " diárias" + "\nValor a ser pago: R$" + total);
                nEncerradas++;
                break;
                case 2:
                System.out.println(nEncerradas + " contas encerradas");
                break;
                case 3:
            }
        } while (opcao != 3);
        tec.close();
    }
}
