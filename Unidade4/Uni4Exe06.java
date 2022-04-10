package Unidade4;

import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
    Scanner tec = new Scanner (System.in);
   
    char sexo = tec.next().charAt(0);
    sexo = Character.toUpperCase(sexo);
    
         if (sexo == 'M') {
            System.out.println("Masculino");
        }
        if (sexo == 'F') {
            System.out.println("Feminino");
        }
        if (sexo == 'I') {
            System.out.println("Não informado");
        } 
        if ( sexo !='M' && sexo !='F' && sexo!='I'){

        
       System.out.println( "Entrada Incorreta");
}
}
}
