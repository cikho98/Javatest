<<<<<<< HEAD
package Javatest.day04;
=======
package day04;
>>>>>>> df7dd1fbbff0ae26773b8801dd640e374f4f8e2c
import java.util.Scanner;

public class doWhileguess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int) (Math.random() * 1000 + 1);
        System.out.println(num);
        int usernum;
        do{
            System.out.println("请输入一个数字");
            usernum= scan.nextInt();
            if (usernum==0){
                System.out.println("猜游戏结束");
                break;

            } else if (usernum==num) {
                System.out.println("恭喜你猜对了");
                break;
            } else if (usernum < num) {
                System.out.println("太少了");
                System.out.println(usernum+"至"+1000);
            } else{
                System.out.println("太大了");
                System.out.println(0+"至"+usernum);
            }
        }while (usernum!=num);

        System.out.println("下次再来");
    }
}
