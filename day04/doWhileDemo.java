<<<<<<< HEAD
package Javatest.day04;
=======
package day04;
>>>>>>> df7dd1fbbff0ae26773b8801dd640e374f4f8e2c
import java.util.Scanner;
public class doWhileDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int pwd;
        do{
            System.out.println("请输入密码");
            pwd=scan.nextInt();
        }while (pwd!=123);
        System.out.println("结束");
    }
}
