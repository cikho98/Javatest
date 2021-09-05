<<<<<<< HEAD
package Javatest.day03;
=======
package day03;
>>>>>>> df7dd1fbbff0ae26773b8801dd640e374f4f8e2c
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int age=scan.nextInt();
        boolean b1=age>=18 && age<=50;
        System.out.println(b1);
    }
}
