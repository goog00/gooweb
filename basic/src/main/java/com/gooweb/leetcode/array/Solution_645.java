package com.gooweb.leetcode.array;

/**
 *
 * 集合 S 包含从1到n的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，
 * 导致集合丢失了一个整数并且有一个元素重复。
 *
 * 给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/set-mismatch
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author steng
 * @date 2020-11-30 11:27
 **/
public class Solution_645 {

    public int[] findErrorNums(int[] nums) {
        int dup = -1;
        int missing = -1;

        for(int i = 1; i< nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length;j++){
                if(nums[j] == i){
                    count++;
                }
            }

            if(count == 2){
                dup = i;
            } else {
                missing = i;
            }
        }
        return new int[]{dup,missing};
    }
}
