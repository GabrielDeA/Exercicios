import java.util.Scanner;
public class Uni4Exe12 {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner (System.in);
    int lado1, lado2, lado3;
    System.out.println("Entre com lado 1:");
    lado1 = tec.nextInt();
    System.out.println("Entre com lado 2:");
    lado2 = tec.nextInt();
    System.out.println("Entre com lado 3");
    lado3 = tec.nextInt();
    if (lado1<(lado2+lado3) && lado2<(lado1+lado3) && lado3<(lado1+lado2)) {
        if(lado1==lado2 && lado1==lado3) {
        System.out.println("É equilatero");
        } else if(lado1==lado2 || lado2==lado3 || lado1==lado3) {
            System.out.println("É isóceles");

        } else System.out.println("É escaleno");
    } else System.out.println("Não formam um triangulo");

    tec.close();
}
}
