package Unidade4;

import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int op;
        double v1, v2, v3, menor, maior, meio;
        meio=0; maior=0; menor=0;
        System.out.println("Insira os valores: ");
        v1 = tec.nextDouble();
        v2 = tec.nextDouble();
        v3 = tec.nextDouble();
        System.out.println("Insia a opção:");
        op = tec.nextInt();
        if (v1<v2 && v1<v3) {
            menor=v1;
        } if (v1>v2 && v1>v3) {
            maior=v1;
        } if ((v1<v2 && v1>v3) || (v1>v2 && v1<v3)) {
            meio=v1;
        }  
        if (v2<v3 && v2<v1) {
            menor=v2;
        } if (v2>v3 && v2>v1) {
            maior=v2;
        } if ((v2>v1 && v2<v3) || (v2>v3 && v2<v1)) {
            meio=v2;
        }
        if (v3<v2 && v3<v1) {
            menor=v3;
        } if (v3>v1 && v3>v2) {
            maior=v3;
        } if ((v3>v1 && v3<v2) || (v3>v2 && v3<v1)) {
            meio=v3;
        }
       switch (op) {
           case 1:
           System.out.println(menor + " " + meio + " " + maior);
           break;
           case 2:
           System.out.println(maior + " " + meio + " " + menor);
           break;
           case 3:
           System.out.println(menor + " " + maior + " " + meio);
       } 
       tec.close();
        }

    }


