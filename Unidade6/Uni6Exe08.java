import java.util.Scanner;

public class Uni6Exe08 {
    
    private Uni6Exe08() {
        Scanner tec = new Scanner(System.in);
        System.out.println("Insira o tamanho do vetor: ");
        int N = tec.nextInt();
        double vetor[] = new double[N];
        System.out.println("Insira valores no vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = tec.nextInt();
        }
        tec.close();
        output(vetor, N);
    }

    private void output(double vetor[], int N) {
        
        int dif = 0;
        double usados[] = new double[N];
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]){
                    for (int k = 0; k < usados.length; k++) {
                        if (vetor[i] != usados[k]) {
                            dif++;
                            usados[i] = vetor[i];
                        } 
                    }
                }
               
            } System.out.println(dif);
        }
        double diferentes[] = new double[dif];
        double frequencia[] = new double[dif];
    }
    
    public static void main(String[] args) {
        new Uni6Exe08();
    }
}
