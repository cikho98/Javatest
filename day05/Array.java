package Javatest.day05;
import java.util.Random;


public class Array {
    public static void main(String[] args) {
        int[] ran=new int[5];
        for (int i=0;i<ran.length;i++){
            ran[i]=(int)(Math.random()*100+1);
        }
        int max=ran[0];
        for (int g=1;g<ran.length;g++){
            System.out.println(ran[g]);
            if (max<=ran[g]){
                max=ran[g];
            }
        }
        System.out.println("max="+max);
    }
}
