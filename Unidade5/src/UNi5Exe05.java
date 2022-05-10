package Unidade5;

import java.util.Scanner;

public class UNi5Exe05 {
    public static void main(String[] aStrings) {
        Scanner tec = new Scanner(System.in);
        int n = tec.nextInt();
        int S=8;
        for (int i = 0; i < n; i++) {
           System.out.println(S); 
           if (i%2==0) {
                S = S +2;
            } else {
                S = (S-2) * 2;
            }
            
        }
        tec.close();
    }
}
