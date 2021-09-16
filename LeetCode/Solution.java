package Javatest.LeetCode;
//数组反转
public class Solution {
    public static void main(String[] args) {
        int num=466;
        int end;
        end=reverse(num);
    }
    public static int reverse(int number) {
        int end;
        if (number<0){
            number=number*-1;
            String str = Integer.toString(number);;
            end = Integer.parseInt(str);
        }else {
            String str = Integer.toString(number);;
            end = Integer.parseInt(str);
//            for (int i = 0; i < str.length; i++) {
//                System.out.print(array[i]);
//            }
        }
        return end;
    }
}
