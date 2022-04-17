package Unidade4;

import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        double peso, altura, IMC;
        peso = tec.nextDouble();
        altura = tec.nextDouble();
        IMC = peso/(altura*altura);
        System.out.println(IMC);
        if (IMC<18.5) {
            System.out.println("Magreza");
        } else if (IMC>=18.5 && IMC<=24.9){
            System.out.println("Saudável");
        } else if (IMC>=25 && IMC<=29.9) {
            System.out.println("Sobrepeso");
        } else if (IMC>=30 && IMC<=34.9) {
            System.out.println("Obesidade Grau I");
        } else if (IMC>=35 && IMC<=39.9) {
            System.out.println("Obesidade Grau II ( severa)");
        } else if (IMC>=40) {
            System.out.println("Obesidade Grau III (mórbido");
        }
        tec.close();
    }
    
}
