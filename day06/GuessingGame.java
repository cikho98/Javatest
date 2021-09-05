package Javatest.day06;
import java.util.*;


public class GuessingGame {
    public static void main(String[] args) {
        int count=0;
        char[] chs = generate();
        System.out.println(chs);
        System.out.println("游戏开始");
        Scanner scan=new Scanner(System.in);
        int i =0;
        while (i<5){
            String str=scan.next().toUpperCase();
            char[] answer = str.toCharArray();
            int[] result = check(chs,answer);
            if ("EXIT".equals(str)) {
                System.out.println("游戏结束");
                break;
            }
            if (result[1]==chs.length){
                int score=chs.length*100-count*10;
                System.out.println("恭喜你猜对了"+"分数"+score);
                break;
            }else {
                count++;
                System.out.println("字符对了"+result[0]+"个，位置对了"+result[1]);
            }
            i++;
        }
    }
    public static char[] generate(){
        char[] chs=new char[5];
        Random ran=new Random();
        char[] letrers = {'A','B','C','D','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for (int i = 0; i < chs.length; i++) {
            int index = ran.nextInt(letrers.length);
            chs[i] = letrers[index];
            if (i!=0){
                for (int j = 0; j < i; j++) {
                    if (chs[i]==chs[j]){
                        i--;
                    }
                }
            }
        }
        return chs;
    }
    public static int[] check(char[] chs,char[] answer){
        int[] result = new int[2];
        for (int i = 0; i < chs.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (chs[i]==answer[j]){
                    if (chs[i]==answer[i]){
//                        System.out.println("位置也对了");
                        result[1]++;
                    }
//                    System.out.println("字母对了");
                    result[0]++;
                }
            }
        }
        return result;
    }
}
