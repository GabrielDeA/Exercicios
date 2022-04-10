package Unidade4;
import java.util.Scanner;
public abstract class Uni4Exe02 {
    public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Entre com um valor inteiro maior do que 0: ");
		int valor = tec.nextInt();
		if ((valor % 2) == 0) {
			System.out.println("Número é par");
		} else {
			System.out.println("Número é impar");
		}
		tec.close();
	}
}
