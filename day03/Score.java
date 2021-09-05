<<<<<<< HEAD
package Javatest.day03;
=======
package day03;
>>>>>>> df7dd1fbbff0ae26773b8801dd640e374f4f8e2c
import java.util.Scanner;


public class Score {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入分数：");
        double score=scan.nextDouble();
        if (score<0 || score>100){
            System.out.println("你的成绩不合法");
        } else if (score>=90){
            System.out.println("优秀");
        } else if (score>=80 && score<90){
            System.out.println("良好");
        } else if (score>=60 && score<80){
            System.out.println("及格");
        } else {
            System.out.println("分数不合格");
        }
    }
}
