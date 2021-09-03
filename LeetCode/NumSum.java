package Javatest.LeetCode;

public class NumSum {
    public static void main(String[] args) {
        int[] nums ={0,1,2,3,4,5,2,3,3,1};
        int targets=4;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length-i-1;j++){
                if (nums[i] == nums[j]){
                    continue;
                } else if (nums[i] + nums[j] == targets){
                    System.out.println(nums[i]+"\t"+nums[j]);
                }
            }
        }
    }
}
