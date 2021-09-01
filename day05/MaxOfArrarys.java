package day05;

import java.util.Arrays;

public class MaxOfArrarys {
    public static void main(String[] args) {
        int[] a=new int[10];
        int max=0;
        for (int i=0;i<10;i++){
            a[i]=(int)(Math.random()*100+1);
            System.out.println(a[i]);
            if (max<a[i]){
                max=a[i];
            }
        }
        System.out.println("max="+max);
        int[] a1= Arrays.copyOf(a,a.length+1);
        a1[a1.length-1]=max;
        System.out.println("第二组");
        for (int f=0;f<a1.length;f++){
            System.out.println(a1[f]);
        }
    }
    }

