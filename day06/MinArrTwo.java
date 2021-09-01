package day06;
import java.util.Arrays;
import java.util.Random;


public class MinArrTwo {
    public static void main(String[] args) {
        Random ran=new Random();
        int[] arr=new int[10];
        int min=100;
        for (int i=0;i<10;i++){
            arr[i]= ran.nextInt(100);
            if (min>arr[i]){
                min=arr[i];
            }
        }
        int[] arr2= Arrays.copyOf(arr,arr.length+1);
        for (int i=arr2.length-1;i>0;i--){
            arr2[i]=arr2[i-1];
        }
        arr2[0]=min;
        for (int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
