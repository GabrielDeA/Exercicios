import java.util.Scanner;

public class Uni4exe03 {
    public static void main(String[] args) {
    Scanner tec = new Scanner (System.in);
    int a, b;
    a = tec.nextInt();
    b = tec.nextInt();
    if (a>b) {
        System.out.println("A é maior que B");

    }
    if (b>a) {
        System.out.println("B é maior que A");
    }
}
}
