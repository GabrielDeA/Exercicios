package Unidade5;

import java.util.Scanner;

public class  Uni5Exe13 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Escreva o número de palavras: ");
        int paradas = tec.nextInt();
        
        System.out.println("Escreva quantos litros de combustível o tanque carrega: ");
        int tanque = tec.nextInt();
        int litrosComprados = 0;
        int distanciaParadas = 0;
        int distanciaTotal = 0;
        int litrosTotal = tanque;;
        int quiloParada = 0;
        int quiloTotal = 0;
        for (int i = 1; i <= paradas; i++) {
            System.out.println("Insira a distância percorrida desde a última parada: ");
            distanciaParadas = tec.nextInt();
            System.out.println("Insira a quantidade de litros comprados na parada: ");
            litrosComprados = tec.nextInt();
            distanciaTotal = distanciaTotal + distanciaParadas;
            litrosTotal = litrosTotal + litrosComprados;
            quiloParada = distanciaParadas / litrosComprados;
            System.out.println("A quilometragem por litro nesta parada foi de " + quiloParada + "km/L \n");
        }
        quiloTotal = distanciaTotal / litrosTotal;
        System.out.println("A quilometragem média por litro durante  a viagem foi de " + quiloTotal + "km/L");
        tec.close();
    }
}
