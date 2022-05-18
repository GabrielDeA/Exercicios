import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");
        double Vcompra = 1;
        double Pdescontado = 0;
        double Arrecadaçao = 0;
        while (Vcompra != 0) {
            System.out.println("Insira valor da compra: ");
            Vcompra = tec.nextDouble();
            if (Vcompra != 0) {
                if (Vcompra > 500) {
                    Pdescontado = Vcompra * 0.8;
                    
                    System.out.println("Total a pagar: " + df2.format( Pdescontado ));
                } else if (Vcompra <= 500) {
                    Pdescontado = Vcompra * 0.85;
                    System.out.println("Total a pagar: " + df2.format( Pdescontado));
                }
                Arrecadaçao = Arrecadaçao + Pdescontado;
            } } 
            System.out.println("Valor total arrecadado pela loja: " + Arrecadaçao);
        tec.close();
    }
}
