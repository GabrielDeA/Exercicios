package Unidade5;

import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] aStrings) {
        int voto = 0;
        int C1=0; int C2=0; int C3=0; int C4 = 0; int nulo=0; int branco = 0;
   Scanner tec = new Scanner(System.in);
   do {
       System.out.println("URNA ELETRÔNICA \n Como operar: \n 1, 2, 3, 4: vota uma vez em candidato de respectivo nuúmero \n 5: voto nulo \n 6: voto em branco \n 0: interromper operação");
       voto = tec.nextInt();
       if (voto>6 || voto<0) {
           System.out.println("Opão incorreta. Insira apenas números de 0 a 6.");
       }
       switch (voto) {
             case 1 : 
                C1++;
                break;
             case 2:
                C2++;
                break;
             case 3:
                C3++;
                break;
             case 4:
                C4++;
                break;
             case 5:
                nulo++;
                break;
             case 6:
                branco++;
                break;
       }
  
    } while (voto !=0);
    System.out.println("RESULTADOS: \n"
    + "Candidato 1: " +C1 + " votos \n"
    + "Candidato 2: " +C2 + " votos \n"
    + "Candidato 3: " + C3 + " votos \n"
    + "Candidato 4: " + C4 + " votos \n"
    + "Nulo: " + nulo + " votos \n"
    + "Branco: " + branco + " votos \n"
    + "Percentual de nulos e brancos em relação ao total: " +(nulo+branco) * 100 /(C1+C2+C3+C4+nulo+branco) + "%");
            
        tec.close();   

        }

    }
