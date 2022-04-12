package Unidade4;

import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
    double VSalario, VReajuste, Vreajustado;
    int meses;
     System.out.println("Insira o valor do Salário atual");
        VSalario = tec.nextDouble();
    System.out.println("Insira há quantos meses o funcionário foi admitido");
        meses = tec.nextInt();
        if (meses>-1 && meses<49){
            if (meses<13){
                VReajuste = 0.05*VSalario;
                Vreajustado=VReajuste+VSalario;
                System.out.println("O salário será reajustado em R$ " +VReajuste+ " (5%). O novo Salário será de R$ " + Vreajustado + ".");
                } else if (meses>12) {
                    VReajuste = 0.07*VSalario;
                    Vreajustado = VReajuste+VSalario;
                    System.out.println("O salário será reajustado em R$ " +VReajuste+ " (7%). O novo Salário será de R$ " + Vreajustado + ".");
                }
        } else System.out.println("Insira valores apenas entre 0 e 48 meses");
     tec.close();
    } 
}

   





