package Unidade4;
import java.util.Scanner;
public class Uni4Exe10 {
    public static void main(String[] args) {

        Scanner tec = new Scanner (System.in);
        int M = tec.nextInt();
        int Z = tec.nextInt();
        int L = tec.nextInt();
        if (M<Z && M<L) {
            System.out.println("Marquinhos é caçula");
        } else if (Z<M && Z<L) {
            System.out.println("Zezinho é caçula");
        } else if (L<M && L<Z) {
            System.out.println("Luluzinha é caçula");
        }
        tec.close();
    }

   
    
}
