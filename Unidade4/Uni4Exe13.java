import java.util.Scanner;
public class Uni4Exe13 {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner (System.in);
        System.out.println("Informe as 3 cartas");
        int carta1 = tec.nextInt();
        int carta2 = tec.nextInt();
        int carta3 = tec.nextInt();
        int CartasBoas = 0;
        if (carta1==1 || carta1==2 || carta1==3) {
            CartasBoas +=1;
        }
        if (carta2==1 || carta2==2 || carta2==3) {
            CartasBoas++;
        }
        if (carta3==1 || carta3==2 || carta3==3) {
            CartasBoas++;
        }
        if (CartasBoas==1) {
            System.out.println("TRUCO");
        } else if (CartasBoas==2) {
            System.out.println("SEIS");
        } else if (CartasBoas==3) {
            System.out.println("NOVE");
        }

}
}
