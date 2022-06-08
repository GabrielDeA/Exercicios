import java.util.Scanner;

public class Uni6Exe10 {

    private Uni6Exe10() {
        Scanner tec = new Scanner(System.in);
        int tamanhoVetor = 5;
        int contador = 1;
        int vetor[] = new int[tamanhoVetor];
        int resposta = 0;

        do {
            System.out.println("\n1 - Incluir valor\n2 - Pesquisar valor\n3 - Alterar valor\n4 - Excluir valor\n" +
                    "5 - Mostrar valores\n6 - Ordenar valores\n7 - Inverter valores\n8 - sair do sistema");
            resposta = tec.nextInt();
            switch (resposta) {
                case 1:
                    incluir(vetor, tec, tamanhoVetor, contador);
                    contador++;
                    break;

                case 2:
                    Pesquisar(vetor, tec);
                    break;

                case 3:
                    Alterar(vetor, tec, tamanhoVetor);
                    break;

                case 4:

                    break;

                case 5:
                    Mostrar(vetor);
                    break;

            }
        } while (resposta != 8);
    }

    private void incluir(int[] vetor, Scanner tec, int tamanhoVetor, int contador) {
        if (contador < vetor.length +1) {
        System.out.println("Valor a ser incluído: ");
        int Vincluido = tec.nextInt();
        vetor[vetor.length - contador] = Vincluido;
        System.out.println("Valor incluído");
        } else {System.out.println("Valor não pode ser incluído. Motivo: vetor cheio");}
    }

    private void Pesquisar(int[] vetor, Scanner tec) {
        boolean achou = false;
        System.out.println("Informe valor a ser pesquisado: ");
        int Vpesquisado = tec.nextInt();
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] == Vpesquisado) {
                achou = true;
            }
        }
        if (achou == true) {
            System.out.println("Valor está no vetor");
        } else {
            System.out.println("Valor não está no vetor");
        }

    }

    private void Alterar(int[] vetor, Scanner tec, int tamanhoVetor) {
        int Vantigo = 0;
        int Vnovo = 0;
        boolean fim = false;
        System.out.println("Insira qual valor deseja alterar: ");
        Vantigo = tec.nextInt();
        System.out.println("Insira para qual valor deseja alterar: ");
        Vnovo = tec.nextInt();
        for (int i = 0; fim != true; i++) {
            if (vetor[i] == Vantigo) {
                vetor[i] = Vnovo;
                fim = true;
            } else if (i >= tamanhoVetor) {
                System.out.println("Valor informado não existe no vetor");
                fim = true;
            }
        }
    }

    private void Mostrar(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("|" + vetor[i] + "|");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe10();
    }
}
