package Unidade5;

import java.text.DecimalFormat;

public class Uni5Exe22 {
    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat("0.00");
        int ano=1995;
        double salario=2000;
        double aumento=30;
        
        while (ano<=2022) {
            if (ano==1996) {
                salario = salario + aumento;
                ano++;
            } else {
            aumento = aumento * 2;
            salario = salario +aumento;
            System.out.println( ano + "\n" + salario);
            ano++; 
        }}
        System.out.println("O salário atualmente é de " +salario + " reais");
    }
}
