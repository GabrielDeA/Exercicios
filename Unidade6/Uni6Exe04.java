package Unidade6;

import java.util.Scanner;

public class Uni6Exe04 {
    
    private Uni6Exe04 () {
        Scanner tec = new Scanner(System.in);
        int V1[] = new int[10];
        int V2[] = new int[10];
        System.out.println("Escreva os valores do primeiro vetor: ");
        for (int i = 0; i < V1.length; i++) {
            V1[i] = tec.nextInt();
        }
        System.out.println("Escreva os valores do segundo vetor: ");
        for (int i = 0; i < V2.length; i++) {
            V2[i] = tec.nextInt();
        }
        tec.close();
        soma(V1, V2);
    }
    

    private void soma (int[] V1, int[] V2) {
        int V3[] = new int[10];
        for (int i = 0; i < V3.length; i++) {
            V3[i] = V1[i] + V2[i];
        }
        escrever(V3, V1, V2);
    }
 

    private void escrever(int[] V3, int[] V2, int[] V1) {
        System.out.println("Vetor 1: \n");
        for (int i = 0; i < V1.length; i++) {
            System.out.print(V1[i] + "  ");
        }
        System.out.println("\nVetor 2: \n");
        for (int i = 0; i < V2.length; i++) {
            System.out.print(V2[i] + "  ");
        }
        System.out.println("\nVetor 3: \n");
        for (int i = 0; i < V3.length; i++) {
            System.out.print(V3[i] + "  ");
        }
    }
    
    public static void main(String[] args) {
        new Uni6Exe04();
    }
}
