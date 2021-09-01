package day06;
import day05.Array;

import java.util.Random;
public class DelectInt {
    public static void main(String[] args) {
        Random ran=new Random();
        int num=10;//数组的个数的变量
        int Ints=2;//第几位数进行删除变量
        int[] arr = new int[num];
        for (int i=0;i<10;i++){
            arr[i]=ran.nextInt(100);
            System.out.print(arr[i]+"\t");
        }
        int[] arr2=new int[num-1];
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i >= Ints && i< arr.length-1){
                arr2[i]=arr[i+1];
            }
            else if (i<Ints) {
                arr2[i]=arr[i];
            }
            else if (i==arr.length-1){
                break;
            }
            System.out.print(arr2[i]+"\t");
        }
    }
}
