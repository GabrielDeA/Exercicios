
//Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorre até o dia do vencimento,
//o cliente ganha 10% de desconto e é avisado que o pagamento está em dia.
//Se o pagamento é realizado até cinco dias após o vencimento o cliente perde o desconto, e se o pagamento atrasa
//mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. Faça um algoritmo que leia o dia do vencimento,
//o dia do pagamento e o valor da prestação e calcule o valor a ser pago pelo cliente, exibindo as devidas mensagens.
//Suponha que todo vencimento ocorre até o dia dez de cada mês e os clientes nunca deixam para pagar no mês seguinte.
import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        int diaPagamento, diaVencimento;
        double Vfinal, valor;
        System.out.println("Insira o dia de vencimento");
        diaVencimento=tec.nextInt();
        System.out.println("Insira o dia de pagamento");
        diaPagamento=tec.nextInt();
        System.out.println("Insira o valor da prestação");
        valor=tec.nextInt();
        if (diaPagamento<=diaVencimento) {
            Vfinal= valor - (valor*0.1);
            System.out.println("O pagamento está em dia. Portanto, foi descontado 10% da dívida. Novo valor: R$ " + Vfinal);
        } else if (diaPagamento>diaVencimento && diaPagamento<=diaVencimento+5) {
            Vfinal=valor;
            System.out.println("Pagamento atrasado em até 5 dias. Valor a ser pago: R$ " + Vfinal);
        } else if (diaPagamento>diaVencimento+5) {
            Vfinal = valor + ((0.02*(diaPagamento-diaVencimento))*valor);
            System.out.println("Pagamento atrasado em mais de 5 dias. Aplicada multa de 2%/dia. Novo valor: R$ " + Vfinal);
        }

        tec.close();

    }
}
