package Javatest.day06;
import java.util.Arrays;
import java.util.Random;

public class Minarr {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Random ran=new Random();
        int max=100;//此值random最大值，可修改变更
        int min=max;//赋值min作判断
        for (int i=0;i<arr.length;i++){
            arr[i]=ran.nextInt(max);
            System.out.println(arr[i]);
            if (arr[i]<min){
                min=arr[i];
                System.out.println("最小值"+min);

            }
        }
        int [] arr2=new int[arr.length+1];
        System.arraycopy(arr,0,arr2,1,arr.length);
        arr2[0]=min;
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+"\t");
        }
    }
}
