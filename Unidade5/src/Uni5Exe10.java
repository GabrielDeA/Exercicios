package Unidade5;
/*
VERIFICAR EXEMPLOS NO GITHUB
30+25=55²=3025
20+25=45²=2025
98+01=99²=9801

.substring(0,2)=1,2
.charAt(teclado.length()-1)=4
*/

public class Uni5Exe10b {
    public static void main(String[] args) {
       for (int contador = 0; contador < 1000000; contador++) {
         
        int parte1 = contador / 100;
            double parte2 = (contador % 100);
            
            double raiz = Math.sqrt(contador);

            double soma = parte1 + parte2;
           if (raiz == soma) {  
               System.out.println(contador);
            }
               
           // if (Math.sqrt(contador)==(parte1+parte2)){
             
             //}
             // if(Math.sqrt(contador)==Math.pow((parte1+parte2),2)){
            
                //}
        
             }
    }
    
}