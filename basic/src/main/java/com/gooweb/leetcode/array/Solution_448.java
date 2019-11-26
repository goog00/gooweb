package com.gooweb.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 *  448 找到所有数组中消失的数字
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 *
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 *
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author sunteng
 * @create 2019-08-25 下午 3:18
 **/
public class Solution_448 {

    public List<Integer> findDisappearedNumbers(int[] nums){

        int len = nums.length;

        for(int i = 0; i < len; i++){
            while (nums[i] != i + 1 && nums[nums[i] -1] != nums[i]){
                swap(nums,i,nums[i] - 1);
            }
        }

        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                res.add(i + 1);
            }
        }
        return res;
    }

    private void swap(int[] nums,int i ,int j){
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
}
