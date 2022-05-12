package Unidade5;

import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] aStrings) {
        Scanner tec = new Scanner(System.in);
        int n = tec.nextInt();
        int idade = 0;
        int qtd20 = 0;
        String nomes = "" ;
        String nomes18 = "";
        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com idade e nome: ");
            idade = tec.nextInt();
            nomes = tec.nextLine();
            if ( idade<0) {
                System.out.println("Erro: idade deve ser positiva");
            } else if (idade == 18) {
                nomes18 = nomes18 + " " + nomes;
            } else if (idade>20) {
                qtd20++;
            }

            
        }
        System.out.println("Alunos com 18 anos:" + nomes18 + "\nQuantidade dealunos com mais de 20 anos: " + qtd20);



        tec.close();
        
    }
    
}
