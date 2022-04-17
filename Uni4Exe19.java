package Unidade4;
import java.util.Scanner;
public class Uni4Exe19 {
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double x,y;
        x = tec.nextDouble();
        y = tec.nextDouble();
         if(x == 0 && y ==0){
            System.out.println("0");
        }else if(x>0 && y>0){
            System.out.println("1");
        }else if(x<0 && y>0){
            System.out.println("2");
        }else if(x<0 && y<0){
            System.out.println("3");
        }else if(x>0 && y<0){
            System.out.println("4");
        }else{
        }

     tec.close();
    }
}
