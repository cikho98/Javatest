package day03;
import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;
public class CommandBySwtich {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入选择功能,0,1,2");
        int comand = scan.nextInt();
        switch(comand){
            case 1:
                System.out.println("显示全部据");
                break;
            case 2:
                System.out.println("查询登录记录");
                break;
            case 0:
                System.out.println("欢迎登录使用");
                break;
            default:
                System.out.println("请输入正确的号码");
        }
    }
}
