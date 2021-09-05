package Javatest.day03;

public class OpertorDemo {
    public static void main(String[] args){
        int a=5;
        a++;
        System.out.println(a);//6
        ++a;
        System.out.println(a);//7/
        int b=5,c=b++;
        System.out.println(b);//6
        System.out.println(c);//5
        int d=5,e=++d;
        System.out.println(d);//6
        System.out.println(e);//6
        int m=5,n=5;
        System.out.println(m++);//5
        System.out.println(++n);//6
    }
}
