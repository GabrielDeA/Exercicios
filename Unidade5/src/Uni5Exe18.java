import java.util.Scanner;
import java.text.DecimalFormat;
public class Uni5exe18 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        int canal = 1;
        double PessoasAssistindo = 0;
        double total = 0;
        double qtd4 = 0;
        double qtd5 = 0;
        double qtd9 = 0;
        double qtd12 = 0;
        while (canal != 0) {
            System.out.println("Canal sendo assistido: ");
            canal = tec.nextInt();
            switch (canal) {
                case 0:

                    break;
                case 4:
                    System.out.println("Número de pessoas assistindo a este canal: ");
                    PessoasAssistindo = tec.nextDouble();
                    total = total + PessoasAssistindo;
                    qtd4 = qtd4 + PessoasAssistindo;

                    break;
                case 5:
                    System.out.println("Número de pessoas assistindo a este canal: ");
                    PessoasAssistindo = tec.nextDouble();
                    total = total + PessoasAssistindo;
                    qtd5 = qtd5 + PessoasAssistindo;

                    break;
                case 9:
                    System.out.println("Número de pessoas assistindo a este canal: ");
                    PessoasAssistindo = tec.nextDouble();
                    total = total + PessoasAssistindo;
                    qtd9 = qtd9 + PessoasAssistindo;

                    break;
                case 12:
                    System.out.println("Número de pessoas assistindo a este canal: ");
                    PessoasAssistindo = tec.nextDouble();
                    total = total + PessoasAssistindo;
                    qtd12 = qtd12 + PessoasAssistindo;
                    break;

            }
        }
        System.out.println("Canal 4: " +df_2.format((qtd4 / total) * 100) + "% \n" +
                "Canal 5: " +df_2.format((qtd5 / total) * 100) + "% \n" +
                "Canal 9: " + df_2.format((qtd9 / total) * 100) + "%\n" +
                "Canal 12: " + df_2.format((qtd12 / total) * 100) + "%\n");
        tec.close();
    }
}
