package Unidade4;
import java.util.Scanner;
public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        int a = tec.nextInt();
        int b = tec.nextInt();
        int c = tec.nextInt();
        if ((a==b && a!=c) || (a==c && a!=b) || (b==c && b!=a)) {
            System.out.println("GẼMEOS");

        } 
         if (a==b && a==c && c==b) {
            System.out.println("TRIGẼMEOS");
        }
        if (a!=b && a!=c && b!=c) {
            System.out.println(" APENAS IRMÃOS");
        }
        }
    }

