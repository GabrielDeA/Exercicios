import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] arStrings) {
        Scanner tec = new Scanner(System.in);
        int n = tec.nextInt();
        double R = 0;
        double maior = 0;
        double menor = 0;
        for (int i = 1; i <= n; i++) {
            R = tec.nextDouble();
            if (i == 1) {
                menor = R;
                maior = R;
            } else {
                if (R > maior) {
                   maior = R;
                } else if (R < menor) {
                    menor = R;
                }
            }
        }

        System.out.println("Menor: " + menor + "\n Maior: " + maior);
        tec.close();
    }
}
