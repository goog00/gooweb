package com.gooweb.leetcode.array;


/**
 *
 * 198. 打家劫舍
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author sunteng
 * @create 2019-08-23 上午 8:58
 **/
public class Solution_198 {

    public int rob(int[] num){
        //记录上一次的最大和
        int prevMax = 0;
        //上一次最大和加上当前变量 与
        int currMax = 0;
        for(int x : num){
            int temp = currMax;

            currMax = Math.max(prevMax + x ,currMax);

            prevMax = temp;
        }
        return currMax;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5};
        Solution_198 test = new Solution_198();
        int rob = test.rob(arr);
        System.out.println(rob);
    }
}
