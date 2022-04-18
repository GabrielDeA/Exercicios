package Unidade4;

import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
    
        Scanner teclado=new Scanner(System.in);

    System.out.println("Digite o horario de entrada: ");
    System.out.print("Horas: ");
    int horaEnt=teclado.nextInt();
    System.out.print("Minutos: ");
    int minEnt=teclado.nextInt();

    System.out.println("Digite o horario de saida: ");
    System.out.print("Horas: ");
    int horaSai=teclado.nextInt();
    System.out.print("Minutos: ");
    int minSai=teclado.nextInt();


    int horaFinal=0;
    int minFinal=0;

    if (horaEnt>horaSai)
        horaFinal=(horaSai+24)-horaEnt;
    else 
        horaFinal=horaSai-horaEnt;

    if(minEnt>minSai)
        minFinal=(minSai+60)-minEnt;
    else
        minFinal=minSai-minEnt;
    
    System.out.println(horaFinal+" horas e "+minFinal+" minutos");

    int tempMin=horaFinal*60+minFinal;
    double preco=0;

    if (0<tempMin&&tempMin<30){
        preco=0;
        System.out.println("Tempo minimo de permanencia!");
    }
    else if (30<=tempMin&&tempMin<90){
        preco=5;
        System.out.println("Valor a ser pago: "+preco);
    }
    else if(90<=tempMin&&tempMin<150){
        preco=10;
        System.out.println("Valor a ser pago: "+preco);
    }
    else if(150<=tempMin&&tempMin<210){
        preco=7.5;
        System.out.println("Valor a ser pago: "+preco);
    }
    else if(210<=tempMin&&tempMin<270){
        preco=15;
        System.out.println("Valor a ser pago: "+preco);
    }
    else if(tempMin>=270){
        preco=horaFinal*10;
        System.out.println("Valor a ser pago: "+preco);
    }
    teclado.close();
}
    
}