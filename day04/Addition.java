package Javatest.day04;
import  java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int score = 0;
        Scanner scan=new Scanner(System.in);
        for (int i=1;i<=10;i++) {
            int a = (int) (Math.random() * 10 + 1), b = (int) (Math.random() * 10 + 1);
            int result = a + b;
            System.out.println("第"+i+"道题"+"."+a + "+" + b + "" + "=");
            int answer = scan.nextInt();
            if (answer==-1){
                System.out.println("答题结束");
                break;
            }else if (answer==result){
                System.out.println("恭喜你答对了奖励你一分");
                score++;
            }else if (answer!=result){
                System.out.println("你答错了，扣掉一分");
                score--;
            }
        }
        System.out.println(score);
    }
}
