package day05;
import java.util.Random;


public class sort {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Random ran=new Random();
        for (int i=0;i<10;i++){
            arr[i]= ran.nextInt(10);
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
               if (arr[j]>arr[j+1]){
                   int tem=arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=tem;
               }
           }
       }
        for (int f=0;f<arr.length;f++){
            System.out.print(arr[f]+"\t");
        }
    }
}
