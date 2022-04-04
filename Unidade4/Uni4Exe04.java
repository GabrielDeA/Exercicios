import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {

 Scanner tec = new Scanner (System.in);
Double a = tec.nextDouble();
int b = tec.nextInt();

if (a - b != 0.0) {
    System.out.println(" tem casas decimais");
} else {
    System.out.println(" não tem casas decimais");
        }
    }
}