import java.util.Scanner;

public class Uni6Exe08 {

    private Uni6Exe08() {
        Scanner tec = new Scanner(System.in);
        System.out.println("Insira o tamanho do vetor: ");
        int N = tec.nextInt();
        while (N>20) {
            System.out.println("O tamanho deve ser menor ou igual a 20, tente novamente.");
            N = tec.nextInt();
        }
        double vetor[] = new double[N];
        System.out.println("Insira valores no vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = tec.nextInt();
        }
        tec.close();
        boolean[] repetidos = new boolean[N];
        for (int i = 0; i < repetidos.length; i++) {
            repetidos[i] = false;
        }
        boolean contado = true;

        System.out.println("Valor | Frequência");
        int contador = 0;
        for (int i = 0; i < repetidos.length; i++) {
            contador = 0;
            if (repetidos[i] != true) {
                for (int j = 0; j < repetidos.length; j++) {
                    if (vetor[i] == vetor[j]) {
                        contador++;
                        repetidos[j] = contado;
                    }
                }
                System.out.println(" " + vetor[i] + "        " + contador);
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe08();
    }
}
