package com.gooweb.leetcode.array;

/**
 *  给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author sunteng
 * @create 2019-08-21 上午 9:12
 **/
public class Solution_26 {

    public static int removeDuplicates(int[] nums) {

        if(nums.length <= 1){
            return nums.length;
        }
        //慢指针
        int slow = 0;
        for(int fast = 1; fast < nums.length; fast++){
            if(nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1};
        int length = removeDuplicates(arr);
        System.out.println("length = " + length);
        for(int k : arr){
            System.out.println(k);
        }
    }
}


