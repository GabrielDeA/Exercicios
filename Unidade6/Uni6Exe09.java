import java.util.Scanner;

public class Uni6Exe09 {
     private Uni6Exe09() {
    
        int Nclientes = 5;
        int[] idade = new int[Nclientes];
        int genero[] = new int[Nclientes];
        double nota[] = new double[Nclientes];
         imputs( idade, genero, nota);
         calculos(idade, genero, nota, Nclientes);

   }

    private void imputs( int[] idade, int[] genero, double[] nota) {
         Scanner tec = new Scanner(System.in);
        for (int i = 0; i < nota.length; i++) {
            System.out.println("Sexo: (1=feminino, 2=masculino)");
            genero[i] = tec.nextInt();
            System.out.println("Idade: ");
            idade[i] = tec.nextInt();
            System.out.println("Nota: ");
            nota[i] = tec.nextDouble();
        }
        return;
    }

    private void calculos(int[] idade, int[] genero, double[] nota, int Nclientes) {
        // media
        double media = 0;
        for (int i = 0; i < nota.length; i++) {
            media += nota[i] / Nclientes;
        }
        // media masculina
        double mediaMasc = 0;
        int qtdH = 0;
        for (int i = 0; i < nota.length; i++) {
            if (genero[i] == 2) {
                qtdH++;
                mediaMasc += nota[i] / qtdH;
            }
        }
        // nota mulher mais jovem
        double notaMjovem = 0;
        int mJovem = 1000;
        int j = 0;
        for ( j = 0; j < genero.length; j++) {
            if (genero[j] == 1 && idade[j] < mJovem) {
                mJovem = idade[j];
                notaMjovem = nota[j];
            }
        }
        

        // mulheres com mais de 50 que deram nota maior que a média
        int qtdM50MaisQmedia = 0;
        for (int i = 0; i < Nclientes; i++) {
            if (genero[i] == 1 && nota[i] > media && idade[i] > 50 ) {
                qtdM50MaisQmedia++;
            }
        }
        outputs(media, mediaMasc, notaMjovem, qtdM50MaisQmedia);
    }

    private void outputs(double media, double mediaMasc, double notaMjovem, int qtdM50MaisQmedia) {
        System.out.println("Média geral: " + media +
                "\nMédia masculina: " + mediaMasc +
                "\nNota atribuída pela mulher mais jovem: " + notaMjovem +
                "\nQuantidade de mulheres com mais de 50 anos que deram nota maior que a média: " + qtdM50MaisQmedia);

   }

   public static void main(String[] args) {
       new Uni6Exe09();
   }

}
