
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe07 {

    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner (System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

   System.out.println("insira peso da carta");
   double peso = tec.nextDouble();
   double valor;
   if (peso <= 50) {
        valor = 0.45;
   }
        else {
         double excesso;
         excesso = peso - 50;
        double qtAdd = (excesso/20)+1;
        valor = 0.45 + 0.45 * qtAdd;
        }
System.out.println("custo do selo: " +df_2.format(valor));
tec.close();


} }
