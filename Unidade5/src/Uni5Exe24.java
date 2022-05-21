package Unidade5;

import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double limite = 0;
        double peso = 0;
        double total = 0;
        char resposta = 'a';
        System.out.println("Informe o limite de peso: ");
        limite = tec.nextDouble();
        while (total<=limite) {
            System.out.println("Deseja informar o peso de mais um peixe? s (SIM) n (NÃO)");
            resposta = tec.next().charAt(0);
            if (resposta=='s') {
                System.out.println("Peso do peixe: ");
                peso = tec.nextDouble();
                total = total + peso;
            }}
            System.out.println("Peso máximo exedido, fim de programa.");
    }
}
