

import java.util.Scanner;

public class Uni4Exe08 {

    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner (System.in);
        System.out.println("Insira a letra");
        char letra = tec.next().charAt(0);
        if (letra ==  'e' ||letra == 'a' || letra =='i' || letra=='o' ||letra =='u' ) {
             System.out.println("É vogal");
        }
        else {
             System.out.println("Não é vogal");
        }

        tec.close();
  


} }
