import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df5 = new DecimalFormat("0.00005");
        int tempoS = 550;
        int tempoM = 0;
        int tempoH = 0;
        System.out.println("Insira a massa incial: ");
        double MassaInicial = tec.nextDouble();
        double MassaFinal = MassaInicial;
        while (MassaFinal >= 0.0005) {
            if (MassaFinal >= 0.0005) {
                MassaFinal = MassaFinal / 2;
                tempoS = tempoS + 50;
            }
        }
        System.out.println(tempoS);
        tempoH = tempoS / 3600;
        tempoM = (tempoS % 3600) / 60;
        tempoS = (tempoS % 3600) % 60;

        System.out.println("Massa inicial: " + MassaInicial + 
        "\nMassa final: " + df5.format(MassaFinal) + 
        "\nTempo:" + tempoH + "h" + tempoM +"m" + tempoS + "s");
        tec.close();  
    }
}
