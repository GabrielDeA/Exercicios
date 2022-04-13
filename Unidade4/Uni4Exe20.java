
import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        double P1, P2, P3, exe, media;
        char conceito='0';
        System.out.println("Nota prova 1:");
        P1 = tec.nextDouble();
        System.out.println("Nota prova 2:");
        P2 = tec.nextDouble();
        System.out.println("Nota prova 3:");
        P3 = tec.nextDouble();
        System.out.println("Nota exercícios:");
        exe = tec.nextDouble();
        media = (P1 + P2 * 2 + P3 * 3 + exe) / 7;
        if (media >= 9) {
            conceito = 'A';
        } else if (media >= 7.5 && media < 9) {
            conceito = 'B';
        } else if (media >= 6 && media < 7.5) {
            conceito = 'C';
        } else if (media >= 4 && media < 6) {
            conceito = 'D';
        } else if (media < 4) {
            conceito = 'E';
        }
System.out.println("Média: " +media);
        System.out.println("Conceito: " +conceito);
        if (conceito == 'A' || conceito == 'c' || conceito == 'C') {
            System.out.println("Aprovado");
        } else if (conceito =='D' || conceito=='E') {
            System.out.println("Reprovado");
        }

        tec.close();

    }
}
