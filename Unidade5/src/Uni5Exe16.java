package Unidade5;

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double AltFTotal = 0;
        double AltTotal = 0;
        char sexo;
        double qtdF = 0;
        double qtd = 0;
        double altura = 1;
        while (altura != 0) {  
            System.out.println("Digite a altura: ");
            altura = tec.nextDouble();
            if (altura != 0) {
            System.out.println("Digite o sexo: ");
            sexo = tec.next().charAt(0);
            System.out.println("");
            if (sexo == 'F' || sexo == 'f') {
                AltFTotal = AltFTotal + altura;
                qtdF++;
            }
            AltTotal = AltTotal + altura;
            qtd++;
        }}
        System.out.println("Média da altura feminina: " + AltFTotal/qtdF + 
        "\n Média da altura geral: " + AltTotal/qtd);
        tec.close();
    }
    
}
