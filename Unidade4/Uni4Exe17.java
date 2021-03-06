//Para realizar o cálculo do Imposto de Renda a ser pago, é solicitado a renda anual e o número de dependentes do contribuinte.
//A renda líquida é calculada sobre a renda anual com um desconto de 2% para cada dependente do contribuinte.
// O contribuinte com uma renda líquida de até R$ 2.000,00 não paga imposto.
// Para aqueles que possuem renda líquida entre R$ 2.000,00 e R$ 5.000,00 o imposto é de 5% sobre o valor da renda líquida;
//para rendas líquidas de R$ 5.000,00 até R$ 10.000,00 é de 10%. Rendas superiores a R$ 10.000,00 pagam 15% de imposto.

import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        int Dependentes;
        double rendaAno, Rliquida, imposto;
        System.out.println("Insira renda anual");
        rendaAno=tec.nextDouble();
        System.out.println("Insira o núumero de dependentes");
        Dependentes=tec.nextInt();
        Rliquida = (rendaAno - (0.02*Dependentes*rendaAno)) /12;
        if (Rliquida<2000.00) {
            System.out.println("Não há imposto a ser pago");
        } else if (Rliquida>=2000 && Rliquida<5000) {
            imposto = Rliquida*0.05;
            System.out.println("Deve ser pago imposto de R$ " + imposto + " (5%)."); 
        } else if (Rliquida >=5000 && Rliquida <10000) {
            imposto = Rliquida*0.1;
            System.out.println("Deve ser pago imposto de R$ " + imposto + " (10%).");
        } else if ( Rliquida>=10000) {
            imposto = Rliquida*0.15;
            System.out.println("Deve ser pago imposto de R$ " + imposto + " (15%).");
        }
        tec.close();


    }
}
