package Javatest.day04;
import java.util.Scanner;

public class ForGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("游戏开始");
        int num = (int) (Math.random() * 1000 + 1);
        int guessmin = 0;
        int guessmax = 1000;
        int guessing = 0;
        int number = 1;
        System.out.println(num);
        System.out.println("请输入一个数字");
        int guess = scan.nextInt();
        while (guess != num) {
            if (number == 1) {
                if (guess == 0) {
                    System.out.println("游戏结束");
                    break;
                } else if (guess < num) {
                    System.out.println("数字太少了");
                    System.out.println(guess + "至" + guessmax);
                    guess= scan.nextInt();
                } else {
                    System.out.println("数字太大了");
                    System.out.println(0 + "至" + guess);
                    guess= scan.nextInt();
                }
                guessing=guess;
            } else {
                if (guess == 0) {
                    System.out.println("游戏结束");
                } else if (guess < num) {
                    System.out.println("数字太少了");
                    System.out.println(guess + "至" + guessing);
                    guess= scan.nextInt();
                } else {
                    System.out.println("数字太大了");
                    System.out.println(guessing + "至" + guess);
                    guess= scan.nextInt();
                }
                guessing=guess;
            }
            if (guess == num) {
                System.out.println("恭喜你猜对了");
                break;
            }
            number++;
        }
    }
}