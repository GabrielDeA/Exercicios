import java.util.Scanner;

public class Uni4Exe08 {

     public static void main(String[] args) throws Exception {
          Scanner tec = new Scanner(System.in);
          int a, b, c, d;
          a = tec.nextInt();
          b = tec.nextInt();

          if (a > b) {
               c = a / b;
               d = c * b;
               if (c != 0 && d == a) {
                    System.out.println("São multiplos");

               } else {
                    System.out.println("Não são multiplos");
               }
          } else {
               if (a == b) {
                    System.out.println("São multiplos");
               }
          }
          if (a < b) {
               c = b / a;
               d = c * a;
               if (c != 0 && d == b) {
                    System.out.println("São multiplos");
               } else
                    System.out.println("Não são multiplos");
          }

     }
}