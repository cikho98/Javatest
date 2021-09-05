package Javatest.day04;
import java.util.Scanner;
public class ForDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
        for (int i=0;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
