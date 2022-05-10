package Unidade5;

public class Uni5Exe04 {
    public static void main(String[] aStrings) {
        int i = 1;
        double S = 0;
        double Numerador = 3;
        double Denominador = 2;
       while (i<21) {
           S = Numerador / Denominador + S;
           Numerador = Numerador + 2;
           Denominador = Denominador + Numerador - 1;
           i++;
          
       }
        System.out.println("S = " + S);
    }
}
