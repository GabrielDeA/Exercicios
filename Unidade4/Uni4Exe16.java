package Unidade4;

import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        int H1, H2, M1, M2, Hnovo, Hvelho, Mnova, Mvelha, R1, R2;
        Hnovo=0; Hvelho=0; Mnova=0; Mvelha=0;
        H1=tec.nextInt();
        H2=tec.nextInt();
        M1=tec.nextInt();
        M2=tec.nextInt();
        if (H1<H2) {
            Hnovo=H1;
            Hvelho=H2;
        } else if (H2<H1) {
            Hnovo=H2;
            Hvelho=H1;
        }
        if (M1<M2) {
            Mnova=M1;
            Mvelha=M2;
        } else if (M2<M1) {
            Mnova=M2;
            Mvelha=M1;
        }
        R1=Hvelho+Mnova;
        R2=Hnovo*Mvelha;

        System.out.println("\n" + R1 + "\n" + R2);



    }

    
}
