package day03;
import java.util.Scanner;

public class Casheier {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("请输入单价：");
        double price=scan.nextDouble();
        System.out.println("请输入数量：");
        int amount=scan.nextInt();
        System.out.println("请输入付款金额：");
        double money=scan.nextDouble();

        double totalprice=price*amount;
        double acount=0.8;
        if (totalprice>=500) {
            totalprice = totalprice * 0.8;
        }
        if (totalprice<=money){
            double change=money-totalprice;
            System.out.println("应付金额："+totalprice);
            System.out.println("找零："+change);
        } else{
            System.out.println("你给的钱不够");
        }
    }
}

