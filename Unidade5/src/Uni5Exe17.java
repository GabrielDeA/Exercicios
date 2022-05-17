package Unidade5;

import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int Ninscriçao = 1;
        int MaisAlto = 0;
        int MaisBaixo = 0;
        int altura = 0;
        int AltMaisAlto = 0;
        int AltMaisBaixo = 10000;
        int AltTotal = 0;
        int qtd = 0;
        while (Ninscriçao != 0) {
            System.out.println("Insira respectivamente o número de inscrição e altura do atleta: ");
            Ninscriçao = tec.nextInt();
              if (Ninscriçao!=0) {
            altura = tec.nextInt();
      
            if (altura > AltMaisAlto) {
                AltMaisAlto = altura;
                MaisAlto = Ninscriçao;
            }if (altura < AltMaisBaixo) {
                AltMaisBaixo = altura;
                MaisBaixo = Ninscriçao;
            }
            qtd++;
            AltTotal = AltTotal + altura;
        }}
        System.out.println("Número de inscrição do atleta mais alto: " + MaisAlto + ". Altura do atleta mais alto: " + AltMaisAlto +
        "\nNúmero de inscrição do atleta mais baixo: " + MaisBaixo + ". Altura do atleta maais baixo: " + AltMaisBaixo +
        "\nAltura média do grupo de atletas: " + AltTotal/qtd);
        tec.close();
}
}