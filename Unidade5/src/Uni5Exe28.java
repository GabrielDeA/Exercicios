import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");
        int voto = 0;
        double NdN = 0;
        double CPM22 = 0;
        double Skk = 0;
        double JQ = 0;
        double total = 0;
        String Vencedor = "";
        char maisUm = 's';
        while (maisUm != 'n') {

            System.out.println(" mais um voto: s (SIM) / n (NÃO)?");
            maisUm = tec.next().charAt(0);
            if (maisUm == 's') {
                System.out.println("vote: " +
                        "\n1    Nenhum de Nós" +
                        "\n2    CPM22" +
                        "\n3    Skank" +
                        "\n4    Jota Quest");
                voto = tec.nextInt();
                switch (voto) {
                    case 1:
                        NdN++;
                        break;
                    case 2:
                        CPM22++;
                        break;
                    case 3:
                        Skk++;
                        break;
                    case 4:
                        JQ++;
                        break;
                }
                total++;
            }
        }
        if (NdN > CPM22 && NdN > Skk && NdN > JQ) {
            Vencedor = "Nenhum de Nós";
        } else if (CPM22 > Skk && CPM22 > JQ && CPM22 > NdN) {
            Vencedor = "CPM22";
        } else if (Skk > JQ && Skk > NdN && Skk > CPM22) {
            Vencedor = "Skank";
        } else if (JQ > NdN && JQ > CPM22 && JQ > Skk)
            ;
        System.out.println("Nenhum de Nós: " + NdN + " votos" + " (" + df2.format(NdN / total * 100) + "%)" +
                "\nCPM22: " + CPM22 + " votos" + " (" + df2.format(CPM22 / total * 100) + "%)" +
                "\nSkank: " + Skk + " votos" + " (" + df2.format(Skk / total * 100) + "%)" +
                "\nJota Quest: " + JQ + " votos" + " (" + df2.format(JQ / total * 100) + "%)" +
                "\n\nVencedor: " + Vencedor);

        tec.close();

    }
}
