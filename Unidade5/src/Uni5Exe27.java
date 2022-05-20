package Unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat("0.00");
        Scanner tec = new Scanner(System.in);
        int resposta = 1;
        int dia = 0;
        int pcManha = 0;
        int pcTarde = 0;
        double valor = 0;
        int pcTotal = 0;
        int diaMais = 0;
        int PcDiaMais = 0;
        while (resposta == 1) {
        System.out.println("Novo funcionário: (1.sim 2.não)?");
        resposta = tec.nextInt();
        if (resposta==1) {
            System.out.println("Dia: ");
            dia = tec.nextInt();
            //if (dia<1 && dia>30){ 
                while (dia<1 || dia>30) {
                    System.out.println("Dia inválido");
                    dia = tec.nextInt();
                }//}
            System.out.println("Peças produzidas, respectivamente, de manhã e à tarde: ");
            pcManha = tec.nextInt();
            pcTarde = tec.nextInt();
            pcTotal = pcManha + pcTarde;
            if (pcTotal>PcDiaMais) {
                PcDiaMais = pcTotal;
                diaMais = dia;
            }
            if (dia >= 1 && dia <=15) {
                if (pcManha>=30 && pcTarde>=30 &&pcTotal>100) {
                    valor = pcTotal * 0.8;
                } else {
                    valor = pcTotal * 0.5;
                }
            } else if (dia>=16 && dia <=30) {
                valor = (pcManha * 0.4) + (pcTarde * 0.3);
            }
            System.out.println("Valor recebido: " + df2.format(valor));
            if (pcManha>pcTarde) {
                System.out.println("Funcionário produziu mais no período da manhã: " + pcManha + " peças");
            } else {
                System.out.println("Funcionário produziu mais no período da tarde: " + pcTarde + " peças");
            }
        }}
        System.out.println("Dia com maior produção: " + diaMais);
        tec.close();
    }
}
