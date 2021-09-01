package day03;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int age=scan.nextInt();
        boolean b1=age>=18 && age<=50;
        System.out.println(b1);
    }
}
