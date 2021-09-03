package Javatest.day05;

import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
//        int[] a1=new int[6];
//        System.arraycopy(a,1,a1,0,4);
        int[] a1= Arrays.copyOf(a,6);
        for (int i=0;i<a1.length;i++){
            System.out.println(a1[i]);
        }
    }
}
