package Javatest.day04;
import java.util.Scanner;


public class GuessGameWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=(int) (Math.random()*1000+1);
        System.out.println(num);
        System.out.println("请输入一个数字");
        int usernum= scan.nextInt();
        while (usernum!=num){
            if (usernum==0){
                System.out.println("猜游戏结束");
                break;
            } else if (usernum < num) {
                System.out.println("太少了");
                System.out.println(usernum+"至"+1000);
            }else{
                System.out.println("太大了");
                System.out.println(0+"至"+usernum);
            }
            System.out.println("不是我想要的数字");
            usernum= scan.nextInt();
        }
        if (usernum==num) {
            System.out.println("恭喜你猜对了");
        }
        System.out.println("下次再来");
    }
}
