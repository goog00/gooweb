package com.gooweb.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 448 找出所有数组中消失的数字
 *
 * @author sunteng
 * @create 2019-08-25 下午 3:35
 **/
public class Solution_448_2 {

    /**
     * 把每个数字放在它应该出现的位置上。
     * @param nums
     * @return
     */

    public List<Integer> findDisappearedNumbers(int[] nums){

        for(int i = 0; i < nums.length; i++){
            //
            int loc = nums[i];
            if(loc == -1 || i == loc -1){
                //
                i++;
                continue;
            }
            if(nums[loc -1] == loc){
                nums[i] = -1;
                i++;
                continue;
            }

            int temp = nums[loc - 1];
            nums[loc-1] = nums[i];
            nums[i] = temp;
        }

        List<Integer> ans = new ArrayList<>(nums.length);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == -1){
                ans.add(i + 1);
            }

        }
        return ans;
    }
}